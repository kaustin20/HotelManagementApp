package hotelbackend;

public class HotelEmployee {

    private String workerName;
    private int employeeIdNum;
    private String jobTitle;
    private int employeeSalary;
    private String employeeRolls;

   public void setName(String name)
   {
        workerName = name;

   }

    public void setIdnum(int Idnumber)
    {
        employeeIdNum = Idnumber;

    }
    public void setIdnum(String Idnumber)
    {

        employeeIdNum = Integer.parseInt(Idnumber);
    }

    public void setTitle(String title)
    {
        jobTitle = title;

    }
    public void setSalary(int Salary)
    {
        employeeSalary = Salary;

    }
    public void setEmployeeResponsibility(String rollsOfEmployee)
    {
        employeeRolls = rollsOfEmployee;

    }

    public String getName()
    {
        return workerName;
    }


    public int getIdnum()
    {
        //employeeIdNum = (int) (Math.random() * 9999);
        return employeeIdNum;

    }

    public String getTitle()
    {
        return jobTitle;
    }

    public int getSalary()
    {
        return employeeSalary;
    }
    public String getEmployeeResponsibility()
    {
        return employeeRolls;
    }

    public HotelEmployee( String employeeName, int numID, String hotelPosition, int jobSalary, String responsibility)
    {
        workerName = employeeName;
        employeeIdNum = numID;
        jobTitle = hotelPosition;
        employeeSalary = jobSalary;
        employeeRolls = responsibility;

    }

    public HotelEmployee( String employeeName, int numID, String hotelPosition)
    {
        workerName = employeeName;
        employeeIdNum = numID;
        jobTitle = hotelPosition;
        employeeSalary = 0;
        employeeRolls = "";
    }

    public HotelEmployee()
    {
        workerName = "";
        employeeIdNum = 0;
        jobTitle = "";
        employeeSalary = 0;
        employeeRolls = "";

    }

    public String hireEmployee(HotelEmployee name) {
        while (workerName.equals(name)) {
            if (workerName.contains(".*[a-z].*") || workerName.contains(".*[a-z].*")) {
                System.out.println("welcome to our hotel");
                return workerName;
            } else {
                System.out.println("name not valid");
                return "";
            }
        }


        return workerName;
    }


}
