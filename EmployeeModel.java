import java.util.Scanner;

public class EmployeeModel
{
    private static EmployeeDB db = new EmployeeDB();
    Scanner s = new Scanner(System.in);


    interface employeeInterface
    {
        public employeeModel create(String departmentID, String jobTitle, String supervisor, String employeeID, String password, int salary);
    }

    abstract class employeeModel
    {
        protected String departmentID;
        protected String jobTitle;
        protected String employeeID;
        protected String password;
        protected String supervisor;
        protected int salary;

        public employeeModel(String departmentID, String jobTitle, String supervisor, String employeeID, String password, int salary)
        {
            this.departmentID = departmentID;
            this.jobTitle = jobTitle;
            this.supervisor = supervisor;
            this.employeeID = departmentID + employeeID;
            this.password = password;
            this.salary = salary;
        }

        protected boolean searchID(String employeeId)
        {
            return employeeId == employeeID;
        }
    }

    protected class Manager extends employeeModel implements employeeInterface
    {
        public Manager(String departmentID, String jobTitle, String supervisor, String employeeID, String password, int salary)
        {
            super(departmentID, jobTitle, supervisor, employeeID, password, salary);
        }

        @Override
        public employeeModel create(String departmentID, String jobTitle, String supervisor, String employeeID, String password, int salary)
        {
            Manager manager = new Manager(departmentID, jobTitle, supervisor,employeeID, password, salary);

            if(!jobTitle.contains("Manager"))
            {
                System.out.println("Invalid job jobTitle!");
                return null;
            }

            if(salary <= 25000 || salary >= 50000)
            {
                System.out.println("Invalid salary amount!");
                return null;
            }

            db.addEmployee(manager);
            return manager;
        }
    }

    protected class Employee extends employeeModel implements employeeInterface
    {
        public Employee(String departmentID, String jobTitle, String supervisor, String employeeID, String password, int salary)
        {
            super(departmentID, jobTitle, supervisor,employeeID, password, salary);
        }

        @Override
        public employeeModel create(String departmentID, String jobTitle, String supervisor, String employeeID, String password, int salary)
        {
            Employee employee = new Employee(departmentID, jobTitle, supervisor,employeeID, password, salary);

            if(supervisor == null)
            {
                System.out.println("Invalid input!");
            }

            db.addEmployee(employee);
            return employee;
        }
    }
}
