package pl.training.state;

public class App {

    public static void main(String[] args) {
        TrafficLights trafficLights = new TrafficLights(new Red());
        System.out.println(trafficLights.getState());
        trafficLights.change();
        System.out.println(trafficLights.getState());
        trafficLights.change();
        System.out.println(trafficLights.getState());
        trafficLights.change();
        System.out.println(trafficLights.getState());
        trafficLights.change();
        System.out.println(trafficLights.getState());
    }

}
