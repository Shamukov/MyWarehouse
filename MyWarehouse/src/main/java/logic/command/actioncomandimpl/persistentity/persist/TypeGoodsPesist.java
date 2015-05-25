package logic.command.actioncomandimpl.persistentity.persist;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.TypeGoods;

public class TypeGoodsPesist extends BasicCommand {

	public TypeGoodsPesist(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		// TODO Auto-generated constructor stub
	}

	private String name;
	static final String RESULTOPERATION = "resultOperation";
	static final String PAGE = "tableInsert/show/ResultOperation";

	@Override
	public String execute() {
		TypeGoods entity = new TypeGoods(0, name);
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
		org.apache.log4j.Logger.getLogger(getClass()).debug("имя="+name);
		if (name == null||name.isEmpty())
			return false;
		return true;
	}

}
