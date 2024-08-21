import java.util.ArrayList;


public class JobDB 
{
    protected ArrayList<JobModel> jobDB = new ArrayList<JobModel>();
    protected departmentDB departmentDB;
    protected int i = 0;
    protected JobPage jobPage;
    protected JobModel jobModel;

    protected void viewAllJob()
    {
        System.out.println("----------");
        System.out.println("There are "+ jobDB.size() + " job in this company");
        System.out.println("----------");
        for(JobModel job: jobDB)
        {
            printData(job);
        }
    }

    // Create a job (Based on JobTitle, departmentID, lowestSalary and highestSalary)
    protected JobModel createJob(JobModel job)
    {
        jobDB.add(jobModel);
        return job;
    }

    // Search the job (Based on DepartmentID)
    protected void searchJob(String departmentID)
    {

    }

    // Search the job (Based on lowestSalary and highestSalary)
    protected void searchJob(int lowestSalary, int highestSalary)
    {

    }

    // Search the job (Based on departmentID, lowestSalary and highestSalary)
    protected void searchJob(String departmentID, int lowestSalary, int highestSalary)
    {

    }

    // Delete the job (Based on jobTitle)
    protected void deleteJob(String jobTitle)
    {

    }

    protected void printData(JobModel job)
    {
        System.out.println("Department ID:" + job.departmentID);
        System.out.println("Job Title:" + job.jobTitle);
        System.out.println("Salary Range:" + job.lowestSalary + "-" + job.highestSalary);
        System.out.println("----------");
    }
}
