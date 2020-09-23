package pl.training.state;

public class Green implements TrafficLightsState {

    @Override
    public void change(TrafficLights trafficLights) {
        trafficLights.setState(new Yellow());
    }

}
