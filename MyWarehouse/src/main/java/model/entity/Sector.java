package model.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import model.entity.basicentity.BasicEntity;

@Entity
public class Sector  extends BasicEntity{


	private int volume;

	public Sector() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((storage == null) ? 0 : storage.hashCode());
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
		Sector other = (Sector) obj;
		if (id != other.id)
			return false;
		if (storage == null) {
			if (other.storage != null)
				return false;
		} else if (!storage.equals(other.storage))
			return false;
		if (volume != other.volume)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sector [id=" + id + ", volume=" + volume + ", storage="
				+ storage + "]";
	}

	public Sector(int id, int volume, Storage storage) {
		super();
		this.id = id;
		this.volume = volume;
		this.storage = storage;
	}

	public int getId() {
		return id;
	}

	public int getVolume() {
		return volume;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	@OneToOne
	private Storage storage;

}
