import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException
    {
        String filename = "E:\\ab.txt";
        BufferedReader r = new BufferedReader(new FileReader(filename));
        Set<String> colliID = new HashSet<>();
        String i;
        while((i=r.readLine())!=null)
        {
            i=i.trim();
            if (!i.contains("UNKNOWN"))
                colliID.add(i);

        }

        for (String colli:colliID)
            System.out.println(colli);
    }
}