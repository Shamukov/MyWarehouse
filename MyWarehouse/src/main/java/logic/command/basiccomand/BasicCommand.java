package logic.command.basiccomand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.actioncommand.ActionCommand;
import dao.jpaimpl.PersonJpa;

public abstract class BasicCommand implements ActionCommand {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected PersonJpa jpa;
	public BasicCommand(HttpServletRequest request, HttpServletResponse response) {
		super();
		this.request = request;
		this.response = response;
		jpa = new PersonJpa();
	}

}
