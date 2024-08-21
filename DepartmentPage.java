import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DepartmentPage implements pagesInterface
{
    Scanner s = new Scanner(System.in);
    departmentDB departmentDB = new departmentDB();
    String departmentName, departmentID;
    String directoryPath = "./Department";
    String filePath = "./Department/department.txt";
    File directory = new File(directoryPath);
    File file = new File(filePath);

    protected void departmentPage()
    {
        createFile();

        Pages page = new Pages();
        System.out.println("----------");
        System.out.println("1. Create department");
        System.out.println("2. View department Data");
        System.out.println("3. Update department Data");
        System.out.println("4. Delete department");
        System.out.println("5. Exit");
        System.out.println("----------");

        System.out.println("Your option:");
        int input = s.nextInt();

        switch(input)
        {
            case 1:
                create();
                break;
            case 2:
                view();
                break;
            case 3:
                update();
                break;
            case 4:
                delete();
                break;
            case 5:
                page.MainPage();
                break;
            default:
                System.out.println("Invalid Input! Please input the value again!");
                page.MainPage();
                break;
        }
    }

    @Override
    public void create()
    {
        System.out.println("----------");
        System.out.println("Please enter department ID:");
        departmentID = s.next();

        s.nextLine();
        System.out.println("Please enter department name:");
        departmentName = s.nextLine();

        departmentDB.createDepartment(departmentID, departmentName);
        departmentPage();
        writeFile(departmentID, departmentName);
    }

    @Override
    public void view()
    {
        departmentDB.viewAllDepartment();
        departmentPage();
    }

    @Override
    public void update()
    {
        System.out.println("----------");
        System.out.println("Please enter departmentID");
        departmentID = s.next();

        s.nextLine();
        System.out.println("Please enter new department Name:");
        String newDepartmentName = s.nextLine();
        
        departmentDB.updateDepartment(departmentID, newDepartmentName);
        departmentPage();
    }

    @Override
    public void delete()
    {
        System.out.println("----------");
        s.nextLine();
        System.out.println("Please input departmentID:");
        departmentID = s.nextLine();

        departmentDB.deleteDepartment(departmentID);
        departmentPage();
    }

    protected void createFile()
    {
        try
        {
            if(!directory.exists())
            {
                directory.mkdir();
            }

            if(!file.exists())
            {
                file.createNewFile();
            }
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }

    protected void writeFile(String departmentID, String departmentName)
    {
        try
        {
            FileWriter writer = new FileWriter(file);
            writer.write(departmentID);
            writer.close();
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }

}
