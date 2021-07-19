package documentAPI;
import java.util.List;

public abstract class Document {
	
	public static final String path = "Facade_Pattern/src/write.txt";
	
	/**
	 * Description of the action
	 */
	public abstract void description();
	/**
	 * Write all the data
	 * @param programData : List containing all the data needed to be written
	 */
	public abstract void save(List<String> programData);	

	/**
	 * Read the file and copy all the data to a list 
	 * @return : List with all the data from the file
	 */
	public abstract List<String> load();
}
