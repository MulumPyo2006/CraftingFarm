package project.java.craftingfarm;


import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;


public class GameController {

    public Stage stage;


    @FXML
    Button gameOffButton;
    @FXML
    Button loginGuiButton;
    @FXML
    Button showGameOffGuiButton;
    @FXML
    Button changeSceneBtn;


    @FXML
    Pane screenBackGround;

    @FXML
    VBox escapeGui;
    @FXML
    VBox loginGui;
    @FXML
    VBox signUpGui;


    @FXML
    TextField id;
    @FXML
    TextField pw;
    @FXML
    TextField name;


    @FXML
    public void showGameOffGui() {

        screenBackGround.setBackground(Background.fill(new Color(0, 0, 0, 0.8)));

        TranslateTransition translateTransition = new TranslateTransition();
        TranslateTransition translateTransitionTwo = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.5));
        translateTransition.setNode(escapeGui);
        translateTransition.setToY(980);

        translateTransitionTwo.setDuration(Duration.seconds(0.5));
        translateTransitionTwo.setNode(showGameOffGuiButton);
        translateTransitionTwo.setToY(-955);

        translateTransition.play();
        translateTransitionTwo.play();
    }

    @FXML
    public void deleteGameOffGui() {
        screenBackGround.setBackground(Background.fill(new Color(0, 0, 0, 0)));

        TranslateTransition translateTransition = new TranslateTransition();
        TranslateTransition translateTransitionTwo = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.5));
        translateTransition.setNode(escapeGui);
        translateTransition.setToY(-980);

        translateTransitionTwo.setDuration(Duration.seconds(0.5));
        translateTransitionTwo.setNode(showGameOffGuiButton);
        translateTransitionTwo.setToY(1);

        translateTransition.play();
        translateTransitionTwo.play();
    }

    @FXML
    public void showLoginGui() {

        screenBackGround.setBackground(Background.fill(new Color(0, 0, 0, 0.8)));

        TranslateTransition translateTransition = new TranslateTransition();
        TranslateTransition translateTransitionTwo = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.5));
        translateTransition.setNode(loginGui);
        translateTransition.setToY(980);

        translateTransitionTwo.setDuration(Duration.seconds(0.5));
        translateTransitionTwo.setNode(showGameOffGuiButton);
        translateTransitionTwo.setToY(-900);


        translateTransition.play();
        translateTransitionTwo.play();
    }

    @FXML
    public void deleteLoginOffGui() {
        screenBackGround.setBackground(Background.fill(new Color(0, 0, 0, 0)));

        TranslateTransition translateTransition = new TranslateTransition();
        TranslateTransition translateTransitionTwo = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.5));
        translateTransition.setNode(loginGui);
        translateTransition.setToY(-980);

        translateTransitionTwo.setDuration(Duration.seconds(0.5));
        translateTransitionTwo.setNode(showGameOffGuiButton);
        translateTransitionTwo.setToY(1);

        translateTransition.play();
        translateTransitionTwo.play();
    }

    @FXML
    public void showSignUpGui() {

        screenBackGround.setBackground(Background.fill(new Color(0, 0, 0, 0.8)));

        TranslateTransition translateTransition = new TranslateTransition();
        TranslateTransition translateTransitionTwo = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.5));
        translateTransition.setNode(loginGui);
        translateTransition.setToY(-980);


        translateTransition.play();

        translateTransitionTwo.setDuration(Duration.seconds(0.5));
        translateTransitionTwo.setNode(signUpGui);
        translateTransitionTwo.setToY(980);


        translateTransitionTwo.play();

    }

    @FXML
    public void deleteSignUpGui() {

        screenBackGround.setBackground(Background.fill(new Color(0, 0, 0, 0.8)));

        TranslateTransition translateTransition = new TranslateTransition();
        TranslateTransition translateTransitionTwo = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.5));
        translateTransition.setNode(signUpGui);
        translateTransition.setToY(-980);


        translateTransition.play();

        translateTransitionTwo.setDuration(Duration.seconds(0.5));
        translateTransitionTwo.setNode(loginGui);
        translateTransitionTwo.setToY(980);


        translateTransitionTwo.play();

    }

    @FXML
    private void changeScenePlay() {
        try {
            Parent nextScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Screen/FarmScreen.fxml")));
            Scene scene = new Scene(nextScene);
            Stage primaryStage = (Stage) changeSceneBtn.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void gameOff() {
        stage = (Stage) gameOffButton.getScene().getWindow();
        stage.close();

    }
}