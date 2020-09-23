package pl.training.state;

public class Yellow implements TrafficLightsState {

    @Override
    public void change(TrafficLights trafficLights) {
        trafficLights.setState(new Red());
    }

}
