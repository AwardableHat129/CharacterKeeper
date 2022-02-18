import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataStore implements Serializable{
    
    ArrayList<String> nameList;    

    public DataStore()
    {
        nameList = new ArrayList<String>();
    }

}
