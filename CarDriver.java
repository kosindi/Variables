
public class CarDriver {
	public static void main (String[] args) {
		CarClass car1 = new CarClass();
		System.out.println(car1.toString());
		
		CarClass car2 = new CarClass("silver", "large", "300");
		System.out.println(car2);
		
		System.out.println(car1.getColor());
		System.out.println(car1.getEnginesize());
		System.out.println(car1.getHorsepower());
		
	}

}