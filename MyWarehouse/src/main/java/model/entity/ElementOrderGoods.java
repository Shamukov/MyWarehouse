package model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import model.entity.basicentity.BasicEntity;
@Entity
public class ElementOrderGoods extends BasicEntity{
	
	
	private int number;
	
	@OneToOne
	private OrderGoods orderGoods;
	@OneToOne
	private Client orderGoods_Client;
	@OneToOne(cascade=CascadeType.DETACH)
	private Preservation preservation;
	@OneToOne
	private ElementParty preservation_ElementParty;
	@OneToOne
	private PartyGoods preservation_ElementParty_PartyGoods;
	@OneToOne
	private Provider preservation_ElementParty_PartyGoods_Provider;
	@OneToOne
	private Goods preservation_ElementParty_Goods;
	@OneToOne
	private TypeGoods preservation_ElementParty_Goods_TypeGoods;
	@OneToOne
	private Sector preservation_Sector;
	@OneToOne
	private Storage preservation_Sector_Storage;
	
	public ElementOrderGoods() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public int getNumber() {
		return number;
	}
	public OrderGoods getOrderGoods() {
		return orderGoods;
	}
	public Client getOrderGoods_Client() {
		return orderGoods_Client;
	}
	public Preservation getPreservation() {
		return preservation;
	}
	public ElementParty getPreservation_ElementParty() {
		return preservation_ElementParty;
	}
	public PartyGoods getPreservation_ElementParty_PartyGoods() {
		return preservation_ElementParty_PartyGoods;
	}
	public Provider getPreservation_ElementParty_PartyGoods_Provider() {
		return preservation_ElementParty_PartyGoods_Provider;
	}
	public Goods getPreservation_ElementParty_Goods() {
		return preservation_ElementParty_Goods;
	}
	public TypeGoods getPreservation_ElementParty_Goods_TypeGoods() {
		return preservation_ElementParty_Goods_TypeGoods;
	}
	public Sector getPreservation_Sector() {
		return preservation_Sector;
	}
	public Storage getPreservation_Sector_Storage() {
		return preservation_Sector_Storage;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setOrderGoods(OrderGoods orderGoods) {
		this.orderGoods = orderGoods;
	}
	public void setOrderGoods_Client(Client orderGoods_Client) {
		this.orderGoods_Client = orderGoods_Client;
	}
	public void setPreservation(Preservation preservation) {
		this.preservation = preservation;
	}
	public void setPreservation_ElementParty(ElementParty preservation_ElementParty) {
		this.preservation_ElementParty = preservation_ElementParty;
	}
	public void setPreservation_ElementParty_PartyGoods(
			PartyGoods preservation_ElementParty_PartyGoods) {
		this.preservation_ElementParty_PartyGoods = preservation_ElementParty_PartyGoods;
	}
	public void setPreservation_ElementParty_PartyGoods_Provider(
			Provider preservation_ElementParty_PartyGoods_Provider) {
		this.preservation_ElementParty_PartyGoods_Provider = preservation_ElementParty_PartyGoods_Provider;
	}
	public void setPreservation_ElementParty_Goods(
			Goods preservation_ElementParty_Goods) {
		this.preservation_ElementParty_Goods = preservation_ElementParty_Goods;
	}
	public void setPreservation_ElementParty_Goods_TypeGoods(
			TypeGoods preservation_ElementParty_Goods_TypeGoods) {
		this.preservation_ElementParty_Goods_TypeGoods = preservation_ElementParty_Goods_TypeGoods;
	}
	public void setPreservation_Sector(Sector preservation_Sector) {
		this.preservation_Sector = preservation_Sector;
	}
	public void setPreservation_Sector_Storage(Storage preservation_Sector_Storage) {
		this.preservation_Sector_Storage = preservation_Sector_Storage;
	}
	public ElementOrderGoods(int id, int number, OrderGoods orderGoods,
			Client orderGoods_Client, Preservation preservation,
			ElementParty preservation_ElementParty,
			PartyGoods preservation_ElementParty_PartyGoods,
			Provider preservation_ElementParty_PartyGoods_Provider,
			Goods preservation_ElementParty_Goods,
			TypeGoods preservation_ElementParty_Goods_TypeGoods,
			Sector preservation_Sector, Storage preservation_Sector_Storage) {
		super();
		this.id = id;
		this.number = number;
		this.orderGoods = orderGoods;
		this.orderGoods_Client = orderGoods_Client;
		this.preservation = preservation;
		this.preservation_ElementParty = preservation_ElementParty;
		this.preservation_ElementParty_PartyGoods = preservation_ElementParty_PartyGoods;
		this.preservation_ElementParty_PartyGoods_Provider = preservation_ElementParty_PartyGoods_Provider;
		this.preservation_ElementParty_Goods = preservation_ElementParty_Goods;
		this.preservation_ElementParty_Goods_TypeGoods = preservation_ElementParty_Goods_TypeGoods;
		this.preservation_Sector = preservation_Sector;
		this.preservation_Sector_Storage = preservation_Sector_Storage;
	}
	public ElementOrderGoods(int id, int number, OrderGoods orderGoods,Preservation preservation){
		super();
		this.id = id;
		this.number = number;
		this.orderGoods = orderGoods;
		this.orderGoods_Client = orderGoods.getClient();
		this.preservation = preservation;
		this.preservation_ElementParty = preservation.getElementParty();
		this.preservation_ElementParty_PartyGoods = preservation.getElementParty_PartyGoods();
		this.preservation_ElementParty_PartyGoods_Provider = preservation.getElementParty_PartyGoods_Provider();
		this.preservation_ElementParty_Goods = preservation.getElementParty_Goods();
		this.preservation_ElementParty_Goods_TypeGoods = preservation.getElementParty_Goods_TypeGoods();
		this.preservation_Sector =preservation.getSector();
		this.preservation_Sector_Storage = preservation.getSector_Storage();
	}
	@Override
	public String toString() {
		return "ElementOrderGoods [id=" + id + ", number=" + number
				+ ", orderGoods=" + orderGoods + ", orderGoods_Client="
				+ orderGoods_Client + ", preservation=" + preservation
				+ ", preservation_ElementParty=" + preservation_ElementParty
				+ ", preservation_ElementParty_PartyGoods="
				+ preservation_ElementParty_PartyGoods
				+ ", preservation_ElementParty_PartyGoods_Provider="
				+ preservation_ElementParty_PartyGoods_Provider
				+ ", preservation_ElementParty_Goods="
				+ preservation_ElementParty_Goods
				+ ", preservation_ElementParty_Goods_TypeGoods="
				+ preservation_ElementParty_Goods_TypeGoods
				+ ", preservation_Sector=" + preservation_Sector
				+ ", preservation_Sector_Storage="
				+ preservation_Sector_Storage + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + number;
		result = prime * result
				+ ((orderGoods == null) ? 0 : orderGoods.hashCode());
		result = prime
				* result
				+ ((orderGoods_Client == null) ? 0 : orderGoods_Client
						.hashCode());
		result = prime * result
				+ ((preservation == null) ? 0 : preservation.hashCode());
		result = prime
				* result
				+ ((preservation_ElementParty == null) ? 0
						: preservation_ElementParty.hashCode());
		result = prime
				* result
				+ ((preservation_ElementParty_Goods == null) ? 0
						: preservation_ElementParty_Goods.hashCode());
		result = prime
				* result
				+ ((preservation_ElementParty_Goods_TypeGoods == null) ? 0
						: preservation_ElementParty_Goods_TypeGoods.hashCode());
		result = prime
				* result
				+ ((preservation_ElementParty_PartyGoods == null) ? 0
						: preservation_ElementParty_PartyGoods.hashCode());
		result = prime
				* result
				+ ((preservation_ElementParty_PartyGoods_Provider == null) ? 0
						: preservation_ElementParty_PartyGoods_Provider
								.hashCode());
		result = prime
				* result
				+ ((preservation_Sector == null) ? 0 : preservation_Sector
						.hashCode());
		result = prime
				* result
				+ ((preservation_Sector_Storage == null) ? 0
						: preservation_Sector_Storage.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementOrderGoods other = (ElementOrderGoods) obj;
		if (id != other.id)
			return false;
		if (number != other.number)
			return false;
		if (orderGoods == null) {
			if (other.orderGoods != null)
				return false;
		} else if (!orderGoods.equals(other.orderGoods))
			return false;
		if (orderGoods_Client == null) {
			if (other.orderGoods_Client != null)
				return false;
		} else if (!orderGoods_Client.equals(other.orderGoods_Client))
			return false;
		if (preservation == null) {
			if (other.preservation != null)
				return false;
		} else if (!preservation.equals(other.preservation))
			return false;
		if (preservation_ElementParty == null) {
			if (other.preservation_ElementParty != null)
				return false;
		} else if (!preservation_ElementParty
				.equals(other.preservation_ElementParty))
			return false;
		if (preservation_ElementParty_Goods == null) {
			if (other.preservation_ElementParty_Goods != null)
				return false;
		} else if (!preservation_ElementParty_Goods
				.equals(other.preservation_ElementParty_Goods))
			return false;
		if (preservation_ElementParty_Goods_TypeGoods == null) {
			if (other.preservation_ElementParty_Goods_TypeGoods != null)
				return false;
		} else if (!preservation_ElementParty_Goods_TypeGoods
				.equals(other.preservation_ElementParty_Goods_TypeGoods))
			return false;
		if (preservation_ElementParty_PartyGoods == null) {
			if (other.preservation_ElementParty_PartyGoods != null)
				return false;
		} else if (!preservation_ElementParty_PartyGoods
				.equals(other.preservation_ElementParty_PartyGoods))
			return false;
		if (preservation_ElementParty_PartyGoods_Provider == null) {
			if (other.preservation_ElementParty_PartyGoods_Provider != null)
				return false;
		} else if (!preservation_ElementParty_PartyGoods_Provider
				.equals(other.preservation_ElementParty_PartyGoods_Provider))
			return false;
		if (preservation_Sector == null) {
			if (other.preservation_Sector != null)
				return false;
		} else if (!preservation_Sector.equals(other.preservation_Sector))
			return false;
		if (preservation_Sector_Storage == null) {
			if (other.preservation_Sector_Storage != null)
				return false;
		} else if (!preservation_Sector_Storage
				.equals(other.preservation_Sector_Storage))
			return false;
		return true;
	}
	
}
