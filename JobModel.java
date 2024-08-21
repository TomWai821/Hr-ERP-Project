public class JobModel 
{
    protected String[] jobTitle;
    protected String departmentID;
    protected int lowestSalary;
    protected int highestSalary;
        
    public JobModel(String[] jobTitle, String departmentID, int lowestSalary, int highestSalary)
    {
        this.jobTitle = jobTitle;
        this.departmentID = departmentID;
        this.lowestSalary = lowestSalary;
        this.highestSalary = highestSalary;
    }
}
