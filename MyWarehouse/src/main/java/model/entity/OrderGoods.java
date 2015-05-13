package model.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import model.entity.basicentity.BasicEntity;

@Entity
public class OrderGoods extends BasicEntity {

	@Temporal(TemporalType.DATE)
	private Date dateOrder;
	@OneToOne
	private Client client;

	public OrderGoods() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result
				+ ((dateOrder == null) ? 0 : dateOrder.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderGoods other = (OrderGoods) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (dateOrder == null) {
			if (other.dateOrder != null)
				return false;
		} else if (!dateOrder.equals(other.dateOrder))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderGoods [dateOrder=" + dateOrder + ", client=" + client
				+ "]";
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public Client getClient() {
		return client;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getDateString() {
		SimpleDateFormat simple = new SimpleDateFormat("d,MMM,YYYY");
		return simple.format(dateOrder);
	}

	public OrderGoods(int id, Date dateOrder, Client client) {
		super(id);
		this.dateOrder = dateOrder;
		this.client = client;
	}

}
