package day45_oop;

public class TrafficLightObject {
    public static void main(String[] args) {
        //creat traffic light object
        TrafficLight trafficLight =new TrafficLight();
        //trafficLight.color = "red";not this way
        //we will assign a value of color using a method  of the class
        trafficLight.changeColor("red");
        //System.out.println(trafficLight.color);direct access to variable not recomend
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight12 =new TrafficLight();
        //trafficLight12.color ="black";
        trafficLight12.changeColor("blue");
        trafficLight12.showColor();

    }
}
