package facade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import action.ReadData;
import action.WriteData;
import documentAPI.Document;

public class Facade {

	List<String> wrt = new ArrayList<String>();
	List<String> rd = new ArrayList<String>();
	
	private Document write;
	private Document read;
	public Facade() {
		write = new WriteData(Document.path);
		read = new ReadData();
		//write = new WriteData("Facade_Pattern/src/write.csv");
	}
		
	public void write(String data) {	
	wrt.add(data);
	write.save(wrt);
	}
	
	public void read() {
		rd = read.load();
		Iterator<String> itr = rd.iterator();
	    while (itr.hasNext())
	      System.out.println(itr.next());
		System.out.println();
	}
		
}
