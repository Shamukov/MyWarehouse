package logic.command.actioncomandimpl.show;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;

public class ShowAllEntity extends BasicCommand {

	public final String PAGE = "tableShow/allNameEntity";
	public final static String ALLNAMEENTITY = "allNameEntity";
	private ArrayList<String> list;
	
	public ShowAllEntity(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		list = new ArrayList<String>();
		
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
//		list = new PersonJpa().getAllNameEntity();
		list.add("Client");
		list.add("Preservation");
		list.add("Goods");
		list.add("ElementOrderGoods");
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		ArrayList<String> defaultList = new ArrayList<String>();
		for (String string : list) {
			System.out.println(string);
		}
		
		
		request.setAttribute(ALLNAMEENTITY, list);
	}

	@Override
	public boolean parseValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
