import java.util.Scanner;

interface pagesInterface
{
    void create();
    void view();
    void update();
    void delete();
}

public class Pages
{
    Scanner s = new Scanner(System.in);

    protected String EmployeeID;
    protected String password;

    protected void LoginPage()
    {
        System.out.println("Welcome to Employee System");
        System.out.println("----------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.println("----------");

        System.out.println("Your option:");
        int input = s.nextInt();
        System.out.println("----------");

        switch(input)
        {
            case 1:
                Login();
                MainPage();
                break;
            case 2:
                Register();
                MainPage();
                break;
            case 3:
                System.out.println("Thank you for your using! See you next time!");
                System.out.println("----------");
                break;
            default:
                System.out.println("Invalid Input! Please input the value again!");
                System.out.println("----------");
                LoginPage();
                break;
        }
    }

    protected void MainPage()
    {
        DepartmentPage department = new DepartmentPage();
        EmployeePage employee = new EmployeePage();
        EmailAccountPage email = new EmailAccountPage();
        JobPage job = new JobPage();

        System.out.println("----------");
        System.out.println("1. View department page");
        System.out.println("2. View employee page");
        System.out.println("3. View email account page");
        System.out.println("4. View job page");
        System.out.println("5. Logout");
        System.out.println("----------");

        System.out.println("Your option:");
        int input = s.nextInt();

        switch(input)
        {
            case 1:
                department.departmentPage();
                break;
            case 2:
                employee.employeePage();
                break;
            case 3:
                email.emailAccountPage();
                break;
            case 4:
                job.jobPage();
                break;
            case 5:
                System.out.println("See you next time!");
                System.out.println("----------");
                LoginPage();
                break;

            default:
                System.out.println("Invalid Input! Please input the value again!");
                MainPage();
                break;
        }
    }

    protected void Login()
    {
        System.out.println("Login ID:");
        String accountID = s.next();

        System.out.println("Password:");
        String password = s.next();

        if(accountID.contains("admin") && password.contains("admin"))
        {
            MainPage();
        }
    }

    protected void Register()
    {
        System.out.print("Employee ID:");
        String employeeID = s.next();

        System.out.println("Login ID:");
        String accountID = s.next();

        System.out.println("Password:");
        String password = s.next();
    }

    public static void main(String[] args)
    {
        Pages page = new Pages();
        page.LoginPage();
    }
}
