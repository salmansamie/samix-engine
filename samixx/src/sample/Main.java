package sample;

/**
 * samixx project
 *
 * @author Salman Samie
 * 18 Aug, 2016
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static Stage stage;
    private static BorderPane mainLayout;

    @Override
    public void start(Stage primaryStage) throws IOException {
        Main.stage = primaryStage;
        Main.stage.setTitle("samixx");
        //stage.setMaximized(true);   //for full screen
        stage.setMinHeight(500);
        stage.setMinWidth(600);
        Main.showMain();
        Main.showLogin();

    }

    public static void showMain() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("sample/view/MainView.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void showLogin() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation((Main.class.getResource("sample/view/Login.fxml")));
        BorderPane mainItems = loader.load();
        mainLayout.setCenter(mainItems);
    }

    public static void showHome() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation((Main.class.getResource("sample/view/Home.fxml")));
        BorderPane mainItems = loader.load();
        mainLayout.setCenter(mainItems);
    }

    public static void showInformationAlertBox(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialogue");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
