package logic.command.actioncomandimpl.persistentity.persist;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.basiccomand.BasicCommand;
import model.entity.Client;
import model.entity.OrderGoods;

public class OrderGoodsPersist extends BasicCommand {
	private int clientId;
	private Date orderDate;

	static final String RESULTOPERATION = "resultOperation";
	static final String PAGE = "tableInsert/show/ResultOperation";

	public OrderGoodsPersist(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		Client client = jpa.find(Client.class, clientId);
		OrderGoods entity = new OrderGoods(0, orderDate, client);
		jpa.persist(entity);
		return PAGE;
	}

	@Override
	public void insertInRequest() {
		request.setAttribute(RESULTOPERATION, "add new element");

	}

	@Override
	public boolean parseValidate() {
		String dateLine = request.getParameter("orderDate");
		String rex = "^(\\d{1,2}), (\\d{1,2}), (\\d{4})";
		Pattern pat = Pattern.compile(rex);
		Matcher mStart = pat.matcher(dateLine);
		if (!mStart.matches())
			return false;
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.valueOf(mStart.group(3)),
				Integer.valueOf(mStart.group(2))-1,
				Integer.valueOf(mStart.group(1)));
		orderDate = cal.getTime();
		String client = request.getParameter("client");
		clientId = Integer.valueOf(client);
		return true;
	}
}
