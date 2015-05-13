package logic.command.actioncomandimpl.update;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.Preservation;
import model.entity.Sector;

import org.apache.log4j.Logger;

public class ShowUpdatePreservation extends BasicCommand {
	private Preservation preservation;
	private List<Sector> listSector;
	private String PAGE = "tableUpdate/updatePreservation";
	public ShowUpdatePreservation(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		listSector = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	private int idupdate;

	@Override
	public String execute() {
		preservation= jpa.find(Preservation.class, idupdate);
		listSector = jpa.findAll(Sector.class);
		if(preservation==null)
			return null;
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute("preservation", preservation);
		request.setAttribute("listSector", listSector);
	}

	@Override
	public boolean parseValidate() {
		Logger log = Logger.getLogger(getClass());
		String update = request.getParameter("update");
		log.debug("updateLine="+update);
		if(update==null)
			return false;
		idupdate = Integer.valueOf(update);
		
		return true;
	}
}
