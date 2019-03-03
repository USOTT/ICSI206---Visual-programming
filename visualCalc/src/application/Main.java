package application;
  
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Main extends Application {
	private TextField text;
	private long number1=0;
	private long number2=0;
	private String operator = "";
	private boolean start = true;
	
	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(10,10,10,10));
		root.getStyleClass().add("background");
		HBox hbox = new HBox();
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20,0,0,0));
		
		text = new TextField("Too oruul");
			text.setAlignment(Pos.CENTER_RIGHT);
			text.setMinWidth(280);
			text.setMinHeight(50);
			text.getStyleClass().add("display");
			
		String[] btnName = {"MC","MR","M+","M-","CE","7","8","9","÷","√","4","5","6","×","%","1","2","3","-","1/x","+","=","±","0","."};

		Button[] btns = new Button[btnName.length];
		
		for(int i=0; i<btns.length;i++) {
				Button btn = new Button(btnName[i]);
				btn.setMinWidth(47);
				btn.setMinHeight(47);
				String value = btn.getText();
				if(value.matches("[0-9.]")) {
					btn.setOnAction(processNumbers);
				}else {
					btn.setOnAction(processOperators);
				}
				btns[i]=btn;
		}

		for(int i=0,j=0,k=0;i<btns.length;i+=1,k++) {
			if(i%5==0) {
				j++;
				k=0;
			}
				grid.add(btns[i],k,j);
		}
			
		hbox.getChildren().add(text);
		
		Scene scene = new Scene(root,300,400);
		scene.getStylesheets().add("application/application.css");
		root.setTop(hbox);
		root.setCenter(grid);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
		EventHandler<ActionEvent>  processNumbers= new EventHandler<ActionEvent>() {
			@Override
		    public void handle(ActionEvent event) {
			if(start) {
				text.setText("");
				start = false;
			}
			String value = ((Button)event.getSource()).getText();
			text.setText(text.getText()+value);
			}
		};
		
		EventHandler<ActionEvent>  processOperators= new EventHandler<ActionEvent>() {
			@Override
		    public void handle(ActionEvent event) {

				String value = ((Button)event.getSource()).getText();
				if(!value.equals("=") && !value.equals("CE") && !value.equals("√")) {
					if(!operator.isEmpty())
						return;
					
					operator = value;
					number1 = Long.valueOf(text.getText());
					text.setText("");
				}else if(value.equals("CE")){
					text.setText("");
					
					start = true;
				
				}else {
					if(value.equals("√")) { 
						operator = value;
						number1 = Long.parseLong(text.getText());}

					if(operator.isEmpty())
						return;
					number2 = Long.parseLong(text.getText());
					float output = calculate(number1, number2, operator);
					text.setText(String.valueOf(output));
					operator ="";
					start = true;
				}
			}
		};
		

	public float calculate(long number1, long number2, String operator) {
		switch (operator) {
		case "+":
			return number1+number2;
			
		case "-":
			return number1-number2;
		case "÷":
			if(number2==0)
				return 0;
			return number1/number2;
		case "×":
			return number1*number2;
		case "√":
			return (float) Math.sqrt(number1);
		case "%":
			return number1%number2;
		default:return 0;
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
