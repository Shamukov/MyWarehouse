package model.entity;

import javax.persistence.Entity;

import model.entity.basicentity.BasicEntity;

@Entity
public class Goods extends BasicEntity{
	
	
	private String definition;
	private TypeGoods typeGoods;
	public Goods() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public String getDefinition() {
		return definition;
	}
	public TypeGoods getTypeGoods() {
		return typeGoods;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public void setTypeGoods(TypeGoods typeGoods) {
		this.typeGoods = typeGoods;
	}
	public Goods(int id, String definition, TypeGoods typeGoods) {
		super();
		this.id = id;
		this.definition = definition;
		this.typeGoods = typeGoods;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", definition=" + definition
				+ ", typeGoods=" + typeGoods + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((definition == null) ? 0 : definition.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((typeGoods == null) ? 0 : typeGoods.hashCode());
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
		Goods other = (Goods) obj;
		if (definition == null) {
			if (other.definition != null)
				return false;
		} else if (!definition.equals(other.definition))
			return false;
		if (id != other.id)
			return false;
		if (typeGoods == null) {
			if (other.typeGoods != null)
				return false;
		} else if (!typeGoods.equals(other.typeGoods))
			return false;
		return true;
	}
	
}
