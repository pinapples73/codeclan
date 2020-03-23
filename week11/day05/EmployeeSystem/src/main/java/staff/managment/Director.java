package staff.managment;

public class Director extends Manager {

    private double budget;

    public Director(String name, String niNumber, int salary, String deptName, double budget){
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public int payBonus(){
        return (this.getSalary() / 100) * 2;
    }
}
