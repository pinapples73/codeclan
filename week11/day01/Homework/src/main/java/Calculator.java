public class Calculator {

    private int number1;
    private int number2;


    public Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int add(){
        int total = this.number1 + this.number2;
        return total;
    }

    public int subtract(){
        int total = this.number1 - this.number2;
        return total;
    }

    public int multiply(){
        int total = this.number1 * this.number2;
        return total;
    }

    public double divide(){
        double total = this.number1 / this.number2;
        return total;
    }
}
