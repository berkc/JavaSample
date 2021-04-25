
public class RentManager {
	
	public void rentCar(Car car,Customer customer) {
		System.out.println(customer.firstName+ " " + car.brand + " Aracý kiraladý");
	}
	
	public void dropCar(Car car,Customer customer) {
		System.out.println(customer.firstName+ " " + car.brand + " Teslim etti");
	}
}
