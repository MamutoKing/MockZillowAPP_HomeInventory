import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager{
    public static String printToFile(ArrayList<Home> homes){
        try{
            FileWriter writer = new FileWriter("C:\\Temp\\Home.txt");

            for (Home home : homes){
                writer.write(home.getHomeInformation() + "\n\n");
            }
            writer.close();
            return "Success: File written";
        }
        catch (IOException e){
            return "Failure: Error writing file";
        }
    }
}