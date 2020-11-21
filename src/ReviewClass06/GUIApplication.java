package ReviewClass06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class GUIApplication extends Application {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("My first GUI Application");
        Button button = new Button("Touch me");

        StackPane laoyut = new StackPane();
        laoyut.getChildren().add(button);
        Scene scene = new Scene(laoyut, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
