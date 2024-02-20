package adapter;

public class Main {

public static void main (String[] args) {
	FahrenheitSensor fahSensor = new FahrenheitSensor();
	FahrenheitToCelsiusAdapter adapter = new FahrenheitToCelsiusAdapter(fahSensor);
	ClimateControl control = new ClimateControl(adapter);
	control.checkTemperature();
	
}

}
