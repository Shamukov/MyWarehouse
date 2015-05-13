package model.entity;

import javax.persistence.Entity;

import model.entity.basicentity.BasicEntity;

@Entity
public class Storage  extends BasicEntity{
	

private int volume;
private String name;

public Storage() {
	// TODO Auto-generated constructor stub
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + volume;
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
	Storage other = (Storage) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (volume != other.volume)
		return false;
	return true;
}

@Override
public String toString() {
	return "Storage [id=" + id + ", volume=" + volume + ", name=" + name + "]";
}

public int getId() {
	return id;
}
public int getVolume() {
	return volume;
}
public String getName() {
	return name;
}
public void setId(int id) {
	this.id = id;
}
public void setVolume(int volume) {
	this.volume = volume;
}
public void setName(String name) {
	this.name = name;
}
public Storage(int id, int volume, String name) {
	super();
	this.id = id;
	this.volume = volume;
	this.name = name;
}

}
