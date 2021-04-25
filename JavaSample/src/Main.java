
public class Main {

	public static void main(String[] args) {
		
		Customer customer1=new Customer(1,"berk","colak");
		Customer customer2=new Customer(2,"berke","colak");
		
		Car car1=new Car(1,"Bmw","2012");
		Car car2=new Car(2,"Mercedes","2012");
		
		Customer[] customers= {customer1,customer2};
		Car[] cars= {car1,car2};
		
		for (Car car : cars) {
			System.out.println(car.brand);
		}
		
		for (Customer customer : customers) {
			System.out.println(customer.firstName);
		}
		
		RentManager rentManager=new RentManager();
		rentManager.rentCar(car1, customer2);
		
		rentManager.dropCar(car1, customer2);
	}

}
