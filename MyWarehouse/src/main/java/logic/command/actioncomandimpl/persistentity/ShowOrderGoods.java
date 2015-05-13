package logic.command.actioncomandimpl.persistentity;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.Client;

public class ShowOrderGoods extends BasicCommand {
	private List<Client> listClient;
	static final String PAGE = "tableInsert/orderGoods";
	public ShowOrderGoods(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		listClient=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		listClient = jpa.findAll(Client.class);
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute("listClient", listClient);

	}

	@Override
	public boolean parseValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
