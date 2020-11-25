package Day5Problem.Inheritance;

public class CompanyDemo {

    public static void main(String[] args){

        Employee employee = new Employee(101234,"John Peter","john.peter@accenture.com",10);

        employee.printDetails();

        Manager manager = new Manager(1,"","",1,10);
//        manager.setId(101234);
//        manager.setEname("John Peter");
//        manager.setEmail("john.peter@accenture.com");
//        manager.setVacationDays(10);
        manager.setNumberOfReportees(10);

        manager.printDetails();

    }

}
