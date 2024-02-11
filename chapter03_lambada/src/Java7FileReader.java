import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java7FileReader {
    public static void main(String[] args) {
        try{
            System.out.println(processFileLine1());
            System.out.println(processFileLine2());
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static String processFileLine1() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return br.readLine();
        }
    }

    public static String processFileLine2() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return br.readLine() +  br.readLine();
        }
    }
}
