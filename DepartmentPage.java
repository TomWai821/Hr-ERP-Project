import java.util.Scanner;

public class DepartmentPage implements pagesInterface
{
    Scanner s = new Scanner(System.in);
    protected departmentDB departmentDB = new departmentDB();
    protected String departmentName, departmentID;

    protected fileUtils fileUtils = new fileUtils();
    protected String fileName = "department.txt"; 
    protected String directoryPath = "./Department";
    protected String filePath = "./Department/" + fileName;

    protected void departmentPage()
    {
        fileUtils.createFile(directoryPath, filePath);

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
        fileUtils.writeFile(filePath, "DepartmentID:"+departmentID + ", DeparmentName:" + departmentName);
        departmentPage();
    }

    @Override
    public void view()
    {
        System.out.println("----------");
        System.out.println("There are " + departmentDB.departmentDB.size() + " department in this company");
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

    


}
