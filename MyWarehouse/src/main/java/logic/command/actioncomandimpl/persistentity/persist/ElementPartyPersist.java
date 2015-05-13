package logic.command.actioncomandimpl.persistentity.persist;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.ElementParty;
import model.entity.Goods;
import model.entity.PartyGoods;

public class ElementPartyPersist extends BasicCommand {

	public ElementPartyPersist(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		// TODO Auto-generated constructor stub
	}

	private int number;
	private int goodsId;
	private int partyGoodsId;
	static final String RESULTOPERATION = "resultOperation";
	static final String PAGE = "tableInsert/show/ResultOperation";

	@Override
	public String execute() {
		PartyGoods partyGoods = jpa.find(PartyGoods.class, partyGoodsId);
		Goods goods = jpa.find(Goods.class, goodsId);
		if(partyGoods==null)
			return null;
		if(goods==null)
			return null;
		ElementParty entity = new ElementParty(0, number, partyGoods, partyGoods.getProvider(),goods.getTypeGoods() , goods);
		jpa.persist(entity);
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute(RESULTOPERATION, "add new element");

	}

	@Override
	public boolean parseValidate() {
		  String numberLine=request.getParameter("number");
		if (numberLine == null)
			return false;
		number= Integer.valueOf(numberLine);
		
		String partyGoods= request.getParameter("partyGoods");
		if (partyGoods == null)
			return false;
		partyGoodsId = Integer.valueOf(partyGoods);
		
		String goods= request.getParameter("goods");
		if (goods == null)
			return false;
		goodsId = Integer.valueOf(goods);
		return true;
	}

}
