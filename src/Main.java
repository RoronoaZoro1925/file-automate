import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader r = new FileReader("E:\\ab.txt");
        int i;
        while((i=r.read())!=-1)
        {
            System.out.print((char) i);
        }
    }
}