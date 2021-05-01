
public class Main {

	public static void main(String[] args) {

		IndividualCustomer customer1 = new IndividualCustomer(1, "berk", "çolak");
		CorporateCustomer customer2 = new CorporateCustomer(2, "AbcÞirket");

		Car car1 = new Car(1, "Bmw", "2012");
		Car car2 = new Car(2, "Mercedes", "2012");

		Customer[] customers = { customer1, customer2 };
		Car[] cars = { car1, car2 };

		for (Car car : cars) {
			System.out.println(car.getBrand());
		}

		for (Customer customer : customers) {
			System.out.println(customer.getId() + " Numaralý Müþteri");
		}

		RentManager rentManager = new RentManager(new DatabaseLogger());
		rentManager.rentCar(car1, customer2);

		rentManager.dropCar(car1, customer2);
	}

}
