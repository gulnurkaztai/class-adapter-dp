package adapter;

public class ClimateControl {
	protected TemperatureSensor sensor;

	public ClimateControl(TemperatureSensor sensor) {
		this.sensor = sensor;
	}
	
	public void checkTemperature() {
		System.out.print("Current temp is " + String.format("%.2f", sensor.getTemperature()) );
	}

}
