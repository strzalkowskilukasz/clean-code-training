package pl.training.state;

public class TrafficLights {

    private TrafficLightsState state;

    public TrafficLights(TrafficLightsState state) {
        this.state = state;
    }

    public void change() {
        state.change(this);
    }

    public void setState(TrafficLightsState state) {
        this.state = state;
    }

    public String getState() {
        return state.getClass().getSimpleName();
    }

}
