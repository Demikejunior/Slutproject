package Base;

// Kopierat från din MVC sample
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Tetris.fxml"))));
		primaryStage.setTitle("Tetris");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
