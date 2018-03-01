package couchdb;


import com.couchbase.lite.Document;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mainhotelapp.SysConstants;

import java.net.URL;

import java.util.HashMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.*;



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





//        System.out.println("obj: "+obj1.get(624983748));



        //rooms (

//        couchbase.getDatabase() ;// ask norris about ... This is simply the function to retrieve the database, should not have written this

        //create an object of multiple rooms
        HashMap<String, Object> roomsObj = new HashMap<>(); //track all rooms of HashMap (Object)

        //use for loop to generate all rooms
        for(Integer i=1;i<201;i++)
        {

            //create new room HashMap
            HashMap<String, Object> roomObj = new HashMap<>();

            //if i is even, make isEven true, else make false
            int isEven = ((i % 200) == 0) ? 1 : 0;

            //if isEven is 1, create different room, than if isEven is 0
            switch(isEven)
            {
                //set even even rooms to different properties than odd rooms
                case 1:


                    roomObj.put(Room.roomTypeKey,Room.roomType.handi.toString());
                    roomObj.put(Room.bedTypeKey,Room.bedType.queen.toString());
                    roomObj.put(Room.petKey, Room.hasPet.no.toString());
                    roomObj.put(Room.isSmokingKey,Room.isSmoking.no.toString());
                    roomObj.put(Room.amenitiesKey, Room.suiteAmenities);

                    break;

                //set odd rooms to different properties than even rooms
                case 0:

                    roomObj.put(Room.roomTypeKey,Room.roomType.reg.toString());
                    roomObj.put(Room.bedTypeKey,Room.bedType.king.toString());
                    roomObj.put(Room.petKey, Room.hasPet.no.toString());
                    roomObj.put(Room.isSmokingKey,Room.isSmoking.yes.toString());
                    roomObj.put(Room.amenitiesKey, Room.regAmenities);


                    break;

            }

            //i is room number, roomObj is room, embedded object
            roomsObj.put(i.toString(), roomObj);

        }

        JSONObject json = new JSONObject(roomsObj); // Convert text to object
        System.out.println(json.toString(10));

        //create Document in database MAKE SURE YOU GET THE CORRECT Document type (com.couchdb)

        Document roomsObjDoc = this.couchbase.getDatabase().createDocument();
//        roomsObjDoc.putProperties(roomsObj);
        System.out.println("ID: "+roomsObjDoc.getId());



//        System.out.println(json.toString(10)); // Print it with specified indentation







        //do not delete or aplication will hang
        System.exit(0);
    }

    @Override
    public void stop() {
        System.out.println("STOPING THE APPLICATION...");
        this.couchbase.stopReplication();
    }

   //ignore main function, requirement for javafx
    public static void main(String[] args) {
        launch(args);
    }
}
