package GUIInjava.JavaFx;

import javafx.scene.control.Button;
import javafx.scene.effect.Effect;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SecondJavafx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button button=new Button( " button");

        StackPane flowpane=new StackPane();
        flowpane.getChildren().add(button);

        Scene scene=new Scene(flowpane,400,400);

        stage.setTitle("hello to app ");
        stage.setScene(scene);
        stage.show();


        
    }



    public static void main(String[] args) {
        launch(args);
        
    }
    
}
