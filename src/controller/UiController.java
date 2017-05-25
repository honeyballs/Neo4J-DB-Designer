package controller;

import java.net.URL;
import java.util.ResourceBundle;

import model.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class UiController implements Initializable {

	@FXML
	private ListView metaNodeList;

	@FXML
	private TableView<Property> propertyTable;
	
	@FXML 
	private TableView relTable;
	
	private ObservableList<Property> properties = FXCollections.observableArrayList();

	public void initialize(URL arg0, ResourceBundle arg1) {

		// initialize table for test purposes
		properties.add(new Property("Listname", "String", 0, 100));
		properties.add(new Property("Vorname", "String", 2, 100));
		properties.add(new Property("Nachname", "String", 2, 100));
		properties.add(new Property("Alter", "int", 0, 100));
		
	}

	@FXML
	private void addNode(ActionEvent event) {

		System.out.println("addNode");

	}

	@FXML
	private void deleteNode(ActionEvent event) {

		System.out.println("deleteNode");

	}

	@FXML
	private void addProperty(ActionEvent event) {

		System.out.println("addProperty");
		
		//Initialize table
		TableColumn<Property, String> nameCol = new TableColumn<Property, String>("Name");
		nameCol.setMinWidth(200);
		nameCol.setCellValueFactory(new PropertyValueFactory<Property, String>("name"));
		
		TableColumn<Property, String> typeCol = new TableColumn<Property, String>("Type");
		typeCol.setMinWidth(100);
		typeCol.setCellValueFactory(new PropertyValueFactory<Property, String>("type"));
		
		TableColumn<Property, Integer> minCol = new TableColumn<Property, Integer>("Min");
		minCol.setMinWidth(70);
		minCol.setCellValueFactory(new PropertyValueFactory<Property, Integer>("min"));
		
		TableColumn<Property, Integer> maxCol = new TableColumn<Property, Integer>("Max");
		maxCol.setMinWidth(70);
		maxCol.setCellValueFactory(new PropertyValueFactory<Property, Integer>("max"));
		
		propertyTable.setItems(properties);
		propertyTable.getColumns().addAll(nameCol, typeCol, minCol, maxCol);

	}

	@FXML
	private void deleteProperty(ActionEvent event) {

		System.out.println("deleteProperty");

	}

	@FXML
	private void addRelationship(ActionEvent event) {

		System.out.println("addRelationship");

	}

	@FXML
	private void deleteRelationship(ActionEvent event) {

		System.out.println("deleteRelationship");

	}

}
