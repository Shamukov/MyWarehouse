package logic.command.actioncomandimpl.show;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.Preservation;
import model.entity.basicentity.BasicEntity;

import org.apache.log4j.Logger;

public class ShowTable extends BasicCommand {

	static final String NAMEENTITY = "nameEntity";
	static final String TYPECLASS = "TYPECLASS";
	static final String LISTENTITY = "listEntity";
	
	private String partPage = "tableShow/table"; 
	private Class<? extends BasicEntity> entityClass;
	private List<? extends BasicEntity> list;
	public ShowTable(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
		list = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		partPage+=entityClass.getSimpleName();
		if(entityClass.equals(Preservation.class))
			list = jpa.findAllPreservation();
		else 
		list = jpa.findAll(entityClass);
		for (BasicEntity basicEntity : list) {
			Logger.getLogger(getClass()).debug(basicEntity.toString());
		}
			
		return partPage;
	}

	@Override
	public void insertInRequest() {
			request.setAttribute(LISTENTITY, list);
			request.setAttribute("i", "0");
	}

	@Override
	public boolean parseValidate() {
		String nameEntityValue = request.getParameter(NAMEENTITY);
		if(nameEntityValue==null || nameEntityValue.isEmpty())
			return false;
		entityClass = jpa.getEntityClass(nameEntityValue);
		
		if(entityClass!=null)
		return true;
		else return false;
	}

}
