package documentAPI;
import java.util.List;

public abstract class Document {
	public abstract void description();
	public abstract void save(List<String> programData);	
	public abstract List<String> load();
}
