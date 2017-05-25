package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Property {
	
	private SimpleStringProperty name;
	private SimpleStringProperty type;
	private SimpleIntegerProperty min;
	private SimpleIntegerProperty max;
	
	public Property (String name, String type, int min, int max) {
		
		this.name = new SimpleStringProperty(name);
		this.type = new SimpleStringProperty(type);
		this.min = new SimpleIntegerProperty(min);
		this.max = new SimpleIntegerProperty(max);
		
	}
	
	public String getName() {
		return name.get();
	}
	
	public void setName(String name) {
		this.name.set(name);
	}
	
	public String getType() {
		return type.get();
	}
	
	public void setType(String type) {
		this.type.set(type);
	}
	
	public Integer getMin() {
		return min.get();
	}
	
	public void setMin(int min) {
		this.min.set(min);
	}
	
	public Integer getMax() {
		return max.get();
	}
	
	public void setMax(int max) {
		this.max.set(max);
	}
	
	
	
}
