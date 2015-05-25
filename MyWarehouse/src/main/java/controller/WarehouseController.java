package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.actioncomandimpl.ErrorCommand;
import logic.command.actioncomandimpl.ErrorCommandParse;
import logic.command.basiccomand.BasicCommand;
import model.Enums.MethodCommand;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import dao.jpaimpl.PersonJpa;

@WebServlet(urlPatterns = { "/controller" })
public class WarehouseController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public static final String FILELOGGERNAME = "/WEB-INF/classes/properties/log4j.xml";
	private static Logger log;
	private final String COMMANDSTRING = "command";

	@Override
	public void init() throws ServletException {
		new DOMConfigurator().doConfigure(
				getServletContext().getRealPath(FILELOGGERNAME),
				org.apache.log4j.LogManager.getLoggerRepository());
		log = Logger.getLogger(getClass());
		new PersonJpa();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		new PersonJpa().close();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		processRequest(req, resp);
	}

	private void processRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		BasicCommand basicCommand = null;
		String page = null;
		log.info("");
		log.info("WarehouseController.processingrequest()");

		if (!checkCookie(req))
			basicCommand = setCommandError("check error of cookie", req, resp);
		log.info("validate authentication");

		if (basicCommand == null)
			basicCommand = getCommand(req, resp);
		log.debug("extract basic command:"
				+ basicCommand.getClass().getSimpleName());

		if (!basicCommand.parseValidate())
			basicCommand = setCommandErrorParse(
					"got a error in the parse or validate", req, resp);
		log.trace("validate and parse command");

		if ((page = basicCommand.execute()) == null)
			basicCommand = setCommandError("execute was got a error", req, resp);
		log.trace("execute page:" + page);

		basicCommand.insertInRequest();
		log.trace("insert attributes");

		forward(req, resp, page);

	}

	private BasicCommand setCommandErrorParse(String message,
			HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

		log.debug("message error=" + message);
		return new ErrorCommandParse(req, resp,
				message);
	}

	/**
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private BasicCommand getCommand(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		BasicCommand basicCommand;
		String commandValue = req.getParameter(COMMANDSTRING);
		if (commandValue == null || commandValue.isEmpty())
			return setCommandError("error not found the commandString", req,
					resp);
		commandValue = commandValue.toUpperCase();
		log.debug("extract commandString:" + commandValue);
		try {
			basicCommand = MethodCommand.valueOf(commandValue)
					.create(req, resp);
		} catch (IllegalArgumentException ex) {
			basicCommand = setCommandError("not found a command:"
					+ commandValue, req, resp);
		}
		return basicCommand;
	}

	/**
	 * 
	 */
	private boolean checkCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("user"))
					return true;
			}
		}
		return false;
	}

	private void forward(HttpServletRequest req, HttpServletResponse resp,
			String page) throws ServletException, IOException {
		// load in request response attributes
		getServletContext().getRequestDispatcher("/jsp/" + page + ".jsp")
				.forward(req, resp);
	}

	BasicCommand setCommandError(String message, HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		log.debug("message error=" + message);
		return new ErrorCommand(req, resp,
				message);
	}
}
