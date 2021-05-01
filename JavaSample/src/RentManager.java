
public class RentManager {

	private BaseLogger baseLogger;

	RentManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}

	public void rentCar(Car car, Customer customer) {
		System.out.println(customer.getId() + " " + car.getBrand() + " Arac� kiralad�");
		this.baseLogger.log("kira logland�");
	}

	public void dropCar(Car car, Customer customer) {
		System.out.println(customer.getId() + " " + car.getBrand() + " Teslim etti");
		this.baseLogger.log("teslim logland�");
	}
}
