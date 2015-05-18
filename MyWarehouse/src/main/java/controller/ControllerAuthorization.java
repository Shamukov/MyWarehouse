package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(urlPatterns = { "/LoginController" })
public class ControllerAuthorization extends HttpServlet {
	private static final long serialVersionUID = -3570233521692067820L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Logger.getLogger(getClass()).trace("");
		Logger.getLogger(getClass()).trace("ControllerAuthorization.doPost()");
		// TODO Auto-generated method stub
		
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("user")){
					request.getRequestDispatcher("/jsp/MainPage.jsp").forward(request,
							response);
					return;
				}
					
					
			}
		}
		String login = (String) request.getParameter("user");
		String psw = (String) request.getParameter("pwd");
		
		if (login != null && psw != null && login.equals("user")
				&& psw.equals("test")) {
			Cookie cookie = new Cookie("user", login);
			cookie.setMaxAge(30 * 60);
			response.addCookie(cookie);
			
			request.getRequestDispatcher("/jsp/MainPage.jsp").forward(request,
					response);
		} else {
			// response error
			request.setAttribute("command", "ERRORCOMMAND");
			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/jsp/error.jsp");
			dispatcher.forward(request, response);

		}
	}
}
