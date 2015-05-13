package logic.command.actioncomandimpl.persistentity;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.TypeGoods;

public class ShowGoods extends BasicCommand {

	public ShowGoods(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
		listTypeGoods = new ArrayList<>();
	}

	private List<TypeGoods> listTypeGoods;

	static final String PAGE = "tableInsert/goods";

	@Override
	public String execute() {
		listTypeGoods= jpa.findAll(TypeGoods.class);
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute("listTypeGoods", listTypeGoods);
	}

	@Override
	public boolean parseValidate() {
		return true;
	}

}
