package couchdb;


import com.couchbase.lite.*;
import com.sun.scenario.effect.impl.prism.PrRenderInfo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mainhotelapp.SysConstants;
;
import java.net.URL;
import java.util.*;

import org.json.*;


//DO NOT MODIFY THE CouchbaseSingleton.java file WHILE LEARNING HOW TO USE THE DATABASE!

public class Main extends Application {
    //use this Main.java file for a test bed when writing your database code

    CouchbaseSingleton couchbase;


    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("STARTING THE APPLICATION...");

        this.couchbase = CouchbaseSingleton.getInstance();

        //couchbase sync gateway is currently not setup, do not modify
//        this.couchbase.startReplication(new URL("http://localhost:4984/fx-example/"), true);




        updateAmenitiesForRoom("110", "hasPet", "no");
        updateAmenitiesForRoom("110", "microwave", false);
        updateAmenitiesForRoom("110", "hasPet", "no");
        updateAmenitiesForRoom("110", "hasPet", "no");
        updateAmenitiesForRoom("110", "hasPet", "no");updateAmenitiesForRoom("110", "hasPet", "no");



        //do not delete or aplication will hang, USED FOR TESTING
        System.exit(0);


    }




    //functoin is not usable, developing test cases...
    public void queryDatebase()
    {
        /* Query query1 = this.couchbase.getDatabase().getView("roomObjView1").createQuery();
        query1.setDescending(true);
        List<String> sl = new ArrayList<String>();
        sl.add("1");
        sl.add("2");
        //query1.setKeys();
        query1.setLimit(20);
       //System.out.println(roomObjView1.getTotalRows());
        QueryEnumerator result = query1.run();*/

        //roomsObjDoc.getProperties("hasPet");
     /*   Document doc = roomsObjDoc;
        Map<String,Object> properties = new HashMap<String, Object>() ;
        properties = ("Yes",roomsObj.get("hasPet"))
        properties.put( ,roomsObj.get("110"));
        properties.put("yes",);
        System.out.println(room);


    }

    public void mapperUpdateAndIndex()
    {
        /* View roomObjView1 = this.couchbase.getDatabase().getView("rooms");
        roomObjView1.setMap(new Mapper() {
            @Override
            public void map(Map<String, Object> roomsObjDoc, Emitter emitter) {
                for(int i=1; i<201; i++){
                    emitter.emit("i",roomsObjDoc.get("roomObj"));
                }

                    //emitter.emit("110", roomsObjDoc.get("hasPet"));

            }
        }, "1");*/
    }



    public void createRooms() throws Exception
    {
        //create an object of multiple rooms
        HashMap<String, Object> roomsObj = new HashMap<>(); //track all rooms of HashMap (Object)

        //use for loop to generate all rooms
        for (Integer i = 1; i < 201; i++) {

            //create new room HashMap
            HashMap<String, Object> roomObj = new HashMap<>();

            //if i is even, make isEven true, else make false
            int isEven = ((i % 200) == 0) ? 1 : 0;

            //if isEven is 1, create different room, than if isEven is 0
            switch (isEven) {
                //set even even rooms to different properties than odd rooms
                case 1:


                    roomObj.put(Room.roomTypeKey, Room.roomType.handi.toString());
                    roomObj.put(Room.bedTypeKey, Room.bedType.queen.toString());
                    roomObj.put(Room.petKey, Room.hasPet.no.toString());
                    roomObj.put(Room.isSmokingKey, Room.isSmoking.no.toString());
                    roomObj.put(Room.amenitiesKey, Room.suiteAmenities);

                    break;

                //set odd rooms to different properties than even rooms
                case 0:

                    roomObj.put(Room.roomTypeKey, Room.roomType.reg.toString());
                    roomObj.put(Room.bedTypeKey, Room.bedType.king.toString());
                    roomObj.put(Room.petKey, Room.hasPet.no.toString());
                    roomObj.put(Room.isSmokingKey, Room.isSmoking.yes.toString());
                    roomObj.put(Room.amenitiesKey, Room.regAmenities);


                    break;

            }

            //i is room number, roomObj is room, embedded object
            roomsObj.put(i.toString(), roomObj);

        }

        JSONObject json = new JSONObject(roomsObj); // Convert text to object
        //create Document in database MAKE SURE YOU GET THE CORRECT Document type (com.couchdb)

        Document roomsObjDoc = this.couchbase.getDatabase().createDocument();
        roomsObjDoc.putProperties(roomsObj);
        roomsObjDoc.putProperties(roomsObj);
    }

    @Override
    public void stop() {
        System.out.println("STOPING THE APPLICATION...");
        this.couchbase.stopReplication();

    }

    public static void main(String[] args) {

        launch(args);
    }


    //to update the amernities for room...if availablity changes for an amenity, we will pass
    //in the room number, amenity to update, and the new value for that amenity
    //amenity is type: string, value is: type (multiple types)
    public void updateAmenitiesForRoom(String roomNumber, String amenity, Object newValue) throws Exception
    {

        //create Document in database MAKE SURE YOU GET THE CORRECT Document type (com.couchdb)
        Document roomsObjDoc = this.couchbase.getDatabase();
//        View d =  roomsObjDoc.getDatabase().getView("System");



        roomsObjDoc.update(new Document.DocumentUpdater(){
            // Overwrite physically replaces the object thats in the database
            @Override
            public boolean update(UnsavedRevision newRevision)
            {


                //get doc from database, store in a HashMap
                Map<String, Object> roomsDocFromDb = newRevision.getProperties();

                //get a room out of the rooms HashMap
                HashMap<String, Object> oneRoom = (HashMap<String, Object>) roomsDocFromDb.get(roomNumber);


                //update the value for cooresponding amenitiy, change to use (using enum)
                oneRoom.put(amenity, newValue);


                //place the room we updated hasPet value for, back into the rooms HashMap
                roomsDocFromDb.put(Room.getRoomNumValue(), oneRoom);




                //save the updated version of the roomsDocFromDb HashMap into the Database
                newRevision.setUserProperties(roomsDocFromDb);


                System.exit(0);
                return true;

            }
        });

    }


    public void printDatabase(HashMap<String, Object> currentHashMap)
    {
        //print the JSON version of the HashMap
        JSONObject json = new JSONObject(currentHashMap); // Convert text to object
        System.out.println("FROM PRINT FUNCTION: \n\n\n" + json.toString(10)); // Print it with specified indentation
    }


}
