package pl.training.state;

public class Red implements TrafficLightsState {

    @Override
    public void change(TrafficLights trafficLights) {
        trafficLights.setState(new RedAndYellow());
    }

}
