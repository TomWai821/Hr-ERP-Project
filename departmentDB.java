import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class departmentDB 
{
    String departmentID;
    String departmentName;
    protected HashMap<String, String> departmentMap = new HashMap<String, String>();

    protected void printAllDepartment()
    {
        Set deparmentSet = departmentMap.entrySet();
        Iterator departmenIterator = deparmentSet.iterator();

        while(departmenIterator.hasNext())
        {
            Map.Entry getData = (Map.Entry) departmenIterator.next();
            System.out.println("department ID:" + getData.getKey() + ",department Name:" + getData.getValue());
        }
    }

    protected void createDepartment(String departmentID, String departmentName)
    {
        if(!departmentMap.containsKey(departmentID) && !departmentMap.containsValue(departmentName))
        {
            departmentMap.put(departmentID, departmentName);
            System.out.println("Create department successfully!");
        }
        else
        {
            System.out.println("Invalid Input!");
        }
    }

    protected boolean searchDepartment(String departmentID)
    {
        if(departmentMap.containsKey(departmentID))
        {
            System.out.println(departmentID + " found!");
            System.out.println("department ID:" + departmentMap.get(departmentID) + ",department Name:" + departmentMap.get(departmentName));
            return true;
        }

        System.out.println("Invalid input! Please input correct data!");
        return false;
    }
}
