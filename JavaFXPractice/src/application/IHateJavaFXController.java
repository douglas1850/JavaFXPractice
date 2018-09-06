package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class IHateJavaFXController implements Initializable {
	
	//Checkbox items
	@FXML private Label pizzaOrderLabel;
	@FXML private CheckBox pepperoniCheckbox;
	@FXML private CheckBox jalepneoCheckbox;
	@FXML private CheckBox onionCheckbox;
	
	//Choicebox items
	@FXML private ChoiceBox<String> choiceBox;
	@FXML private Label choiceBoxLabel;
	
	/**
	 * Choicebox example
	 */
	public void choiceBoxButtonPushed()
	{
		choiceBoxLabel.setText(choiceBox.getValue().toString()); //returns object, must convert to string
	}
	
	/**
	 * Checkbox example
	 */
	public void pizzaButtonPushed()
	{
		String order = "Toppings are: ";
		
		if(pepperoniCheckbox.isSelected())
			order += "\nPepperoni";
		
		if(jalepneoCheckbox.isSelected())
			order += "\nJalepeno";
		
		if(onionCheckbox.isSelected())
			order += "\nOnion";
		
		this.pizzaOrderLabel.setText(order);
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) { //called whenever GUI is loaded
		pizzaOrderLabel.setText("");
		
		//items for ChoiceBox example
		choiceBoxLabel.setText("");
		choiceBox.getItems().add("apples"); //returns any items currently in choice box, then we add fruit names
		choiceBox.getItems().add("oranges");
		choiceBox.getItems().add("pears");
		choiceBox.getItems().addAll("strawberries", "pineapples", "bananas"); //addAll to add multiple at once
		
	}
	
	

}
