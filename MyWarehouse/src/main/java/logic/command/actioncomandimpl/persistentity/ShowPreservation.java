package logic.command.actioncomandimpl.persistentity;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.ElementParty;
import model.entity.Sector;

public class ShowPreservation extends BasicCommand {
	static final String PAGE = "tableInsert/preservation";
	List<Sector> listSector;
	List<ElementParty> listElementParty;
	

	public ShowPreservation(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		listSector = new ArrayList<>();
		listElementParty = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		listElementParty = jpa.findAll(ElementParty.class);
		listSector = jpa.findAll(Sector.class);
		for (int i = 0;i < listElementParty.size();i++){
			if(listElementParty.get(i).getNumber()==0){
				listElementParty.remove(i);
				i--;
			}
			
		}
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute("listElementParty", listElementParty);
		request.setAttribute("listSector", listSector);
	}

	@Override
	public boolean parseValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
