import java.util.*;
import java.io.*;

public class Ninja_1
{
    public static void main(String arg[])throws FileNotFoundException,IOException
    {
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Origen\\Desktop\\guvi\\guvi_codeKata\\set9in.txt"));
        while(br.readLine()!=null)
        {
            String a[]=br.readLine().split(" ");
            System.out.println(Integer.parseInt(a[1])-Integer.parseInt(a[0]));
        }
        br.close();
    }
}