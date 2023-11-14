package com.example.setup.PostgreSQL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class PostgreSQLController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.show();
    }





}
