import java.util.Scanner;

public class Pages
{
    EmployeeDB db;
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

        System.out.print("Your option:");
        int input = s.nextInt();

        switch(input)
        {
            case 1:
                Login();
            case 2:
                Register();
            case 3:
                System.out.println("Thank you for your using! See you next time!");
                break;
            default:
                System.out.println("Invalid Input! Please input the value again!");
                LoginPage();
        }
    }

    protected void MainPage()
    {
        System.out.println("");
    }

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
                
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                System.out.println("Invalid Input! Please input the value again!");
                LoginPage();
        }
    }

    protected void departmentPage()
    {
        System.out.println("----------");
        System.out.println("1. Create department");
        System.out.println("2. View department Data");
        System.out.println("3. Update department Data");
        System.out.println("4. Delete department");
        System.out.println("5. Exit");
        System.out.println("----------");
        System.out.print("Your option:");
    }

    protected void jobPage()
    {

    }

    protected void Login()
    {
        System.out.print("Login ID:");
        String EmployeeID = s.next();

        System.out.print("Password:");
        String password = s.next();
        db.LoginAuth(EmployeeID, password);
    }

    protected void Register()
    {
        db.RegisterAuth();
    }

    public static void main(String[] args)
    {
        Pages p = new Pages();
        p.LoginPage();
    }
}
