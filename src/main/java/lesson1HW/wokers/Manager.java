package lesson1HW.wokers;

import javax.sound.midi.Soundbank;

public class Manager extends Workers{
    public Manager(String position) {
        super( position);
    }

    @Override
    public void workerStartedWork() {
        System.out.println(getPosition() + " started advising clients in the office");
    }
}
