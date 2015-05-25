package logic.command.actioncomandimpl.persistentity.persist;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.ElementParty;
import model.entity.Preservation;
import model.entity.Sector;

import org.apache.log4j.Logger;

public class PreservationPersist extends BasicCommand {

	public PreservationPersist(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		// TODO Auto-generated constructor stub
	}

	private int volume;
	private int elementPartyId;
	private int sectorId;

	static final String RESULTOPERATION = "resultOperation";
	static final String PAGE = "tableInsert/show/ResultOperation";

	@Override
	public String execute() {
		ElementParty elementParty = jpa
				.find(ElementParty.class, elementPartyId);
		//прописать 
		Sector sector = jpa.find(Sector.class, sectorId);
		Logger.getLogger(getClass()).debug(
				"sector = " + sector + " elementParty= " + elementParty);
		if (sector == null || elementParty == null)
		return null;
		if(elementParty.getNumber()-volume<0){
			return "errorData";
			
		}
		elementParty.setNumber(elementParty.getNumber()-volume);
		jpa.update(elementParty);
		Preservation element = new Preservation(0, volume, sector, elementParty);
		jpa.persist(element);
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute(RESULTOPERATION, "add new element " + "volume="
				+ volume + "elementParty=" + elementPartyId + "sectorId=" + sectorId);

	}

	@Override
	public boolean parseValidate() {
		try {
			String linevolume = request.getParameter("volume");
			if (linevolume == null)
				return false;
			volume = Integer.valueOf(linevolume);

			String elementParty = request.getParameter("elementParty");
			if (elementParty == null)
				return false;
			elementPartyId = Integer.valueOf(elementParty);

			
			String sector = request.getParameter("sector");
			if (sector == null)
				return false;
			sectorId = Integer.valueOf(sector);

			Logger.getLogger(getClass()).debug(" volume="
					+ volume+"elementPartyId=" + elementPartyId + "sectorId=" + sectorId);
		} catch (NumberFormatException ex) {
			Logger.getLogger(getClass()).error("error format ", ex);
			return false;
		}
		
		return true;
	}

}
