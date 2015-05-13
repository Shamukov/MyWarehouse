package logic.command.actioncomandimpl.show;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import dao.jpaimpl.PersonJpa;
/*
 * отображает все сущносит для вставки 
 */
public class ShowPersistEntity extends BasicCommand {

	public ShowPersistEntity(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		// TODO Auto-generated constructor stub
		list = new ArrayList<String>();
	}

	public final String PAGE = "tableInsert/allNameEntityForInsert";
	public final static String ALLNAMEENTITY = "allNameEntity";
	private ArrayList<String> list;

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		list = new PersonJpa().getAllNameEntity();
		int i = list.size();
		list.remove(i-1);
		list.remove(i-2);
		list.remove(3);
		list.remove(7);
		
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		// TODO Auto-generated method stub
		request.setAttribute(ALLNAMEENTITY, list);
		
		request.setAttribute("i", "0");
	}

	@Override
	public boolean parseValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
