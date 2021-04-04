import java.util.List;

public interface ISaveable {
    List<String> storage();  //these are methods that need to be implemented.  Can also be fields too
    void read(List<String> savedValues);


}
