package model.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import model.entity.basicentity.BasicEntity;

@Entity
public class PartyGoods  extends BasicEntity{

	@Temporal(TemporalType.DATE)
	private Date datePartyGoods;
	@OneToOne
	private Provider provider;

	public PartyGoods(int id, Date datePartyGoods, Provider provider) {
		super();
		this.id = id;
		this.datePartyGoods = datePartyGoods;
		this.provider = provider;
	}

	public Date getDatePartyGoods() {
		return datePartyGoods;
	}

	public void setDatePartyGoods(Date datePartyGoods) {
		this.datePartyGoods = datePartyGoods;
	}

	public int getId() {
		return id;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	
	public PartyGoods() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((provider == null) ? 0 : provider.hashCode());
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
		PartyGoods other = (PartyGoods) obj;
		if (id != other.id)
			return false;
		if (provider == null) {
			if (other.provider != null)
				return false;
		} else if (!provider.equals(other.provider))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PartyGoods [id=" + id + ", provider=" + provider + "]";
	}
	public String getDateString() {
		SimpleDateFormat simple = new SimpleDateFormat("d,MMM,YYYY");
		return simple.format(datePartyGoods);
	}

}
