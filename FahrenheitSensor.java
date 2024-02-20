package adapter;

public class FahrenheitSensor implements TemperatureSensor{

	@Override
	public double getTemperature() {
		return 100;
	}

}
