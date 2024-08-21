import java.util.Scanner;

public class EmployeePage implements pagesInterface
{
    Scanner s = new Scanner(System.in);
    Pages pages;
    EmployeeDB db;
    EmployeeModel employee;
    
    protected void employeePage()
    {
        System.out.println("----------");
        System.out.println("1. Create employee");
        System.out.println("2. View employee Data");
        System.out.println("3. Update employee Data");
        System.out.println("4. Delete employee");
        System.out.println("5. Exit");
        System.out.println("----------");

        System.out.print("Your option:");
        int input = s.nextInt();

        switch(input)
        {
            case 1:
                create();
            case 2:
                view();
            case 3:
                update();
            case 4:
                delete();
            case 5:
                pages.MainPage();
            default:
                System.out.println("Invalid Input! Please input the value again!");
                pages.MainPage();
        }
    }

    @Override
    public void create()
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
        
        db.addEmployee(null);
    }

    @Override
    public void view()
    {
        System.out.print("Please input the employeeID:");
        String employeeID = s.next();
    }

    @Override
    public void update()
    {

    }

    @Override
    public void delete()
    {

    }
}
