package application;
  
import javafx.application.Application;
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
		
		TextField text = new TextField("Too oruul");
		text.setAlignment(Pos.CENTER_RIGHT);
		text.setMinWidth(280);
		text.setMinHeight(50);
		text.getStyleClass().add("display");
		
		Button button1 = new Button("MC");
		button1.setMinWidth(47);
		button1.setMinHeight(47);
		Button button2 = new Button("MR");
		button2.setMinWidth(47);
		button2.setMinHeight(47);
		Button button3 = new Button("M+");
		button3.setMinWidth(47);
		button3.setMinHeight(47);
		Button button4 = new Button("M-");
		button4.setMinWidth(47);
		button4.setMinHeight(47);
		Button button5 = new Button("CE");
		button5.setMinWidth(47);
		button5.setMinHeight(47);
		Button btnDevide = new Button("÷");
		btnDevide.setMinWidth(47);
		btnDevide.setMinHeight(47);
		Button btnSqrt = new Button("√");
		btnSqrt.setMinWidth(47);
		btnSqrt.setMinHeight(47);
		Button btnMultiple = new Button("×");
		btnMultiple.setMinWidth(47);
		btnMultiple.setMinHeight(47);
		Button btnDevideMod = new Button("%");
		btnDevideMod.setMinWidth(47);
		btnDevideMod.setMinHeight(47);
		Button btnMinus = new Button("-");
		btnMinus.setMinWidth(47);
		btnMinus.setMinHeight(47);
		Button btnOneDivide = new Button("1/x");
		btnOneDivide.setMinWidth(47);
		btnOneDivide.setMinHeight(47);
		Button btnPlus = new Button("+");
		btnPlus.setMinWidth(47);
		btnPlus.setMinHeight(47);
		Button btnEqual = new Button("=");
		btnEqual.setMinWidth(47);
		btnEqual.setMinHeight(47);
		Button btnNegation = new Button("±");
		btnNegation.setMinWidth(47);
		btnNegation.setMinHeight(47);
		Button btnDot = new Button(".");
		btnDot.setMinWidth(47);
		btnDot.setMinHeight(47);
		Button btnNumber0 = new Button("0");
		btnNumber0.setMinWidth(47);
		btnNumber0.setMinHeight(47);
		Button btnNumber1 = new Button("1");
		btnNumber1.setMinWidth(47);
		btnNumber1.setMinHeight(47);
		Button btnNumber2 = new Button("2");
		btnNumber2.setMinWidth(47);
		btnNumber2.setMinHeight(47);
		Button btnNumber3 = new Button("3");
		btnNumber3.setMinWidth(47);
		btnNumber3.setMinHeight(47);
		Button btnNumber4 = new Button("4");
		btnNumber4.setMinWidth(47);
		btnNumber4.setMinHeight(47);
		Button btnNumber5 = new Button("5");
		btnNumber5.setMinWidth(47);
		btnNumber5.setMinHeight(47);
		Button btnNumber6 = new Button("6");
		btnNumber6.setMinWidth(47);
		btnNumber6.setMinHeight(47);
		Button btnNumber7 = new Button("7");
		btnNumber7.setMinWidth(47);
		btnNumber7.setMinHeight(47);
		Button btnNumber8 = new Button("8");
		btnNumber8.setMinWidth(47);
		btnNumber8.setMinHeight(47);
		Button btnNumber9 = new Button("9");
		btnNumber9.setMinWidth(47);
		btnNumber9.setMinHeight(47);
		
		grid.add(button1, 0, 0);
		grid.add(button2, 1, 0);
		grid.add(button3, 2, 0);
		grid.add(button4, 3, 0);
		grid.add(button5, 4, 0);
		
		grid.add(btnNumber7, 0, 1);
		grid.add(btnNumber8, 1, 1);
		grid.add(btnNumber9, 2, 1);
		grid.add(btnDevide, 3, 1);
		grid.add(btnSqrt, 4, 1);

		grid.add(btnNumber4, 0, 2);
		grid.add(btnNumber5, 1, 2);
		grid.add(btnNumber6, 2, 2);
		grid.add(btnMultiple, 3, 2);
		grid.add(btnDevideMod, 4, 2);
		

		grid.add(btnNumber1, 0, 3);
		grid.add(btnNumber2, 1, 3);
		grid.add(btnNumber3, 2, 3);
		grid.add(btnMinus, 3, 3);
		grid.add(btnOneDivide, 4, 3);
		
		grid.add(btnNumber0, 0, 4);
		grid.add(btnDot, 1, 4);
		grid.add(btnNegation, 2, 4);
		grid.add(btnPlus, 3, 4);
		grid.add(btnEqual, 4, 4);
		
		hbox.getChildren().add(text);
		
		Scene scene = new Scene(root,300,400);
		scene.getStylesheets().add("application/application.css");
		root.setTop(hbox);
		root.setCenter(grid);
//		root.setMargin(hbox, new Insets(10,10,10,10));
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
