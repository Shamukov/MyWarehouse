package logic.command.actioncomandimpl.persistentity;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.Goods;
import model.entity.PartyGoods;

public class ShowElementParty extends BasicCommand {

	static final String PAGE = "tableInsert/elementParty";
	List<PartyGoods> listPartyGoods;
	List<Goods> listGoods;

	public ShowElementParty(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		listPartyGoods = new ArrayList<PartyGoods>();
		listGoods = new ArrayList<Goods>();
	}

	@Override
	public String execute() {
		listPartyGoods = jpa.findAll(PartyGoods.class);
		listGoods = jpa.findAll(Goods.class);
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute("listPartyGoods", listPartyGoods);
		request.setAttribute("listGoods", listGoods);
	}

	@Override
	public boolean parseValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
