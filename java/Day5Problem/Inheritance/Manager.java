package Day5Problem.Inheritance;

public class Manager extends Employee {

    private int numberOfReportees;

    public Manager(int id, String ename, String email, int vacationDays, int numberOfReportees) {
        super(id, ename, email, vacationDays);
        this.numberOfReportees = numberOfReportees;
    }
    

    public int getNumberOfReportees() {
        return numberOfReportees;
    }

    public void setNumberOfReportees(int numberOfReportees) {
        this.numberOfReportees = numberOfReportees;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Number of Reportees : " + this.numberOfReportees);
    }

    public Manager(){

    }

}


