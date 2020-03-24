public class MarathonRunner extends Athlete implements IRun {

    public void run(int distance){
        this.runAtMarathonPace(distance);
        this.distanceTravelled += distance;
    }

    private void runAtMarathonPace(int distance){
        //Do stuff
    }
}
