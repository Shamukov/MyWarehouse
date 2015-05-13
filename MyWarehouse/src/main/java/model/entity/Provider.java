package model.entity;

import javax.persistence.Entity;

import model.entity.basicentity.BasicEntity;

@Entity
public class Provider extends BasicEntity {

	private String name;
	private String definition;
	private String score;
	private String address;

	public Provider() {
		// TODO Auto-generated constructor stub
	}

	public Provider(int idProvider, String name, String definition,
			String score, String address) {
		super();
		this.id = idProvider;
		this.name = name;
		this.definition = definition;
		this.score = score;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getDefinition() {
		return definition;
	}

	public String getScore() {
		return score;
	}

	public String getAddress() {
		return address;
	}

	public void setIdProvider(int idProvider) {
		this.id = idProvider;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((definition == null) ? 0 : definition.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((score == null) ? 0 : score.hashCode());
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
		Provider other = (Provider) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (definition == null) {
			if (other.definition != null)
				return false;
		} else if (!definition.equals(other.definition))
			return false;
		if (id != other.id)
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Provider [id=" + id + ", name=" + name + ", definition="
				+ definition + ", score=" + score + ", address=" + address
				+ "]";
	}
}
