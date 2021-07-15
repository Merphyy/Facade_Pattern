import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteData extends Document {
	
	public String path;
	
	public WriteData(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("This is the writing progress");

	}
	
	
	public void save(List<String> programData) {
		StringBuilder content = new StringBuilder();
		File file = new File(path);
        FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream(file);
			for(int i = 0; i<programData.size();i++) {
	        	content.append(programData.get(i)).append('\n');
	        }
			fileOutputStream.write(content.toString().getBytes());
	        fileOutputStream.close();

		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
        

		
	}

	

	@Override
	public List<String> load() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*public static void demo() {
		WriteData obj = new WriteData("abc.txt");
		List<String> list = new ArrayList<>();
		list.add("123454");
		list.add("123454");
		list.add("123454");

		obj.save(list);
	}*/

	
}
