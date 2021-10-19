package entitiesCurrencyConverter;

public class CurrencyConverter {
	public static final Double IOT = 6.00;
	
	public Double amouts(Double price, Double bought) {
		return ((bought * price) * ((100 - IOT) / 100));
	}
}
