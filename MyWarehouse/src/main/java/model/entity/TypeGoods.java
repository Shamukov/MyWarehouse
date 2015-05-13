package model.entity;

import javax.persistence.Entity;

import model.entity.basicentity.BasicEntity;

@Entity
public class TypeGoods  extends BasicEntity{
	public TypeGoods() {
		// TODO Auto-generated constructor stub
	}
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public TypeGoods(int id, String name) {
	super(id);
	this.name = name;
}

@Override
public String toString() {
	return "TypeGoods [name=" + name + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((name == null) ? 0 : name.hashCode());
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
	TypeGoods other = (TypeGoods) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}


}
