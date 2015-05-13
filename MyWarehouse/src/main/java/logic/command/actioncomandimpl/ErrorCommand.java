package logic.command.actioncomandimpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;

public class ErrorCommand extends BasicCommand {
	static final String PAGE = "error";
	public static final String ERRORSTRING = "error";
	private String message;

	public ErrorCommand(HttpServletRequest request,
			HttpServletResponse response) {
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
		request.setAttribute(ERRORSTRING, message);
	}

	@Override
	public boolean parseValidate() {
		// TODO Auto-generated method stub
		return true;
	}

	public ErrorCommand(HttpServletRequest request,
			HttpServletResponse response, String message) {
		super(request, response);
		this.message = message;
	}

	
}
