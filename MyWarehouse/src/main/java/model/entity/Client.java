package model.entity;

import javax.persistence.Entity;

import model.entity.basicentity.BasicEntity;

@Entity
public class Client extends BasicEntity {

	private String name;
	private String score;
	private String address;

	public String getName() {
		return name;
	}

	public String getScore() {
		return score;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(int id, String name, String score, String address) {
		super(id);
		this.name = name;
		this.score = score;
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((score == null) ? 0 : score.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", score=" + score + ", address="
				+ address + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score == null) {
			if (other.score != null)
				return false;
		} else if (!score.equals(other.score))
			return false;
		return true;
	}

}
