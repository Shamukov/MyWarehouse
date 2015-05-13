package logic.command.actioncomandimpl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.Preservation;

import org.apache.log4j.Logger;

public class Search extends BasicCommand {
	private int count;
	@SuppressWarnings("unused")
	private String name;
	boolean flagEmptyName = false;

	public Search(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
		list = new ArrayList<>();
	}

	private String partPage = "tableShow/tablePreservation";
	private List<Preservation> list;
	private int idName;

	@Override
	public String execute() {

		list = jpa.findPreservationCondition(count);
		for (Preservation preservation : list) {
			Logger.getLogger(getClass()).debug(preservation);
		}

		if (!flagEmptyName)
			for (int i = 0;i < list.size();i++) {

				if (list.get(i).getElementParty().getGoods().getId() != idName)
				{
					list.remove(i);
					i--;
				}
			}
		return partPage;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute("listEntity", list);
	}

	@Override
	public boolean parseValidate() {
		try{
		String countLine = request.getParameter("count");
		if (countLine != null&&!countLine.isEmpty())
				count = Integer.valueOf(countLine);
		else
			count = -1;
		System.out.println("count ="+count);
		
		String nameLine = request.getParameter("name");
		if (count < 0 &&nameLine == null)
			return false;
		if(nameLine.isEmpty())
		{
			flagEmptyName=true;
		}
			idName = jpa.findNameId(nameLine);
		Logger.getLogger(getClass()).debug(
				"idName= " + idName + " count=" + count);
		}catch(NumberFormatException ex){
			return false;
		}
		if(idName == -1&& count ==-1)return false;
	
		return true;

	}
}
