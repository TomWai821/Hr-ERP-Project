import java.util.ArrayList;

public class EmployeeDB 
{
    protected EmployeeModel employee;
    protected ArrayList<EmployeeModel> employeeDB = new ArrayList<EmployeeModel>();
    protected JobModel jobModel;
    protected Pages page;
    protected int i = 0;

    protected void addEmployee(EmployeeModel employee)
    {
        employeeDB.add(employee);
        System.out.println("Add employee Successfully!");
    }

    protected void viewEmployee(String employeeID)
    {
        if(employeeID.contains(employee.employeeID))
        {
            System.out.println("----------");
            printEmployee(employee);
        }
        else
        {
            System.out.println("Invalid employeeID!");
        }
    }

    protected void viewAllEmployee()
    {
        System.out.println("----------");
        System.out.println("There are "+ employeeDB.size() + " employee in this company");
        System.out.println("----------");

        for(EmployeeModel employee: employeeDB)
        {
            printEmployee(employee);
        }
    }

    protected void printEmployee(EmployeeModel employee)
    {
        System.out.println("Employee ID:" + employee.employeeID);
        System.out.println("Job Title:" + employee.jobTitle);
        System.out.println("Employee ID:" + employee.fullName);
        System.out.println("Salary:" + employee.salary);
        System.out.println("Department ID:" + employee.departmentID);
        System.out.println("----------");
    }

    protected void updateEmployee(String employeeID, EmployeeModel employee)
    {
        if(employeeID.contains(employee.employeeID))
        {

        }
        else
        {
            System.out.println("Invalid employeeID!");
        }
    }

    protected void removeEmployee(String employeeID)
    {
        if(employeeID.contains(employee.employeeID))
        {

        }
        else
        {
            System.out.println("Invalid employeeID!");
        }
    }
}
