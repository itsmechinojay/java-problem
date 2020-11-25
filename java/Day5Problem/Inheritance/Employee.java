package Day5Problem.Inheritance;

public class Employee{

    private int id;
    private String ename;
    private String email;
    private int vacationDays;

    public Employee(){

    }

    public Employee(int id, String ename, String email, int vacationDays) {
        this.id = id;
        this.ename = ename;
        this.email = email;
        this.vacationDays = vacationDays;
    }

    public void printDetails(){
        System.out.println("Id : " + this.id);
        System.out.println("Name : "+this.ename);
        System.out.println("Email : "+this.email);
        System.out.println("Vacation Days : " + this.vacationDays);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }
}
