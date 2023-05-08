package CodeforceDiv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) throws IOException {

        String code = "codeforces";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        while (loop-- > 0){
            int count=0;
            String cad = br.readLine();
            for (int i = 0; i < cad.length(); i++) {
                if (cad.charAt(i)==code.charAt(i)){

                }
                else{
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
