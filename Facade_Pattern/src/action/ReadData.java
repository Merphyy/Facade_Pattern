package action;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import documentAPI.Document;

public class ReadData extends Document {
	
	public String path;
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public void description() {
		System.out.println("\nThis is the file reading process");
	}

	@Override
	public void save(List<String> programData) {
		System.out.println("Function not implemented here... Refer to WriteData.java");
	}
	
	public List<String> load() {
		List<String> lines = Collections.emptyList();
	    try
	    {
	      lines = Files.readAllLines(Paths.get(Document.path), StandardCharsets.UTF_8);
	    }
	  
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	    description();
	    return lines;
		
	}
}
