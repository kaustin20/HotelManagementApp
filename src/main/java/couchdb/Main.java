package couchdb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

//DO NOT MODIFY THE CouchbaseSingleton.java file WHILE LEARNING HOW TO USE THE DATABASE!

public class Main extends Application
{
    //use this Main.java file for a test bed when writing your database code
    
    CouchbaseSingleton couchbase;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        System.out.println("STARTING THE APPLICATION...");

        this.couchbase = CouchbaseSingleton.getInstance();
        //couchbase sync gateway is currently not setup, do not modify
//        this.couchbase.startReplication(new URL("http://localhost:4984/fx-example/"), true);

        //do not delete or aplication will hang
        System.exit(0);
    }

    @Override
    public void stop() {
        System.out.println("STOPING THE APPLICATION...");
        this.couchbase.stopReplication();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
