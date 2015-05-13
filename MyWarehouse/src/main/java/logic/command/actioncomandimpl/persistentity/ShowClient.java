package logic.command.actioncomandimpl.persistentity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;

public class ShowClient extends BasicCommand {
	static final String PAGE = "tableInsert/client";
	public ShowClient(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean parseValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
