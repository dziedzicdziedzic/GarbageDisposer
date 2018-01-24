package com.mygdx.game;

public class NBackTracker {
    private int occurence;
    private int playerHits;
    public NBackTracker() {
        occurence=0;
    }

    public void incrementPlayerHits(){
        playerHits++;
    }

    public void incrementOccurence(){
         occurence++;
    }

    public int getPlayerHits() {
        return playerHits;
    }

    public int getOccurence() {
        return occurence;
    }

    public void reset(){
        occurence= 0;
        playerHits=0;
    }
}
