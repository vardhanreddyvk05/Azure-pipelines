import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
public class Taskone {
    public static void main(String[] args) throws IOException {
        File xmlFile = new File("C:/Users/sesa566761/Documents/Programming/Java/package2.xml");
        Reader fileReader = new FileReader(xmlFile);
        BufferedReader bufReader = new BufferedReader(fileReader);  
        StringBuilder sb = new StringBuilder();
        String line = bufReader.readLine();
        while( line != null)
        {
            sb.append(line).append("\n");
            line = bufReader.readLine();
        }
        String str = sb.toString();
        bufReader.close();

        str = str.replaceAll("(?s)<name>.*?</name>", "");
        
        str = str.replaceAll("\\<.*?\\>", "");
        String new_str=str.replaceAll("-", "");
        new_str=new_str.replaceAll("(?m)^[ \t]*\r?\n", "");

        System.out.println("After removing the Xml tags : ");
        System.out.println(new_str);
        

        File tf= new File("C:/Internship/TextFile.txt");
        FileWriter fw = new FileWriter(tf);
        fw.write(new_str);
        fw.close();
    }
}