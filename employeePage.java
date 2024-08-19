import java.util.Scanner;

public class employeePage 
{
    Scanner s = new Scanner(System.in);
    

    protected void createEmployee()
    {
        System.out.print("Please input the employee departmentID:");
        String departmentID = s.next();
    
        System.out.print("Please input the employee job jobTitle:");
        String jobTitle = s.next();
    
        System.out.print("Please input the employeeemployeeID:");
        String employeeID = s.next();
    
        System.out.print("Please input the password:");
        String password = s.next();
    
        System.out.print("Please input the employee Salary:");
        int salary = s.nextInt();
        
    }

    protected void viewEmployeeData()
    {
        System.out.print("Please input the employeeID:");
        String employeeID = s.next();
    }
}
