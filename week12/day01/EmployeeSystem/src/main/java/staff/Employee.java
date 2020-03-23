package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public void setSalary(int salary) {
        if(salary >= 0){
            this.salary = salary;
        }
    }

    public void raiseSalary(double raise){
        this.salary += raise;
    }

    public int payBonus(){
        return this.salary / 100;
    }

}
