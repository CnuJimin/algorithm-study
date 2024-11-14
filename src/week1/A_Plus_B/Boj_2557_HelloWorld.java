package week1.A_Plus_B;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Boj_2557_HelloWorld {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = "Hello World!";
        bw.write(word);
        bw.close();
    }
}
