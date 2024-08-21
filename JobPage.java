import java.util.Scanner;

public class JobPage implements pagesInterface
{
    protected Pages page;
    protected JobDB jobDB;
    protected departmentDB departmentDB;

    Scanner s = new Scanner(System.in);

    protected void jobPage()
    {
        System.out.println("----------");
        System.out.println("1. Create job");
        System.out.println("2. View job title Data");
        System.out.println("3. Update job title Data");
        System.out.println("4. Delete job title");
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
                page.MainPage();
            default:
                System.out.println("Invalid Input! Please input the value again!");
                page.MainPage();
        }
    }

    @Override
    public void create()
    {
        System.out.print("Input the jobTitle:");

        System.out.print("Input the departmentID:");
        String departmentID = s.next();

        System.out.print("Input the lowest Salary:");
        int lowest = s.nextInt();

        System.out.print("Input the highest Salary:");
        int highest = s.nextInt();

    }

    @Override
    public void view()
    {
        
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
