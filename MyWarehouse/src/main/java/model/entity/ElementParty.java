package model.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import model.entity.basicentity.BasicEntity;

@Entity
public class ElementParty extends BasicEntity{
	private int number;
	@OneToOne
	private PartyGoods partyGoods;
	@OneToOne
	private Provider partyGoods_Provider;
	@OneToOne
	private TypeGoods goods_TypeGoods;
	@OneToOne
	private Goods goods;
	
	public ElementParty() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public int getNumber() {
		return number;
	}
	public PartyGoods getPartyGoods() {
		return partyGoods;
	}
	public Provider getPartyGoods_Provider() {
		return partyGoods_Provider;
	}
	public TypeGoods getGoods_TypeGoods() {
		return goods_TypeGoods;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setPartyGoods(PartyGoods partyGoods) {
		this.partyGoods = partyGoods;
	}
	public void setPartyGoods_Provider(Provider partyGoods_Provider) {
		this.partyGoods_Provider = partyGoods_Provider;
	}
	public void setGoods_TypeGoods(TypeGoods goods_TypeGoods) {
		this.goods_TypeGoods = goods_TypeGoods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public ElementParty(int id, int number, PartyGoods partyGoods,
			Provider partyGoods_Provider, TypeGoods goods_TypeGoods, Goods goods) {
		super();
		this.id = id;
		this.number = number;
		this.partyGoods = partyGoods;
		this.partyGoods_Provider = partyGoods_Provider;
		this.goods_TypeGoods = goods_TypeGoods;
		this.goods = goods;
	}
	@Override
	public String toString() {
		return "ElementParty [id=" + id + ", number=" + number
				+ ", partyGoods=" + partyGoods + ", partyGoods_Provider="
				+ partyGoods_Provider + ", goods_TypeGoods=" + goods_TypeGoods
				+ ", goods=" + goods + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goods == null) ? 0 : goods.hashCode());
		result = prime * result
				+ ((goods_TypeGoods == null) ? 0 : goods_TypeGoods.hashCode());
		result = prime * result + id;
		result = prime * result + number;
		result = prime * result
				+ ((partyGoods == null) ? 0 : partyGoods.hashCode());
		result = prime
				* result
				+ ((partyGoods_Provider == null) ? 0 : partyGoods_Provider
						.hashCode());
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
		ElementParty other = (ElementParty) obj;
		if (goods == null) {
			if (other.goods != null)
				return false;
		} else if (!goods.equals(other.goods))
			return false;
		if (goods_TypeGoods == null) {
			if (other.goods_TypeGoods != null)
				return false;
		} else if (!goods_TypeGoods.equals(other.goods_TypeGoods))
			return false;
		if (id != other.id)
			return false;
		if (number != other.number)
			return false;
		if (partyGoods == null) {
			if (other.partyGoods != null)
				return false;
		} else if (!partyGoods.equals(other.partyGoods))
			return false;
		if (partyGoods_Provider == null) {
			if (other.partyGoods_Provider != null)
				return false;
		} else if (!partyGoods_Provider.equals(other.partyGoods_Provider))
			return false;
		return true;
	}

}
