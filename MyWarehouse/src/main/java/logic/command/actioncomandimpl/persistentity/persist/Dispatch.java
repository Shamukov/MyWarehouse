package logic.command.actioncomandimpl.persistentity.persist;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.ElementOrderGoods;
import model.entity.OrderGoods;
import model.entity.Preservation;

import org.apache.log4j.Logger;

public class Dispatch extends BasicCommand {

	private int number;
	private int orderGoodsId;
	private int preservationId;
	private String result ="";
	static final String RESULTOPERATION = "resultOperation";
	static final String PAGE = "tableInsert/show/ResultOperation";

	public Dispatch(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		OrderGoods or = jpa.find(OrderGoods.class, orderGoodsId);
		Preservation preservation = jpa.find(Preservation.class, preservationId);
		Logger.getLogger(getClass()).debug("or = "+or+" preservation= "+preservation);
		if(or ==null || preservation==null)
			return null;
		if(preservation.getVolume()>=number){
			
			ElementOrderGoods element = new ElementOrderGoods(0, number, or, preservation);
			preservation.setVolume(preservation.getVolume()-number);
			
			jpa.persist(element);
			jpa.update(preservation);
			result="add order";
		}else {
			result="don't have a number of goods";
		}
		
		
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute(RESULTOPERATION, result);

	}

	@Override
	public boolean parseValidate() {

		try {
			String lineNumber = request.getParameter("number");
			if (lineNumber == null)
				return false;
			number = Integer.valueOf(lineNumber);
			
			String orderGoods = request.getParameter("orderGoods");
			if (orderGoods == null)
				return false;
			orderGoodsId = Integer.valueOf(orderGoods);

			String preservation = request.getParameter("preservation");
			if (preservation == null)
				return false;
			preservationId = Integer.valueOf(preservation);
			
			Logger.getLogger(getClass()).debug("orderGoodsId="+orderGoodsId+"preservationId="+preservationId);
		} catch (NumberFormatException ex) {
			Logger.getLogger(getClass()).error("error format ", ex);
			return false;
		}
		return true;
	}

}
