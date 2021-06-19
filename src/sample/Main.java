package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        URL url = getClass().getResource("Sample.fxml");
        FXMLLoader loader = new FXMLLoader(url);
        Parent root=loader.load();
        primaryStage.setScene(new Scene(root, 650, 400));
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
