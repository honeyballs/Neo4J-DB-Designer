package model;

import javafx.beans.property.SimpleStringProperty;

public class Relationship {
	
	private SimpleStringProperty name;
	private SimpleStringProperty with;
	
	public Relationship (String name, String with) {
		
		this.name = new SimpleStringProperty(name);
		this.with = new SimpleStringProperty(with);
		
	}
	
	
	public String getName() {
		return name.get();
	}
	
	public void setName(String name) {
		this.name.set(name);
	}

	public String getWith() {
		return with.get();
	}
	
	public void setWith(String with) {
		this.with.set(with);
	}
}
