package logic.command.actioncomandimpl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.Preservation;
import model.entity.basicentity.BasicEntity;

import org.apache.log4j.Logger;

public class DeleteEntity extends BasicCommand {
	private int idDelete;
	private List<? extends BasicEntity> listEntity;
	private String partPage = "tableShow/table";
	public DeleteEntity(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
		listEntity = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		Preservation entity = jpa.find(Preservation.class, idDelete);
		if(entity==null)
			return null;
		entity.setVolume(0);
		jpa.update(entity);
		listEntity = jpa.findAllPreservation();
		return partPage+Preservation.class.getSimpleName();
	}

	@Override
	public void insertInRequest() {
		request.setAttribute("listEntity",listEntity);
	}

	@Override
	public boolean parseValidate() {
		Logger log = Logger.getLogger(getClass());
		String delete = request.getParameter("delete");
		log.debug("deleteLine="+delete);
		if(delete==null)
			return false;
		idDelete = Integer.valueOf(delete);
		
		return true;
	}

}
