package lesson1HW.wokers;

public abstract class Workers {
   String position;

    public Workers( String position) {

        this.position = position;
    }
    public final void workersComeToWork(){
        System.out.println(position + " come to work");
    }
    public abstract void workerStartedWork();



    public String getPosition() {
        return position;
    }
}
