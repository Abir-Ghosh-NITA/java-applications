package utilities;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class csv {
public static List<String[]> read(String file){
	List<String[]>data=new LinkedList<>();
	String datarow;

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        while ((datarow = br.readLine()) != null) {
            String[] datarecords = datarow.split(",");
            data.add(datarecords);
        }
    } catch (FileNotFoundException e) {
        System.out.println("File Not Found");
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println("Could not read File");
        e.printStackTrace();
    }
    return data;
}
}