package logic.command.actioncomandimpl;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;

public class MainPage extends BasicCommand {
	public MainPage(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertInRequest() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean parseValidate() {
		// TODO Auto-generated method stub
		return false;
	}

	public final String page = "MainPage";
}
