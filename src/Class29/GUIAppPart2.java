package Class29;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUIAppPart2 extends Application implements EventHandler<ActionEvent> {
TextField text;
    public static void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button = new Button("Click me");
        Label label = new Label("Enter your name");
        text = new TextField();
        VBox vBoxlayout = new VBox();
        vBoxlayout.getChildren().add(label);
        //StackPane vBoxlayout=new StackPane();
        button.setOnAction(this);
        vBoxlayout.getChildren().add(text);
        vBoxlayout.getChildren().add(button);
        Scene scene = new Scene(vBoxlayout, 600, 600);
        primaryStage.setTitle("Next Billion Dollar App"); // give the name of our Application
        primaryStage.setScene(scene);
        primaryStage.show();  // show the stage (the window of Application

    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println(text.getCharacters());
    }
}
