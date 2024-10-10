package exerciseEight;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor){
        color = newColor;
    }

    public boolean isRed(){
        // Return true if the color is red, otherwise return false
        return color.equals("red");
    }

    public boolean isGreen(){
        return color.equals("green");
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
