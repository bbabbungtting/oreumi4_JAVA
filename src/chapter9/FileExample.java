package chapter9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String filePath = "" + "../test.txt";
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(filePath));
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("경로 잘못됨");
        } finally {
            if (br!= null) {

            }
        }
    }
}
