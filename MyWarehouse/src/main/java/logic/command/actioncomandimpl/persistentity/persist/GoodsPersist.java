package logic.command.actioncomandimpl.persistentity.persist;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.Goods;
import model.entity.TypeGoods;

public class GoodsPersist extends BasicCommand {

	public GoodsPersist(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
		// TODO Auto-generated constructor stub
	}

	private String definition;
	private int typeGoodsId;
	static final String RESULTOPERATION = "resultOperation";
	static final String PAGE = "tableInsert/show/ResultOperation";

	@Override
	public String execute() {
		TypeGoods type = jpa.find(TypeGoods.class,typeGoodsId);
		if(type==null)
			return null;
		Goods entity = new Goods(0, definition,type);
		jpa.persist(entity);
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute(RESULTOPERATION, "add new element");

	}

	@Override
	public boolean parseValidate() {
		  definition= request.getParameter("definition");
		if (definition == null)
			return false;
		String typeGoods= request.getParameter("typeGoods");
		if (typeGoods == null)
			return false;
		typeGoodsId = Integer.valueOf(typeGoods);
		return true;
	}


}
