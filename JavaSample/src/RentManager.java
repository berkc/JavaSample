
public class RentManager {
	
	private BaseLogger baseLogger;
	
	RentManager(BaseLogger baseLogger){
		this.baseLogger=baseLogger;
	}
	
	public void rentCar(Car car,Customer customer) {
		System.out.println(customer.getId()+ " " + car.getBrand() + " Aracý kiraladý");
		this.baseLogger.log("kira loglandý");
	}
	
	public void dropCar(Car car,Customer customer) {
		System.out.println(customer.getId()+ " " + car.getBrand() + " Teslim etti");
		this.baseLogger.log("teslim loglandý");
	}
}
