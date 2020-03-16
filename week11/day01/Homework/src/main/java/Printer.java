public class Printer {

    private int numberOfSheets = 20;
    private int toner = 30;
    private int sheets;
    private int copies;

    public Printer(int sheets, int copies){
        this.sheets = sheets;
        this.copies = copies;
    }

    public int paperCheck(){
        if(this.numberOfSheets == 20) {
            System.out.println("The printer paper is at 100% capacity");
        } else {
            System.out.println("The printer has " + this.numberOfSheets + " sheets of paper left.");
        }
        return this.numberOfSheets;
    }

    public int tonerCheck(){
        return this.toner;
    }

    public boolean print(){
        int totalPages = this.sheets * this.copies;

        if(this.numberOfSheets >= totalPages){
            System.out.println("The print has completed.");
            this.numberOfSheets = this.numberOfSheets - totalPages;
            this.toner = this.toner - totalPages;
            return true;
        } else {
            System.out.println("There is not enough paper in the printer.");
            return false;
        }
    }


}
