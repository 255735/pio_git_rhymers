package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    //TODO: mozemy to kiedys zrefaktoryzowac zeby nie trzymac tego w pamieci
    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
