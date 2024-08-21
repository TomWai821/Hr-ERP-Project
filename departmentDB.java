import java.util.ArrayList;

public class departmentDB 
{
    protected DepartmentModel departmentModel;
    ArrayList<DepartmentModel> departmentDB = new ArrayList<DepartmentModel>();
    int i = 0;

    protected void viewAllDepartment()
    {
        System.out.println("----------");
        System.out.println("There are " + departmentDB.size() + " department in this company");
        for(DepartmentModel department : departmentDB)
        {
            System.out.println("----------");
            System.out.println("Department ID:" + department.departmentID + ", " + "Department Name:" + department.departmentName);
        }
    }

    protected void createDepartment(String departmentID, String departmentName)
    {
        departmentModel = new DepartmentModel(departmentID, departmentName);
        departmentDB.add(departmentModel);
    }

    protected void updateDepartment(String departmentID, String newDepartmentName)
    {
        while(i < departmentDB.size())
        {
            if(departmentID.contains(departmentDB.get(i).departmentID))
            {
                departmentModel = new DepartmentModel(departmentID, newDepartmentName);
                departmentDB.set(i, departmentModel);
                System.out.println("Update sucessfully!");
                break;
            }
            i++;
        }

        if(i == departmentDB.size())
        {
            System.out.println("Invalid departmentID!");
        }
    }

    protected void deleteDepartment(String departmentID)
    {
        while(i < departmentDB.size())
        {
            if(departmentDB.get(i).departmentID.contains(departmentID))
            {
                departmentDB.remove(i);
                System.out.println("Remove sucessfully!");
                break;
            }
            i++;
        }

        if(i == departmentDB.size())
        {
            System.out.println("Invalid departmentID!");
        }
    }
}