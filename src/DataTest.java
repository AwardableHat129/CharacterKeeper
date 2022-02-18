import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.*;

public class DataTest {
    
    public static void main(String[] args) {
        
        try {
            
            FileInputStream fileInput = new FileInputStream("data.dat");
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);

            DataStore dt = (DataStore) objectInput.readObject();

            System.out.println(dt.nameList.get(0));
            System.out.println(dt.nameList.get(1));

            objectInput.close();

            

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("An error has ocurred.");
        }
        
    }


}
