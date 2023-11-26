package project.java.craftingfarm;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class FarmController {

    public int bucket;
    public int waterBucket;
    public int wheat;
    public int seeds;


    @FXML
    public Button grassOne;
    @FXML
    public Button grassTwo;
    @FXML
    public Button grassThree;
    @FXML
    public Button grassFour;
    @FXML
    public Button grassFive;
    @FXML
    public Button grassSix;
    @FXML
    public Button grassSeven;
    @FXML
    public Button grassEight;
    @FXML
    public Button grassNine;
    @FXML
    public Button grassTen;
    @FXML
    public Button grassEleven;
    @FXML
    public Button grassTwelve;
    @FXML
    public Button grassThirteen;
    @FXML
    public Button grassFourteen;
    @FXML
    public Button grassFifteen;
    @FXML
    public Button grassSixteen;
    @FXML
    public Text resource;
    public int resourceNum;


    @FXML
    public Pane plantingSeedsGui;


    @FXML
    public void showGui() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.25));
        translateTransition.setNode(plantingSeedsGui);
        translateTransition.setToX(1030);

        translateTransition.play();
    }

    @FXML
    public void deleteGrassOne() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassOne);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassTwo() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassTwo);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassThree() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassThree);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassFour() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassFour);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassFive() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassFive);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassSix() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassSix);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassSeven() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassSeven);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassEight() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassEight);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassNine() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassNine);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassTen() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassTen);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassEleven() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassEleven);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassTwelve() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassTwelve);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassThirteen() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassThirteen);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassFourteen() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassFourteen);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }

    @FXML
    public void deleteGrassFifteen() {

        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.seconds(0.0001));
        translateTransition.setNode(grassFifteen);
        translateTransition.setToY(-5000);

        translateTransition.play();

        resourceNum++;
        resource.setText(String.valueOf(resourceNum));
    }
}