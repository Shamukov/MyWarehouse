package model.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import model.entity.basicentity.BasicEntity;

@Entity
public class Preservation extends BasicEntity {
	private int volume;
	@OneToOne
	private Sector sector;
	@OneToOne
	private Storage sector_Storage;
	@OneToOne
	private ElementParty elementParty;
	@OneToOne
	private PartyGoods elementParty_PartyGoods;
	@OneToOne
	private Provider elementParty_PartyGoods_Provider;
	@OneToOne
	private Goods elementParty_Goods;
	@OneToOne
	private TypeGoods elementParty_Goods_TypeGoods;

	public Preservation() {
		// TODO Auto-generated constructor stub
	}

	public int getVolume() {
		return volume;
	}

	public Sector getSector() {
		return sector;
	}

	public Storage getSector_Storage() {
		return sector_Storage;
	}

	public ElementParty getElementParty() {
		return elementParty;
	}

	public PartyGoods getElementParty_PartyGoods() {
		return elementParty_PartyGoods;
	}

	public Provider getElementParty_PartyGoods_Provider() {
		return elementParty_PartyGoods_Provider;
	}

	public Goods getElementParty_Goods() {
		return elementParty_Goods;
	}

	public TypeGoods getElementParty_Goods_TypeGoods() {
		return elementParty_Goods_TypeGoods;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public void setSector_Storage(Storage sector_Storage) {
		this.sector_Storage = sector_Storage;
	}

	public void setElementParty(ElementParty elementParty) {
		this.elementParty = elementParty;
	}

	public void setElementParty_PartyGoods(PartyGoods elementParty_PartyGoods) {
		this.elementParty_PartyGoods = elementParty_PartyGoods;
	}

	public void setElementParty_PartyGoods_Provider(
			Provider elementParty_PartyGoods_Provider) {
		this.elementParty_PartyGoods_Provider = elementParty_PartyGoods_Provider;
	}

	public void setElementParty_Goods(Goods elementParty_Goods) {
		this.elementParty_Goods = elementParty_Goods;
	}

	public void setElementParty_Goods_TypeGoods(
			TypeGoods elementParty_Goods_TypeGoods) {
		
		this.elementParty_Goods_TypeGoods = elementParty_Goods_TypeGoods;
	}

	public Preservation(int id, int volume, Sector sector,
			Storage sector_Storage, ElementParty elementParty,
			PartyGoods elementParty_PartyGoods,
			Provider elementParty_PartyGoods_Provider,
			Goods elementParty_Goods, TypeGoods elementParty_Goods_TypeGoods) {
		super(id);
		this.volume = volume;
		this.sector = sector;
		this.sector_Storage = sector_Storage;
		this.elementParty = elementParty;
		this.elementParty_PartyGoods = elementParty_PartyGoods;
		this.elementParty_PartyGoods_Provider = elementParty_PartyGoods_Provider;
		this.elementParty_Goods = elementParty_Goods;
		this.elementParty_Goods_TypeGoods = elementParty_Goods_TypeGoods;
	}

	public Preservation(int id, int volume, Sector sector,
			ElementParty elementParty) {
		super(id);
		this.volume = volume;
		this.sector = sector;
		this.elementParty = elementParty;
		this.sector_Storage = sector.getStorage();
		this.elementParty_PartyGoods = elementParty.getPartyGoods();
		this.elementParty_PartyGoods_Provider = elementParty
				.getPartyGoods_Provider();
		this.elementParty_Goods = elementParty.getGoods();
		this.elementParty_Goods_TypeGoods = elementParty.getGoods_TypeGoods();
	}

	@Override
	public String toString() {
		return "Preservation [volume=" + volume + ", sector=" + sector
				+ ", sector_Storage=" + sector_Storage + ", elementParty="
				+ elementParty + ", elementParty_PartyGoods="
				+ elementParty_PartyGoods
				+ ", elementParty_PartyGoods_Provider="
				+ elementParty_PartyGoods_Provider + ", elementParty_Goods="
				+ elementParty_Goods + ", ElementParty_Goods_TypeGoods="
				+ elementParty_Goods_TypeGoods + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((elementParty_Goods_TypeGoods == null) ? 0
						: elementParty_Goods_TypeGoods.hashCode());
		result = prime * result
				+ ((elementParty == null) ? 0 : elementParty.hashCode());
		result = prime
				* result
				+ ((elementParty_Goods == null) ? 0 : elementParty_Goods
						.hashCode());
		result = prime
				* result
				+ ((elementParty_PartyGoods == null) ? 0
						: elementParty_PartyGoods.hashCode());
		result = prime
				* result
				+ ((elementParty_PartyGoods_Provider == null) ? 0
						: elementParty_PartyGoods_Provider.hashCode());
		result = prime * result + ((sector == null) ? 0 : sector.hashCode());
		result = prime * result
				+ ((sector_Storage == null) ? 0 : sector_Storage.hashCode());
		result = prime * result + volume;
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
		Preservation other = (Preservation) obj;
		if (elementParty_Goods_TypeGoods == null) {
			if (other.elementParty_Goods_TypeGoods != null)
				return false;
		} else if (!elementParty_Goods_TypeGoods
				.equals(other.elementParty_Goods_TypeGoods))
			return false;
		if (elementParty == null) {
			if (other.elementParty != null)
				return false;
		} else if (!elementParty.equals(other.elementParty))
			return false;
		if (elementParty_Goods == null) {
			if (other.elementParty_Goods != null)
				return false;
		} else if (!elementParty_Goods.equals(other.elementParty_Goods))
			return false;
		if (elementParty_PartyGoods == null) {
			if (other.elementParty_PartyGoods != null)
				return false;
		} else if (!elementParty_PartyGoods
				.equals(other.elementParty_PartyGoods))
			return false;
		if (elementParty_PartyGoods_Provider == null) {
			if (other.elementParty_PartyGoods_Provider != null)
				return false;
		} else if (!elementParty_PartyGoods_Provider
				.equals(other.elementParty_PartyGoods_Provider))
			return false;
		if (sector == null) {
			if (other.sector != null)
				return false;
		} else if (!sector.equals(other.sector))
			return false;
		if (sector_Storage == null) {
			if (other.sector_Storage != null)
				return false;
		} else if (!sector_Storage.equals(other.sector_Storage))
			return false;
		if (volume != other.volume)
			return false;
		return true;
	}

}
