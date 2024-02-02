package training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java7FileReader {
    public static void main(String[] args) {
        try{
            System.out.println(processFileLine1_old());
            System.out.println(processFileLine2_old());
            System.out.println(processFileLine( (BufferedReader br) -> br.readLine() +   br.readLine()));
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static String processFileLine1_old() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return br.readLine();
        }
    }

    public static String processFileLine2_old() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return br.readLine() +  br.readLine();
        }
    }

    public static String processFileLine(LineReader lr)throws IOException  {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return lr.read(br);
        }
    }
}
