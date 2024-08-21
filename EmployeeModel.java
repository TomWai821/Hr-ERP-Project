import java.util.Scanner;

public class EmployeeModel
{
    Scanner s = new Scanner(System.in);

    protected String employeeID;
    protected String[] jobTitle;
    protected String[] fullName;
    protected String password;
    protected String supervisor;
    protected int salary;
    protected String departmentID;

    public EmployeeModel(String departmentID, String[] jobTitle, String supervisor, String employeeID, String password, int salary)
    {
        this.departmentID = departmentID;
        this.jobTitle = jobTitle;
        this.supervisor = supervisor;
        this.employeeID = departmentID + employeeID;
        this.password = password;
        this.salary = salary;
    }

    protected class Manager extends EmployeeModel 
    {
        public Manager(String departmentID, String[] jobTitle, String supervisor, String employeeID, String password, int salary)
        {
            super(departmentID, jobTitle, supervisor, employeeID, password, salary);
        }
    }
}

