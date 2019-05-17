package view;

import javafx.scene.layout.GridPane;
import java.util.Locale;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Control;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import model.Course;


//You may change this class to extend another type if you wish
public class OptionsModuleChooserRootPane extends GridPane {



	 	private DatePicker datePicker;
	    public static void main(String[] args) {
	        Locale.setDefault(Locale.ENGLISH);
	        launch(args);
	    }

		public OptionsModuleChooserRootPane() {

			TabPane tabPane = new TabPane();
				Tab tab = new Tab();
				tab.setText("Student Profile Creator");
				tab.setContent(new Rectangle(200,200));
				tabPane.getTabs().add(tab);


			this.setAlignment(Pos.CENTER);
			this.setHgap(10);
			this.setVgap(10);
			this.setPadding(new Insets(25, 25, 25, 25));


			Label selectCourse = new Label("Select course:");
			this.add(selectCourse, 0, 1);


			ChoiceBox<Object> course = new ChoiceBox<Object>();
			course.setItems(FXCollections.observableArrayList("Computer Science", "Software Engineering"));
			this.add(course, 1, 1);


			Label pNumber = new Label("Insert P number:");
			this.add(pNumber, 0, 2);

			TextField number = new TextField();
			this.add(number, 1, 2);

			Label fName = new Label("Insert first name:");
			this.add(fName, 0, 3);

			TextField fName1 = new TextField();
			this.add(fName1, 1, 3);

			Label surname = new Label("Insert surname:");
			this.add(surname, 0, 4);

			TextField surname2 = new TextField();
			this.add(surname2, 1, 4);

			Label email = new Label("Insert email:");
			this.add(email, 0, 5);

			TextField email1 = new TextField();
			this.add(email1, 1, 5);

			Label date = new Label("Insert date:");
			this.add(date, 0, 6);

			datePicker = new DatePicker();
			this.add(datePicker, 1, 6);

			Button btn = new Button("Create Profile");
			btn.setTooltip(new Tooltip("Press me"));
			this.add(btn, 1, 7);



	            }
		private static void launch(String[] args) {
			// TODO Auto-generated method stub

		}




}

