import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ioException {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
        //     int num = Integer.parseInt(bf.readLine());
        // }
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try{
            int num = Integer.parseInt(bf.readLine());
        }finally{
            bf.close();
        }
    }
}
