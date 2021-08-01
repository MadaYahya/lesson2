package com;

public class User {

	private int id;

 	public User() {
 		super();
 	}

 	public User(int id) {
 		super();
 		this.id = id;
 	}

 	public int getId() {
 		return id;
 	}

 	public void setId(int id) {
 		this.id = id;
 	}

 	@Override
 	public String toString() {
 		return "User [id=" + id + "]";
 	}

 	@Override
 	public int hashCode() {
 		return id;
 	}

 	@Override
 	public boolean equals(Object obj) {
 		if (this == obj)
 			return true;
 		if (obj == null)
 			return false;
 		if (getClass() != obj.getClass())
 			return false;
 		User other = (User) obj;
 		if (id != other.id)
 			return false;
 		return true;
 	}

	
	
}
