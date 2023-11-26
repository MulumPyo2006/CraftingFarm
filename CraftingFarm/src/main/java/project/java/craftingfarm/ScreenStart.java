package project.java.craftingfarm;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ScreenStart extends Application {
    private int number = 1;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ScreenStart.class.getResource("Screen/MainScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960, 505);
        stage.setTitle("");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        stage.setX(-10);
        stage.setY(0);


        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.F11) {
                if (number == 1) {
                    stage.setWidth(1940);
                    stage.setHeight(1050);
                    number = 2;
                } else if (number == 2) {
                    stage.setWidth(960);
                    stage.setHeight(505);
                    number = 1;
                }
            }
        });
    }


    public static void main(String[] args) {
        launch();
    }
}