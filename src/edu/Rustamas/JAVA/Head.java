package edu.Rustamas.JAVA;

public class Head {

    //  public void lookAround(){
    //  System.out.println("Look around");
    //  }

    private Eyes eyes;
    private Mouth mouth;

    public Head(Eyes eyes, Mouth mouth) {
        this.eyes = eyes;
        this.mouth = mouth;
    }

    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public Mouth getMouth() {
        return mouth;
    }

    public void setMouth(Mouth mouth) {
        this.mouth = mouth;
    }

    @Override
    public String toString() {
        return "Head{" +
                "eyes=" + eyes +
                ", mouth=" + mouth +
                '}';
    }
}