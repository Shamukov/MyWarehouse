package logic.command.actioncomandimpl.persistentity;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.OrderGoods;
import model.entity.Preservation;

import org.apache.log4j.Logger;

public class ShowDispatch extends BasicCommand {
	static final String PAGE = "tableInsert/dispatch";
	Logger log = Logger.getLogger(getClass());

	private List<OrderGoods> listOrderGoods;
	private List<Preservation> listPreservation;

	public ShowDispatch(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
		listOrderGoods = new ArrayList<>();
		listPreservation = new ArrayList<>();

	}

	@Override
	public String execute() {
		log.trace("executeShowDispatch");
		listOrderGoods = jpa.findAll(OrderGoods.class);
		listPreservation = jpa.findPreservationCondition(-1);
		for (Preservation element : listPreservation) {
			log.debug(element);
		}
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute("listOrderGoods", listOrderGoods);
		request.setAttribute("listPreservation", listPreservation);
	}

	@Override
	public boolean parseValidate() {
		// TODO Auto-generated method stub
		return true;
	}
}
