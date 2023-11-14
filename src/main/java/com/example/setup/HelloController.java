package com.example.setup;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class HelloController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMySQL(ActionEvent event) throws IOException{
            Parent root = FXMLLoader.load(getClass().getResource("mySQL.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        System.out.println("powinno sie zaladowac");
    }

    public void postgreSQL(ActionEvent e){
        System.out.println("PostgreSQL");
    }

    public void plSQL(ActionEvent e){
        System.out.println("PLSQL");
    }

    public void MsSQL(ActionEvent e){
        System.out.println("MsSQL");
    }

//    @FXML
//    protected void onHelloButtonClick() {
//
//
//        try{
//            Connection c = null;
//            PreparedStatement pStmt = null;
//            ResultSet resultSet = null;
//
//
//            c = DriverManager
//                    .getConnection("jdbc:postgresql://localhost:5432/Test1",
//                            "postgres","Q@wertyuiop");
//
//
//
//            pStmt = c.prepareStatement("SELECT * FROM emp ");
//            resultSet = pStmt.executeQuery();
//
//            //for debug only
//            if (resultSet == null) System.out.println("coś poszło nie tak");
//            if(!resultSet.isBeforeFirst()) System.out.println("Wynik zapytania jest pusty" +resultSet.next());
//
//            while(resultSet.next()){
//                    int id = resultSet.getInt("id");
//                    String name = resultSet.getString("name");
//                    int age = resultSet.getInt("age");
//
//                    welcomeText.setText("Id " + id + " name " +name + " age " + age);
//                    //for debug only
//                    //System.out.println("Id " + id + " name " +name + " age " + age);
//                    //System.out.println("weszło");
//            }
//
//        } catch (SQLException e){
//           e.printStackTrace();
//        } /*finally {
//            try{
//                if(resultSet != null) resultSet.close();
//                if(pStmt != null) resultSet.close();
//                if(c != null) c.close();
//            } catch (SQLException e){
//                e.printStackTrace();
//            }
//        }*/



        //welcomeText.setText("Welcome to JavaFX Application!");
// }
}