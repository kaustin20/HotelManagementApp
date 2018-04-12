/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbackend;

//framework imports

import java.time.LocalDate;
import java.util.*;

import java.lang.*;

//application imports
import couchdb.Room;
import couchdb.Room.roomType;


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

    public static void main(String[] args) throws Exception
    {


        HotelBackend logic = new HotelBackend();
       int t = 5;
        Hotel hn = new Hotel();

      /*  hn.hotelName="mgm";
        hn.region= LocationInfo.allRegionTypes.SouthEast.toString();
        hn.state="Georgia";

        hn.hotelName="mgm";
        hn.region= LocationInfo.allRegionTypes.NorthEast.toString();
        hn.state="NewYork";*/
//logic.menuTip(0);
      logic.resturantCalculator(0);
      // logic.hotelMembershipID("");
        //logic.threeDigitRandString("");
     //  System.out.println( logic.threeDigitRandString("") + logic.stateAndRegion("102") +   logic.threeDigitRandString(""));
        //logic.getHotelBill(LocalDate.now(),LocalDate.now(),roomType.handi,1,4);
        //logic.spaDate(LocalDate.now(),1);
        //logic.getCalenderForDay(2, Integer.toString(t));
      // logic.getMemberID("102234");
      // logic.getMemberID("6354545655");
       //logic.getMemberID("");
        //logic.getMemberID("kjbsdfiowefuisfkb");
       // logic.getMemberID("62423435");
       // logic.bookRoom(LocalDate.now(), LocalDate.now(), roomType.handi, 5);
        // logic.resturantAndBarRez("Kyle","Austin",LocalDate.now());
       //logic.spaPrice(2);
        //logic.spaPrice(3);
 //logic.getCalenderForDay(1, "Monday");
//         logic.getCalenderForDay(4999, "fuckIt");
//
// logic.getMembershipType(60);
//        logic.getMembershipType(0);
//        logic.getMembershipType(-70);
//        logic.getMembershipType(-32);
      //  logic.stateAndRegion("102");


    }

  /*  public void HotelMembershipNum()
    {
        threeDigitRandString();
        stateAndRegion();

    }*/



    public double resturantCalculator(double billTotal)
    {
       System.out.println("Enter in the number of Items ");
       Scanner docalc = new Scanner(System.in);
       int numItems = docalc.nextInt();


       //int itemsclulate = 0;
        double calc;
        double[] a = new double[(int) numItems];
        double calculator = 0;
        for(double itemsclulate =0; itemsclulate<a.length; itemsclulate++)
        {
            System.out.println("enter menu item cost ");
            double nums = docalc.nextDouble();
            System.out.println("enter menu item cost");
            double num = docalc.nextDouble();

            double [][] n = new double [(int)nums][(int)nums];
            //System.out.println(cal);
           // nums++;
            double cals =  nums + num;
            //numItems--;
            double [] m = new double[(int)cals];
            //cals++;
            System.out.println(cals);
            cals++;


            System.out.println("do you want to enter more items ");
            String newnum = docalc.next();
            if(newnum.contains("yes") || newnum.contains("Yes"))
            {
                System.out.println("enter menu item cost");
                num = docalc.nextDouble();

                //cals++;
                System.out.println(cals +  num);
                cals++;
            }
            else if(newnum.contains("yes") || newnum.contains("Yes"))
            {

            }

            //return cals;
        }


        return billTotal;
    }

    public double menuTip(double  tip)
    {



        System.out.println("enter in Tax rate");
        Scanner hotel = new Scanner(System.in);
        double totalTax = hotel.nextDouble();
        double num = resturantCalculator(0);
        if( totalTax >=0 && totalTax<= 1)
        {
            double tax = totalTax * num;
            System.out.println(tax);
            return tax;

        }
        return tip;

    }

    public void resturantAndBarRez(String firstName, String lastName, LocalDate rezdate)
    {
       // LocalDate localDate = 12/23/1002;
        Calendar rezTime = Calendar.getInstance();
        rezTime.set(Calendar.HOUR_OF_DAY,2);
        rezTime.set(Calendar.MINUTE,30);

        Date timeofDay = rezTime.getTime() ;

        System.out.println(rezTime);

    }
