package facade;

import java.util.ArrayList;
import java.util.List;

import action.WriteData;
import documentAPI.Document;

public class Facade {

	List<String> str = new ArrayList<String>();
	private Document write;
	
	public Facade() {
		write = new WriteData("Facade_Pattern/src/file/write.txt");
	}
		
	public void write(String data) {	
	str.add(data);
	write.save(str);
	}
		
}
