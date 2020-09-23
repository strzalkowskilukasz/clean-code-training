package pl.training.state;

public class RedAndYellow implements TrafficLightsState {

    @Override
    public void change(TrafficLights trafficLights) {
        trafficLights.setState(new Green());
    }

}
