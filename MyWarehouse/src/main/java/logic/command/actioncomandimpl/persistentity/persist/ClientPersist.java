package logic.command.actioncomandimpl.persistentity.persist;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.Client;

public class ClientPersist extends BasicCommand {

	public ClientPersist(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String score;
	private String address;
	static final String RESULTOPERATION="resultOperation";
	static final String PAGE="tableInsert/show/ResultOperation";
	@Override
	public String execute() {
		Client entity = new Client(0, name, score, address);
		jpa.persist(entity);
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute(RESULTOPERATION, "add new element");

	}

	@Override
	public boolean parseValidate() {
		name = request.getParameter("name");
		score = request.getParameter("score");
		address = request.getParameter("address");
		if(name==null||score==null||address==null)
			return false;
		return true;
	}


}
