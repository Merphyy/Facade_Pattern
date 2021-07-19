package driver;

import facade.Facade;

public class Client {

	public static void demo() {
		Facade f = new Facade();
		f.write("Nizami");
		f.read();
	}
}
