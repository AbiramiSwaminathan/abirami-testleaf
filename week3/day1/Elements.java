package week3.day1;

//Inherit the Button Sub Class by using extends keyword
public class Elements extends Button {
	public static void main(String[] args) {
		// Create Object for this class and call all the methods from Super Class and
		// the Sub Classes
		Elements objElements = new Elements();
		objElements.click();
		// Create Object for TextField Class and pass value to setText method from
		// getText method
		TextField objTextField = new TextField();

		objElements.setText(objTextField.getText());

		// Create Object for CheckButton and call its method here
		CheckBoxButton objCheckBoxButton = new CheckBoxButton();
		objCheckBoxButton.clickCheckButton();

		// Create Object for RadioButton and call its method here
		RadioButton objRadioButton = new RadioButton();
		objRadioButton.selectRadioButton();

		objElements.submit();
	}
}
