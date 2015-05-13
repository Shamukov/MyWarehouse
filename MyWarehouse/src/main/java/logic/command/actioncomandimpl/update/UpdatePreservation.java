package logic.command.actioncomandimpl.update;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.Preservation;
import model.entity.Sector;

import org.apache.log4j.Logger;

public class UpdatePreservation extends BasicCommand {
	public UpdatePreservation(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		// TODO Auto-generated constructor stub
	}

	private int volume;
	private int preservationId;
	private int sectorId;

	static final String RESULTOPERATION = "resultOperation";
	static final String PAGE = "tableInsert/show/ResultOperation";

	@Override
	public String execute() {
		Preservation entity = jpa
				.find(Preservation.class, preservationId);
		Sector sector = jpa.find(Sector.class, sectorId);
		Logger.getLogger(getClass()).debug(
				"sector = " + sector + " elementParty= " + entity);
		if (sector == null || entity == null)
			return null;
		entity.setSector(sector);
		entity.setVolume(volume);
		
		jpa.update(entity);
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute(RESULTOPERATION, "UPDATE ELEMENT" + "volume="
				+ volume + "elementParty=" + preservationId + "sectorId="
				+ sectorId);

	}

	@Override
	public boolean parseValidate() {
		try {
			String linevolume = request.getParameter("volume");
			if (linevolume == null)
				return false;
			volume = Integer.valueOf(linevolume);

			String idLine = request.getParameter("id");
			if (idLine == null)
				return false;
			preservationId = Integer.valueOf(idLine);

			String sector = request.getParameter("sector");
			if (sector == null)
				return false;
			sectorId = Integer.valueOf(sector);

			Logger.getLogger(getClass()).debug(
					" volume=" + volume + "preservationId=" + preservationId
							+ "sectorId=" + sectorId);
		} catch (NumberFormatException ex) {
			Logger.getLogger(getClass()).error("error format ", ex);
			return false;
		}

		return true;
	}

}
