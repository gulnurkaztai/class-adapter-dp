package adapter;

public class FahrenheitToCelsiusAdapter implements TemperatureSensor{
	protected FahrenheitSensor fahSensor;

	public FahrenheitToCelsiusAdapter(FahrenheitSensor fahSensor) {
		this.fahSensor = fahSensor;
	}
	
	public double getTemperature() {
		return (fahSensor.getTemperature() - 32) * 5/9;
	}

}