//
    public void spaPrice(int dayAtSpa )
    {
       // int dayAtSpa;
        int pricePervisit = 60;

        /*Scanner in = new  Scanner(System.in);
        System.out.println("Enter number of spa vists: ");
        int numOfvisit  = in.nextInt();*/

     while (dayAtSpa !=0)
     {
        int total = pricePervisit * dayAtSpa;
         System.out.println("your balance is " + "$" + total + " for your visit to the spa" );
        return;


     }
     //return;
    }

    public void spaDate(LocalDate spaDay,int spaRezDay)
    {
        //int spaRez;

        /*
        * this allows an individual to book one spaday per visit to the hotel\
        * if valid amount of spa visits then it will return the date the spa day will be on
        * */
        if(spaRezDay == 1)
        {
            spaDay.getDayOfMonth();
            spaDay.getMonthValue();
            spaDay.getYear();

            System.out.println("your spa day is on " + spaDay);
        }
        else
        {
            System.out.println("number of days exceed allowed per booking");
        }



    }

    public void getHotelBill(LocalDate fromDate, LocalDate toDate, roomType roomType, int numOfRooms, int numOfnights)
    {
        /*
         * IF the room type is  set the value of roomReg to 120 and get day month and year
         *
         * */
        //int spaRez;

        if(roomType.handi == roomType)
        {
            int roomcost = 100;

           fromDate.getDayOfMonth();
            fromDate.getMonthValue();
            fromDate.getYear();

            toDate.getDayOfMonth();
            toDate.getMonthValue();
            toDate.getYear();



            System.out.print("Your total amount for this " + roomType +" room stay is: "+ roomcost * numOfRooms * numOfnights);
        }
        /*
        * IF the room type is regular set the value of roomReg to 120 and get day month and year
        *
        *
        * */
        else if(roomType.reg == roomType)
        {
            int roomcost = 120;

            fromDate.getDayOfMonth();
            fromDate.getMonthValue();
            fromDate.getYear();

            toDate.getDayOfMonth();
            toDate.getMonthValue();
            toDate.getYear();



            System.out.print("Your total amount for this " + roomType +" room stay is: " + roomcost * numOfRooms * numOfnights);
        }
         /*
        * IF the room type is suite set the value of roomReg to 150 and get day month and year
        * */
        else if(roomType.suite == roomType)
        {
            int roomcost = 150;

            fromDate.getDayOfMonth();
            fromDate.getMonthValue();
            fromDate.getYear();

            toDate.getDayOfMonth();
            toDate.getMonthValue();
            toDate.getYear();



            System.out.print("Your total amount for this " + roomType +" room stay is: " + roomcost * numOfRooms * numOfnights);
        }
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

Make it so that each room type can be compared with the UI 
    1. if RoomTypeConst is set to HANDI the compare 
    2. else if RoomTypeConst is set to REG the compare
`   3. else if RoomTypeConst is set to HANDI the compare 
    4. else send error 

         */
        //if RoomType is set to HANDI then compare to the roomType
        if (roomType.handi == roomType) {//
            //if it succededs then print out the room type that was just compared
            System.out.println("HANDI");
            myRoomType = "HANDI";
        } //else if RoomType is set to REG then compare to the roomType
        else if (roomType.reg == roomType) {
            //if it succededs then print out the room type that was just compared
            System.out.println("REG");
            myRoomType = "REG";
        } //else if RoomType is set to SUITE then compare to the roomType
        else if (roomType.suite == roomType) {
            //if it succededs then print out the room type that was just compared
            System.out.println("SUITE");
            myRoomType = "SUITE";
        }
        else {
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
            System.out.println("Status is Platinum member ");

        }
        // if the number of stays is greater than or equal to 2 months && is less then or equal to 3 months  person is Gold member
        else if (stayCount >= 60 && stayCount <= 90) {
            System.out.println("Status is Gold member ");

        }
        //  if the number of stays is greater than or equal to 1 month && is less then or equal to 2 months  person is Silver member
        else if (stayCount >= 30 && stayCount <= 60) {
            System.out.println("Status is Silver member ");

        }
        //  if the number of stays is greater than or equal to 2 weeks && is less then or equal to 1 month  person is Bronze member
        else if (stayCount >= 14 && stayCount <= 30) {
            System.out.println("Status is Bronze member");

        }
        //else you havent stayed long enouh to earn a membership
        else {

            System.out.println("you dont have a memebrship");
        }


    }

   /* public void getMemberID(String memberID)
     {

         HashMap<String, Object> rewardsProgram = new HashMap<String, Object>();
        rewardsProgram.put("photoURL", "fhwebfb");
        rewardsProgram.put("date", "fhwebfb");
        rewardsProgram.put("dayOfWeek", "fhwebfb");


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
         String rand = memberID.substring(6,9);
         String stateID = memberID.substring(4,6);


         String validMemberID = "\nMember ID is valid\n";

            int sizeOfMemID = memberID.length();

            String reg = "region " ;

         if(memberID.length() == 6)
         {
             System.out.println("ID is length valid");

         /*    if (memberID.startsWith("624")) {
                 System.out.println("This hotel code is valid  ");
             } else {
                 System.out.println("Not a valid hotel key");
                 return;
             }/

             //return;
         }

         else if(memberID.length() == 0)
         // else if member ID length is equal to 0 then throw exception
         {
            throw new IllegalArgumentException();
             //return;
         }
         /*else if(memberID.contains(".*[a-z].*"))
         {
            throw new IllegalArgumentException();
         }/
         else
             {
               //  System.out.println("error");
                 return;
             }



      // while(memberID.startsWith(hotelIdCode))
        {
            if(regionID == '1')
            {
                System.out.println(memberLocation + " Southwest " + reg);
                if(stateID.contains("01"))
                {
                    System.out.println(memberLocation + " Washington" + validMemberID );
                    //System.out.println(memberID + randStuff);
                    System.out.println(memberID);

                }
                else if(stateID.contains("02"))
                {
                    System.out.println(memberLocation + " Oregon" + validMemberID);
                    //System.out.println(memberID + randStuff);
                    System.out.println(memberID);

                }
                else if(stateID.contains("03"))
                {
                    System.out.println(memberLocation + "Idaho" + validMemberID );
                   // System.out.println(memberID + randStuff);
                    System.out.println(memberID);


                }
                else
                {
                    System.out.println("Not valid state ID");
                }
                return;
            }
            else if(regionID == '2')
            {
                System.out.println(memberLocation + " Northwest " + reg);
                if(stateID.contains("04"))
                {
                    System.out.println(memberLocation + " Califorina" + validMemberID );

                }
                else if(stateID.contains("05"))
                {
                    System.out.println(memberLocation + " Arizona" + validMemberID );

                }
               else if(stateID.contains("06"))
                {
                    System.out.println(memberLocation + " Nevada" + validMemberID );

                }
                else if(stateID.contains("07"))
                {
                    System.out.println(memberLocation + " Uath" + validMemberID );

                }
                else
                {
                    System.out.println("Not valid state ID");
                }

                return;
            }
            else if(regionID == '3')
            {
                System.out.println(memberLocation + " SouthCentral " + reg);
                if(stateID.contains("08"))
                {
                    System.out.println(memberLocation + " New Mexico" + validMemberID );

                }
                else if(stateID.contains("09"))
                {
                    System.out.println(memberLocation + " Oklahoma"+ validMemberID );

                }
                else if(stateID.contains("10"))
                {
                    System.out.println(memberLocation + " Texas"+ validMemberID );

                }
                else if(stateID.contains("11"))
                {
                    System.out.println(memberLocation + "Louisana"+ validMemberID );

                }
                else
                {
                    System.out.println("Not valid state ID");
                }
                return;
            }
            else if(regionID == '4')
            {
                System.out.println(memberLocation + " NorthCentral " + reg);
                if(stateID.contains("12"))
                {
                    System.out.println(memberLocation + " Montana"+ validMemberID );

                }
                else if(stateID.contains("13"))
                {
                    System.out.println(memberLocation + " Wyoming"+ validMemberID );

                }
                else if(stateID.contains("14"))
                {
                    System.out.println(memberLocation + " Colorado"+ validMemberID );

                }
                else if(stateID.contains("15"))
                {
                    System.out.println(memberLocation + " North Dakoda"+ validMemberID );

                }
                else if(stateID.contains("16"))
                {
                    System.out.println(memberLocation + " South Dakoda"+ validMemberID );

                }
                else if(stateID.contains("17"))
                {
                    System.out.println(memberLocation + " Nebraska"+ validMemberID);

                }
                else if(stateID.contains("18"))
                {
                    System.out.println(memberLocation + " Kansas"+ validMemberID );
                }
                else
                {
                    System.out.println("Not valid state ID");
                }

                return;
            }
            else if(regionID == '5')
            {
                System.out.println(memberLocation + " NorthEast " + reg);
                if(stateID.contains("19"))
                {
                    System.out.println(memberLocation + " Minnestoa"+ validMemberID );

                }
               else if(stateID.contains("20"))
                {
                    System.out.println(memberLocation + " New Hampshire"+ validMemberID );

                }
                else if(stateID.contains("21"))
                {
                    System.out.println(memberLocation + " Iowa"+ validMemberID );

                }
                else if(stateID.contains("22"))
                {
                    System.out.println(memberLocation + " Missouri"+ validMemberID );

                }
                else if(stateID.contains("23"))
                {
                    System.out.println(memberLocation + " Wisconsin"+ validMemberID );

                }
                else if(stateID.contains("24"))
                {
                    System.out.println(memberLocation + " ILLinois"+ validMemberID );

                }
                else if(stateID.contains("25"))
                {
                    System.out.println(memberLocation + " Kentucky"+ validMemberID );

                }
                else if(stateID.contains("26"))
                {
                    System.out.println(memberLocation + " Indiana"+ validMemberID );

                }
                else if(stateID.contains("27"))
                {
                    System.out.println(memberLocation + " Ohio"+ validMemberID );

                }
                else if(stateID.contains("28"))
                {
                    System.out.println(memberLocation + " Michigan"+ validMemberID );

                }
                else if(stateID.contains("29"))
                {
                    System.out.println(memberLocation + " Virginia"+ validMemberID );

                }
                else if(stateID.contains("30"))
                {
                    System.out.println(memberLocation + " West Virginia"+ validMemberID );

                }
                else if(stateID.contains("31"))
                {
                    System.out.println(memberLocation + " Maryland"+ validMemberID );

                }
                else if(stateID.contains("32"))
                {
                    System.out.println(memberLocation + " Delaware"+ validMemberID );

                }
                else if(stateID.contains("33"))
                {
                    System.out.println(memberLocation + " New Jersey"+ validMemberID );

                }
                else if(stateID.contains("34"))
                {
                    System.out.println(memberLocation + " Pennsylvania"+ validMemberID );

                }
                else if(stateID.contains("35"))
                {
                    System.out.println(memberLocation + " Connecticut"+ validMemberID );

                }
                else if(stateID.contains("36"))
                {
                    System.out.println(memberLocation + " Rhode Island"+ validMemberID );

                }
                else if(stateID.contains("37"))
                {
                    System.out.println(memberLocation + " New York"+ validMemberID );

                }
                else  if(stateID.contains("38"))
                {
                    System.out.println(memberLocation + " Massachusetts"+ validMemberID );

                }
                else if(stateID.contains("39"))
                {
                    System.out.println(memberLocation + " Vermont"+ validMemberID );

                }
                else if(stateID.contains("40"))
                {
                    System.out.println(memberLocation + " Maine"+ validMemberID );

                }
                else
                {
                    System.out.println("Not valid state ID");
                }

                return;
            }
            else if(regionID == '6')
            {
                System.out.println(memberLocation + " SouthEast " + reg);
                if(stateID.contains("41"))
                {
                    System.out.println(memberLocation + " Mississippi"+ validMemberID );

                }
                else if(stateID.contains("42"))
                {
                    System.out.println(memberLocation + " Alabama"+ validMemberID );

                }
                else if(stateID.contains("43"))
                {
                    System.out.println(memberLocation + " Georgia" + validMemberID );

                }
                else if(stateID.contains("44"))
                {
                    System.out.println(memberLocation + " Florida"+ validMemberID );

                }
                else if(stateID.contains("45"))
                {
                    System.out.println(memberLocation + " Arkansas"+ validMemberID );

                }
                else if(stateID.contains("46"))
                {
                    System.out.println(memberLocation + " North Carolina"+ validMemberID );

                }
                else  if(stateID.contains("47"))
                {
                    System.out.println(memberLocation + " South Carolina"+ validMemberID );

                }
                else  if(stateID.contains("48"))
                {
                    System.out.println(memberLocation + " Tennessee"+ validMemberID );

                }
                else
                {
                    System.out.println("Not valid state ID");
                }
                return;
            }
            else if(regionID == '7')
            {
                System.out.println(memberLocation + " Alaska"+ validMemberID  );
                if(stateID.contains("49"))
                {
                    System.out.println(memberLocation + " Alaska");

                }
                else
                {
                    System.out.println("Not valid state ID");
                }
                return;
            }
            else if(regionID == '8')
            {
                System.out.println(memberLocation + " Pacific Islands");
                if(stateID.contains("50"))
                {
                    System.out.println(memberLocation + " Hawaii"+ validMemberID );

                }
                else
                {
                    System.out.println("Not valid state ID");
                }
                return;
            }
            else
            {

                System.out.println("Person has no region");
                System.out.println("Person State cant be located\n");
                return;
            }
           // return;


        }*/

    /*     String randGuestNum = "1234567890";
         StringBuilder randNum = new StringBuilder();

         Random randGuestStr = new Random();

         while (randNum.length() == 3 )
         {
             int index = (int) (randGuestStr.nextFloat() * randGuestNum.length());
             randNum.append(randGuestNum.charAt(index));
         }
         String strappend = randNum.toString();
         String randStuff = strappend.substring(6,9);
         //return;

         System.out.println(hotelcode + regionID + stateID + randStuff);
         return;
        */
     //}

    public String stateAndRegion(String memberID)

    {
        String memberLocation = "Member is located in ";
        char regionID = memberID.charAt(0);

        String stateID = memberID.substring(1,3);
        String reg = "region " ;
        String validMemberID = "is valid";

        if(regionID == '1')
        {
            System.out.println(memberLocation + " Southwest " + reg);
            if(stateID.contains("01"))
            {
                System.out.println(memberLocation + " Washington" + validMemberID );
                //System.out.println(memberID + randStuff);
                System.out.println(memberID);

            }
            else if(stateID.contains("02"))
            {
                System.out.println(memberLocation + " Oregon" + validMemberID);
                //System.out.println(memberID + randStuff);
                System.out.println(memberID);

            }
            else if(stateID.contains("03"))
            {
                System.out.println(memberLocation + "Idaho" + validMemberID );
                // System.out.println(memberID + randStuff);
                System.out.println(memberID);


            }
            else
            {
                System.out.println("Not valid state ID");
            }
            return memberID;
        }
        else if(regionID == '2')
        {
            System.out.println(memberLocation + " Northwest " + reg);
            if(stateID.contains("04"))
            {
                System.out.println(memberLocation + " Califorina" + validMemberID );

            }
            else if(stateID.contains("05"))
            {
                System.out.println(memberLocation + " Arizona" + validMemberID );

            }
            else if(stateID.contains("06"))
            {
                System.out.println(memberLocation + " Nevada" + validMemberID );

            }
            else if(stateID.contains("07"))
            {
                System.out.println(memberLocation + " Uath" + validMemberID );

            }
            else
            {
                System.out.println("Not valid state ID");
            }

            return memberID;
        }
        else if(regionID == '3')
        {
            System.out.println(memberLocation + " SouthCentral " + reg);
            if(stateID.contains("08"))
            {
                System.out.println(memberLocation + " New Mexico" + validMemberID );

            }
            else if(stateID.contains("09"))
            {
                System.out.println(memberLocation + " Oklahoma"+ validMemberID );

            }
            else if(stateID.contains("10"))
            {
                System.out.println(memberLocation + " Texas"+ validMemberID );

            }
            else if(stateID.contains("11"))
            {
                System.out.println(memberLocation + "Louisana"+ validMemberID );

            }
            else
            {
                System.out.println("Not valid state ID");
            }
            return memberID;
        }
        else if(regionID == '4')
        {
            System.out.println(memberLocation + " NorthCentral " + reg);
            if(stateID.contains("12"))
            {
                System.out.println(memberLocation + " Montana"+ validMemberID );

            }
            else if(stateID.contains("13"))
            {
                System.out.println(memberLocation + " Wyoming"+ validMemberID );

            }
            else if(stateID.contains("14"))
            {
                System.out.println(memberLocation + " Colorado"+ validMemberID );

            }
            else if(stateID.contains("15"))
            {
                System.out.println(memberLocation + " North Dakoda"+ validMemberID );

            }
            else if(stateID.contains("16"))
            {
                System.out.println(memberLocation + " South Dakoda"+ validMemberID );

            }
            else if(stateID.contains("17"))
            {
                System.out.println(memberLocation + " Nebraska"+ validMemberID);

            }
            else if(stateID.contains("18"))
            {
                System.out.println(memberLocation + " Kansas"+ validMemberID );
            }
            else
            {
                System.out.println("Not valid state ID");
            }

            return memberID;
        }
        else if(regionID == '5')
        {
            System.out.println(memberLocation + " NorthEast " + reg);
            if(stateID.contains("19"))
            {
                System.out.println(memberLocation + " Minnestoa"+ validMemberID );

            }
            else if(stateID.contains("20"))
            {
                System.out.println(memberLocation + " New Hampshire"+ validMemberID );

            }
            else if(stateID.contains("21"))
            {
                System.out.println(memberLocation + " Iowa"+ validMemberID );

            }
            else if(stateID.contains("22"))
            {
                System.out.println(memberLocation + " Missouri"+ validMemberID );

            }
            else if(stateID.contains("23"))
            {
                System.out.println(memberLocation + " Wisconsin"+ validMemberID );

            }
            else if(stateID.contains("24"))
            {
                System.out.println(memberLocation + " ILLinois"+ validMemberID );

            }
            else if(stateID.contains("25"))
            {
                System.out.println(memberLocation + " Kentucky"+ validMemberID );

            }
            else if(stateID.contains("26"))
            {
                System.out.println(memberLocation + " Indiana"+ validMemberID );

            }
            else if(stateID.contains("27"))
            {
                System.out.println(memberLocation + " Ohio"+ validMemberID );

            }
            else if(stateID.contains("28"))
            {
                System.out.println(memberLocation + " Michigan"+ validMemberID );

            }
            else if(stateID.contains("29"))
            {
                System.out.println(memberLocation + " Virginia"+ validMemberID );

            }
            else if(stateID.contains("30"))
            {
                System.out.println(memberLocation + " West Virginia"+ validMemberID );

            }
            else if(stateID.contains("31"))
            {
                System.out.println(memberLocation + " Maryland"+ validMemberID );

            }
            else if(stateID.contains("32"))
            {
                System.out.println(memberLocation + " Delaware"+ validMemberID );

            }
            else if(stateID.contains("33"))
            {
                System.out.println(memberLocation + " New Jersey"+ validMemberID );

            }
            else if(stateID.contains("34"))
            {
                System.out.println(memberLocation + " Pennsylvania"+ validMemberID );

            }
            else if(stateID.contains("35"))
            {
                System.out.println(memberLocation + " Connecticut"+ validMemberID );

            }
            else if(stateID.contains("36"))
            {
                System.out.println(memberLocation + " Rhode Island"+ validMemberID );

            }
            else if(stateID.contains("37"))
            {
                System.out.println(memberLocation + " New York"+ validMemberID );

            }
            else  if(stateID.contains("38"))
            {
                System.out.println(memberLocation + " Massachusetts"+ validMemberID );

            }
            else if(stateID.contains("39"))
            {
                System.out.println(memberLocation + " Vermont"+ validMemberID );

            }
            else if(stateID.contains("40"))
            {
                System.out.println(memberLocation + " Maine"+ validMemberID );

            }
            else
            {
                System.out.println("Not valid state ID");
            }

            return memberID;
        }
        else if(regionID == '6')
        {
            System.out.println(memberLocation + " SouthEast " + reg);
            if(stateID.contains("41"))
            {
                System.out.println(memberLocation + " Mississippi"+ validMemberID );

            }
            else if(stateID.contains("42"))
            {
                System.out.println(memberLocation + " Alabama"+ validMemberID );

            }
            else if(stateID.contains("43"))
            {
                System.out.println(memberLocation + " Georgia" + validMemberID );

            }
            else if(stateID.contains("44"))
            {
                System.out.println(memberLocation + " Florida"+ validMemberID );

            }
            else if(stateID.contains("45"))
            {
                System.out.println(memberLocation + " Arkansas"+ validMemberID );

            }
            else if(stateID.contains("46"))
            {
                System.out.println(memberLocation + " North Carolina"+ validMemberID );

            }
            else  if(stateID.contains("47"))
            {
                System.out.println(memberLocation + " South Carolina"+ validMemberID );

            }
            else  if(stateID.contains("48"))
            {
                System.out.println(memberLocation + " Tennessee"+ validMemberID );

            }
            else
            {
                System.out.println("Not valid state ID");
            }
            return memberID;
        }
        else if(regionID == '7')
        {
            System.out.println(memberLocation + " Alaska"+ validMemberID  );
            if(stateID.contains("49"))
            {
                System.out.println(memberLocation + " Alaska");

            }
            else
            {
                System.out.println("Not valid state ID");
            }
            return memberID;
        }
        else if(regionID == '8')
        {
            System.out.println(memberLocation + " Pacific Islands");
            if(stateID.contains("50"))
            {
                System.out.println(memberLocation + " Hawaii"+ validMemberID );

            }
            else
            {
                System.out.println("Not valid state ID");
            }
            return memberID;
        }
        else if (regionID == '9')
        {
            System.out.println(memberLocation + " International");
            if(stateID.contains("60") || stateID.contains("70") ||stateID.contains("80") ||stateID.contains("90"))
            {
                System.out.println(memberLocation + "is  International "+ validMemberID );

            }
            else
            {
                System.out.println("Not valid state ID");
            }
            return memberID;
        }
        else
        {

            System.out.println("Person has no region");
            System.out.println("Person State cant be located\n");
            return memberID;
        }
        // return;


    }

    public String threeDigitRandString(String randStr)
    {
        int threeDigts = (int) (Math.random() * 999);
        while(threeDigts >= 100) {
           // int threeDigts = (int) (Math.random() * 999);
            //  threeDigts = randStr;
            Integer.toString(threeDigts);
            String threeDigitStr = Integer.toString(threeDigts);
            System.out.println(threeDigts);
            return threeDigitStr;
        }
        return randStr;

    }

    public String hotelMembershipID(String idnum)
    {
        /* threeDigitRandString(); */
        System.out.println("Enter 3 digit hotel code ");
        Scanner sc = new Scanner(System.in);
        String hotelCode = sc.next();
        System.out.println("Enter valid state and region ID combination");
        String regandstate = sc.next();

       System.out.print("Member ID is  " + hotelCode + stateAndRegion(""+regandstate)  +  threeDigitRandString(""));
        return idnum;
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
