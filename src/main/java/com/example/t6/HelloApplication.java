package com.example.t6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Text text1 = new Text("hi how are you");
        text1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        text1.setX(100);
        text1.setY(100);
        text1.setStrikethrough(true);

        Text text2 = new Text("Welcome to tutorialspoint");
        text2.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
        text2.setX(100);
        text2.setY(200);
        text2.setUnderline(true);

        Group root = new Group();
        root.getChildren().add(text1);
        root.getChildren().add(text2);
        Scene scene = new Scene(root);
        scene.setFill(Color.WHITE);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}