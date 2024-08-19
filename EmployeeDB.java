import java.util.ArrayList;
import java.util.List;

interface dbInterface
{
    int countValue();
    void printAllValue();
}

public class EmployeeDB implements dbInterface
{
    protected List<EmployeeModel.employeeModel> employeeDB = new ArrayList<EmployeeModel.employeeModel>();
    protected EmployeeModel.employeeModel employee;
    protected Pages login;
    protected int i = 0;

    @Override
    public int countValue()
    {
        System.out.println("There are "+ employeeDB.size() + " employeeModelin this company");
        return employeeDB.size();
    }

    @Override
    public void printAllValue()
    {
        int i = 0;
        System.out.println("----------");
        while(i < countValue())
        {
            System.out.println("Department: "  + employeeDB.get(i).departmentID);
            System.out.println("Position: "  + employeeDB.get(i).jobTitle);
            System.out.println("EmployeeID: "  + employeeDB.get(i).employeeID);
            System.out.println("Salary: $" + employeeDB.get(i).salary);
            System.out.println("----------");
            i++;
        }
    }

    protected EmployeeModel.employeeModel addEmployee(EmployeeModel.employeeModel employee)
    {
        if(employeeDB.contains(employee))
        {
            System.out.println("Already have this employeeModelin this table!");
            return null;
        }
        System.out.println("Add employeeModel successfully!");
        employeeDB.add(employee);
        return employee;
    }

    protected void LoginAuth(String employeeID, String Password)
    {
        int i = searchEmployee(employeeID, Password);

        if(i != -1)
        {
            System.out.println("Login Successfully!");
            login.MainPage();
        }
        else
        {
            System.out.println("Invalid Data!");
        }
    }

    protected void RegisterAuth(String employeeID, String Password)
    {
        int i = searchEmployee(employeeID, Password);

        if(i != -1)
        {
            System.out.println("Account with these data already exist!");
        }
        else
        {
            System.out.println("Register Successfully!");
            employeeDB.add(employee);
            login.MainPage();
        }
    }


    protected void removeEmployee(String employeeID)
    {
        int i = searchEmployee(employeeID);
        if(i != -1)
        {
            employeeDB.remove(i);
            System.out.println("Remove "+ employeeID +" successfully!");
        }
        else
        {
            System.out.println("Invalid employeeID!");
        }
    }

    protected int searchEmployee(String employeeID)
    {
        int i = 0;
        while(i < employeeDB.size())
        {
            if(employeeDB.get(i).employeeID.equals(employeeID))
            {
                return i;
            }
            i++;
        }
        return -1;
    }

    protected int searchEmployee(String employeeID, String Password)
    {
        int i = 0;
        while(i < employeeDB.size())
        {
            if(employeeDB.get(i).employeeID.equals(employeeID) && employeeDB.get(i).password.equals(Password))
            {
                return i;
            }
            i++;
        }
        return -1;
    }

}
