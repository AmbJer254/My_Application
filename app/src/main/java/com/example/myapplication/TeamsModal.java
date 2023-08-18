package com.example.myapplication;

public class TeamsModal {

    private int Pos, Image,matchWon,matchDrawn,matchLost,goalsFor,goalsAgainst,goalsDiff,points;
    private String Name,matchPlayed,Last5;

    public TeamsModal(){}

    public int getPos() {
        return Pos;
    }

    public void setPos(int pos) {
        Pos = pos;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getMatchWon() {
        return matchWon;
    }

    public void setMatchWon(int matchWon) {
        this.matchWon = matchWon;
    }

    public int getMatchDrawn() {
        return matchDrawn;
    }

    public void setMatchDrawn(int matchDrawn) {
        this.matchDrawn = matchDrawn;
    }

    public int getMatchLost() {
        return matchLost;
    }

    public void setMatchLost(int matchLost) {
        this.matchLost = matchLost;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMatchPlayed() {
        return matchPlayed;
    }

    public void setMatchPlayed(String matchPlayed) {
        this.matchPlayed = matchPlayed;
    }

    public String getLast5() {
        return Last5;
    }

    public void setLast5(String last5) {
        Last5 = last5;
    }

    public int getPoints() {
        return (matchWon*3 +matchDrawn);
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGoalsDiff() {
        return (goalsFor-goalsAgainst);
    }

    public void setGoalsDiff(int goalsDiff) {
        this.goalsDiff = goalsDiff;
    }

    public TeamsModal(int Pos, int Image, String Name, String matchPlayed, int matchWon, int matchDrawn, int matchLost,
                      int goalsFor, int goalsAgainst, int goalsDiff, int points, String Last5){
        this.Pos=Pos; this.Image=Image; this.Name=Name; this.matchPlayed=matchPlayed; this.matchWon=matchWon; this.matchDrawn=matchDrawn;
        this.matchLost =matchLost; this.goalsFor=goalsFor; this.goalsAgainst=goalsAgainst; this.goalsDiff=goalsDiff;this.points=points;this.Last5=Last5;


    }
}
