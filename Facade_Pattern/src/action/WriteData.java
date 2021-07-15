package action;
import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import documentAPI.Document;


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
		System.out.println("This is the writing progress");
	}

	public void save(List<String> programData) {
		description();
		StringBuilder content = new StringBuilder();
		File file = new File(path);
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream(file);
			for(int i = 0; i<programData.size();i++) {
				content.append(programData.get(i)).append('\n');
			}
			fileOutputStream.write(content.toString().getBytes());
			System.out.println("Value written : "+content.toString());
			fileOutputStream.close();

		}catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Override
	public List<String> load() {
		System.out.println("Function not implemented");
		return null;
	}
}