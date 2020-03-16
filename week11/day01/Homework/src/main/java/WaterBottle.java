public class WaterBottle {

    int volume = 100;


    public int drink(){
        if (this.volume >= 10) {
            this.volume = this.volume - 10;
            System.out.println("Some water has been drunk. Only " + this.volume + " left.");
        } else {
            System.out.println("The water bottle is already empty!");
        }
        return this.volume;
    }

    public int empty(){
        if (this.volume == 0) {
            System.out.println("The bottle is already empty!");
        } else {
            System.out.println("The bottle has been emptied.");
            this.volume = 0;
        }
        return this.volume;
    }

    public int fill(){
        if (this.volume == 100) {
            System.out.println("The bottle is already full!");
        } else {
            System.out.println("The bottle has been filled.");
            this.volume = 100;
        }
        return this.volume;
    }


}
