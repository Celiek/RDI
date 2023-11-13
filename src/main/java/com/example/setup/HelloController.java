package com.example.setup;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class HelloController {

    public void mySQL(ActionEvent e){
        System.out.println("Mysql");
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