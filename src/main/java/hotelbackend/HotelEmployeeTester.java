package hotelbackend;
import java.util.*;
public class HotelEmployeeTester {
        public static void main(String[] args)
        {
            HotelEmployee employee = new HotelEmployee();
            //HotelEmployee employee1 = new HotelEmployee("Kyle Austin ", 13242);
            HotelEmployee employee1 = new HotelEmployee("Kyle Austin ", 13242, "Manager");


            System.out.println("Name\t\t  ID \t\t Title\t\t  Salary \t\t Responsibility " );
            System.out.println(employee1.getName() +  employee1.getIdnum() + "\t\t" + employee1.getTitle() );
            System.out.println(employee1.hireEmployee(employee1) + "has been hired");

        }




}
