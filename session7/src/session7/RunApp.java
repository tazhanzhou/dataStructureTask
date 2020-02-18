package session7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RunApp {

	public static void main(String[] args) {

		Car car1 = new Car("Honda", "Civic", 2019);
		Car car2 = new Car("Subaru", "Outback", 2019);
		Car car3 = new Car("Mazda", "Mazda6", 2019);

		Stack<Car> carStack = new Stack<Car>();

		carStack.add(car1);
		carStack.add(car2);
		carStack.add(car3);

		Queue<Car> carQueue = new LinkedList<Car>();
		carQueue.addAll(carStack);

		Service carService = new Service();

		carService.ticketService(carQueue);
	}

}
