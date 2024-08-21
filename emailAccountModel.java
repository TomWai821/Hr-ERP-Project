public class emailAccountModel
{
    
    abstract class EmailAccountModel
    {
        protected String accountID;
        protected String accountName;
        protected String password;
        protected String employeeID;
        protected String status;

        protected EmailAccountModel(String accountID, String accountName, String password, String employeeID, String status)
        {
            this.accountID = accountID;
            this.accountName = accountName;
            this.password = password;
            this.employeeID = employeeID;
            this.status = status;
        }
    }
}
