/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbackend;

import couchdb.CouchbaseSingleton;
import couchdb.Room;
import mainhotelapp.SysConstants;

import java.time.LocalDate;

import couchdb.Room.roomType;

import java.util.*;

import org.json.*;

import java.lang.*;

/**
 * @author kyleaustin
 */
public class HotelBackend
{

    /**
     * @param args the command line arguments
     */
    public static int myNum = 0;
    public int myNum2 = 0;

    public static void main(String[] args) throws Exception {
        HotelBackend logic = new HotelBackend();
       int t = 5;
       // logic.getCalenderForDay(239484, Integer.toString(t));
        logic.getMemberID("624123435");
        logic.getMemberID("62423435");
        logic.getMemberID("62463435");
        logic.getMemberID("62543535");
//        logic.getMemberID("62423435");
        //logic.bookRoom(LocalDate.now(), LocalDate.now(), roomType.reg, 5);

//         logic.getCalenderForDay(0, "NoDay");
//         logic.getCalenderForDay(4999, "fuckIt");
//
//         logic.getMembershipType(609494);
//        logic.getMembershipType(0);
//        logic.getMembershipType(-70);
//        logic.getMembershipType(-32);


    }


    public ArrayList<Object> bookRoom(LocalDate fromDate, LocalDate toDate, roomType roomType, int numOfRooms) throws Exception {

        String myRoomType = "";
        int temproomnummber = (int) (Math.random());
        System.out.println(temproomnummber);


        Room db = new Room();
        HashMap<String, Object> rooms = db.getRooms();

        ArrayList roomList = new ArrayList<Object>();

        roomList.add(rooms.get("1"));
        roomList.add(rooms.get("2"));
        roomList.add(rooms.get("3"));
        roomList.add(rooms.get("4"));
        roomList.add(rooms.get("5"));





        
        /*
        kkk
Make it so that each room type can be compared with the UI 
    1. if RoomTypeConst is set to HANDI the compare 
    2. else if RoomTypeConst is set to REG the compare
`   3. else if RoomTypeConst is set to HANDI the compare 
    4. else send error 

         */
        //if RoomType is set to HANDI then compare to the roomType
        if (roomType.handi == roomType) {//
            //if it succededs then print out the room type that was just compared
            System.out.print("HANDI");
            myRoomType = "HANDI";
        } //else if RoomType is set to REG then compare to the roomType
        else if (roomType.reg == roomType) {
            //if it succededs then print out the room type that was just compared
            System.out.print("REG");
            myRoomType = "REG";
        } //else if RoomType is set to SUITE then compare to the roomType
        else if (roomType.suite == roomType) {
            //if it succededs then print out the room type that was just compared
            System.out.print("SUITE");
            myRoomType = "SUITE";
        } else {
            //else send error 
            System.out.print("Error");
        }

        if (numOfRooms == 1 && numOfRooms <= 5) {
            fromDate.getDayOfMonth();
            fromDate.getMonthValue();
            fromDate.getYear();

            toDate.getDayOfMonth();
            toDate.getMonthValue();
            toDate.getYear();

            //call database with params and get callback

            Sqllc s = new Sqllc();

            s.insertCID(fromDate.getDayOfMonth(), fromDate.getMonthValue(), fromDate.getYear());
            s.insertCOD(toDate.getDayOfMonth(), toDate.getMonthValue(), toDate.getYear());
            s.insertRoom(temproomnummber, myRoomType);


            System.out.print(s.getCheckInDay(fromDate.getDayOfMonth(), fromDate.getMonthValue(), fromDate.getYear()));
            System.out.print(s.getCheckInMonth(fromDate.getDayOfMonth(), fromDate.getMonthValue(), fromDate.getYear()));
            System.out.print(s.getCheckInYear(fromDate.getDayOfMonth(), fromDate.getMonthValue(), fromDate.getYear()));
            System.out.print(s.getCheckOutDay(fromDate.getDayOfMonth(), fromDate.getMonthValue(), fromDate.getYear()));
            System.out.print(s.getCheckOutMonth(fromDate.getDayOfMonth(), fromDate.getMonthValue(), fromDate.getYear()));
            System.out.print(s.getCheckOutYear(fromDate.getDayOfMonth(), fromDate.getMonthValue(), fromDate.getYear()));
            System.out.print(s.getRoomType(temproomnummber));


        } else {
            System.out.println("Error");
        }
        /*
        1. convert local date into intergers
        2. convert RoomTypeConst into a string 
        3. make sure numOfRooms is no more then 5. (must be able to have atleast one)
            1. if between 1 and 5 rooms is valid 
            2. else send error to user 
        4. send result data to data base 
         */
        return roomList;

    }

    /**
     * @return the myNum
     */
    public static int getMyNum() {
        return myNum;
    }

    /**
     * @param aMyNum the myNum to set
     */
    public static void setMyNum(int aMyNum) {
        myNum = aMyNum;
    }


