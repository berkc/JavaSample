
public class RentManager {
	
	public void rentCar(Car car,Customer customer) {
		System.out.println(customer.getId()+ " " + car.getBrand() + " Aracý kiraladý");
	}
	
	public void dropCar(Car car,Customer customer) {
		System.out.println(customer.getId()+ " " + car.getBrand() + " Teslim etti");
	}
}
