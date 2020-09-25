package churkin.first_javafx_app;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Text text = new Text("Hello from my first JavaFX Application!");
        text.setLayoutX(80);
        text.setLayoutY(100);
        
        
        Group group = new Group(text);
        
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("First application");
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}