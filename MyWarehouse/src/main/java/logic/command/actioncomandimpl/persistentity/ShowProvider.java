package logic.command.actioncomandimpl.persistentity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;

public class ShowProvider extends BasicCommand {
	public ShowProvider(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
		// TODO Auto-generated constructor stub
	}
	static final String PAGE = "tableInsert/provider";
	

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		
		
	}

	@Override
	public boolean parseValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
