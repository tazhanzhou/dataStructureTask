package session7;

import java.util.Queue;

public class Service {
	public void ticketService(Queue<Car> carStack) {
		carStack.forEach(e -> System.out.println(e));
	}

}
