package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

/**
 * The type Main.
 * @author Amir Hosseini
 * @version 19-6-2021
 */
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


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
