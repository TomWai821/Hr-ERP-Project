public class JobModel 
{
    abstract class jobModel
    {
        protected String jobTitle;
        protected String departmentID;
        protected int lowestSalary;
        protected int highestSalary;
        
        protected jobModel(String jobTitle, String departmentID, int lowestSalary, int highestSalary)
        {
            this.jobTitle = jobTitle;
            this.departmentID = departmentID;
            this.lowestSalary = lowestSalary;
            this.highestSalary = highestSalary;
        }
        
    }
}
