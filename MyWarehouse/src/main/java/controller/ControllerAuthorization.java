package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/LoginController" })
public class ControllerAuthorization extends HttpServlet {
	private static final long serialVersionUID = -3570233521692067820L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

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
			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/login.html");
			PrintWriter printWriter = response.getWriter();
			printWriter
					.println("<font color=red>Either user name or password is wrong.</font>");
			dispatcher.include(request, response);

		}
	}
}