    public void getCalenderForDay(int daynum, String dayOfWeek) {

        if (daynum >= 1 && daynum <= 31) {
            //add date, change to println
            System.out.println("Valid date " + daynum);

        }//
        else {
            //add date, change to println
            //return;
            System.out.println("not valid date");
        }


        //move to system constants create a enum of string constants, google for support if not understood
        String mon = "Monday";

        String tues = "Tuesday";

        String wed = "Wednesday";

        String thur = "Thursday";

        String fri = "Friday";

        String sat = "Saturday";

        String sun = "Sunday";

        //if day of the week is equal to the string "Monday" print out today is Monday

        if (mon.equals(dayOfWeek)) {

            System.out.println("To day is " + mon);
        }
        //else if day of the week is equal to the string "Tuesday" print out today is Tuesday
        else if (tues.equals(dayOfWeek)) {
            System.out.println("To day is " + tues);
        }
        //else if day of the week is equal to the string "Wednesday" print out today is Wednesday
        else if (wed.equals(dayOfWeek)) {
            System.out.println("To day is " + wed);
        }
        //else if day of the week is equal to the string "Thursday" print out today is Thursday
        else if (thur.equals(dayOfWeek)) {
            System.out.println("To day is " + thur);
        }
        //else if day of the week is equal to the string "Friday" print out today is Friday
        else if (fri.equals(dayOfWeek)) {
            System.out.println("To day is " + fri);
        }
        //else if day of the week is equal to the string "Saturday" print out today is Saturday
        else if (sat.equals(dayOfWeek)) {
            System.out.println("To day is " + sat);
        }
        //else if day of the week is equal to the string "Sunday" print out today is Sunday
        else if (sun.equals(dayOfWeek)) {
            System.out.println("To day is " + sun);
        } else {

            return;
        }

    }

    //
    public void getMembershipType(int stayCount)

    {
        // if the number of is stays is greater than or equal to 3 month person is platinum member
        if (stayCount >= 90) {
            System.out.println("you are a Platinum member ");

        }
        // if the number of stays is greater than or equal to 2 months && is less then or equal to 3 months  person is Gold member
        else if (stayCount >= 60 && stayCount <= 90) {
            System.out.println("you are a Gold member ");

        }
        //  if the number of stays is greater than or equal to 1 month && is less then or equal to 2 months  person is Silver member
        else if (stayCount >= 30 && stayCount <= 60) {
            System.out.println("you are a Silver member ");

        }
        //  if the number of stays is greater than or equal to 2 weeks && is less then or equal to 1 month  person is Bronze member
        else if (stayCount >= 14 && stayCount <= 30) {
            System.out.println("your are a Bronze member");

        }
        //else you havent stayed long enouh to earn a membership
        else {

            System.out.println("you dont have a memebrship");
        }


    }

    public void getMemberID(String memberID)
     {
        /*
        * hash Map of Key type string and value type object
        *that breaks down the membership
        * */
         HashMap<String, Object> rewardsProgram = new HashMap<String, Object>();
        rewardsProgram.put("photoURL", "fhwebfb");
        rewardsProgram.put("date", "fhwebfb");
        rewardsProgram.put("dayOfWeek", "fhwebfb");

        /*
        *  A nested
        *  the first HashMap of key type string and value type object holds a group of memeber
        *  the second HashMap of key type string and value type object holds a single member.
        *
        *
        * */
        HashMap<String, Object> rewardsMembers = new HashMap<String, Object>();
        HashMap<String, Object> rewardsMember = new HashMap<String, Object>();
        rewardsMember.put("nightStayed", 1);
        rewardsMember.put("memberID", "632234354");
        rewardsMember.put("memberLevel", "Gold");
        rewardsMember.put("memberName", "Sam Smith");

//        System.out.println(rewardsMember);
        rewardsMembers.put("632234354", rewardsMember);
//        System.out.println(rewardsMembers);

        rewardsProgram.put("rewardsMembers", rewardsMember);
//        System.out.print(rewardsProgram);

        JSONObject json = new JSONObject(rewardsProgram);
//        System.out.println("\n\n\n\n " + json.toString(10));

         int nightStayed = 0;


         String memberLocation = "Member is located in ";
         char regionID = memberID.charAt(3);

        /*
        * if  memberID starts with the 3 digit character string of 624 then the ID is valid
        * */
            String reg = "region " ;
         if (memberID.startsWith("624"))
         {
             System.out.println("Member ID is valid ");
         }
        /*
        *  while the memberID starts with the string value of 624 implement the following logic to check for the regionID
        *  If regionID 1-7 then return one of th following 7 regional locations:
        *  Southwest
        *  Northwest
        *  Southcentral
        *  Northcentral
        *  Northeast
        *  Southeast
        *
        *  else the MemberID is not valid
        * */
       while(memberID.startsWith("624"))
        {
            if(regionID == '1')
            {
                System.out.println(memberLocation + " Southwest " + reg);
                return;
            }
            else if(regionID == '2')
            {
                System.out.println(memberLocation + " Northwest " + reg);
                return;
            }
            else if(regionID == '3')
            {
                System.out.println(memberLocation + " SouthCentral " + reg);
                return;
            }
            else if(regionID == '4')
            {
                System.out.println(memberLocation + " NorthCentral " + reg);
                return;
            }
            else if(regionID == '5')
            {
                System.out.println(memberLocation + " NorthEast " + reg);
                return;
            }
            else if(regionID == '6')
            {
                System.out.println(memberLocation + " SouthEast " + reg);
                return;
            }
            else if(regionID == '7')
            {
                System.out.println(memberLocation + " Alaska" );
                return;
            }
            else if(regionID == '8')
            {
                System.out.println(memberLocation + " Pacific Islands");
                return;
            }
            else
            {

                System.out.println("Person has no region");
            }

        }




     }

   /* public void int memberRegion (int region)
    {

        /*if(regionID == '1')
         {
             System.out.println(memberLocation + " Southwest");
         }
         else if(regionID == '2')
         {
             System.out.println(memberLocation + " Northwest");
         }
         else if(regionID == '3')
         {
             System.out.println(memberLocation + " SouthCentral");
         }
         else if(regionID == '4')
         {
             System.out.println(memberLocation + " NorthCentral");
         }
         else if(regionID == '5')
         {
             System.out.println(memberLocation + " NorthEast");
         }
         else if(regionID == '6')
         {
             System.out.println(memberLocation + " SouthEast");
         }
         else if(regionID == '7')
         {
             System.out.println(memberLocation + " Alaska");
         }
         else
        {
            System.out.println("Person has no region");
        }


    }*/

}
