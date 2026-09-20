import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Frequency {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a text : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " "); 
        Map<String,Integer> result = new HashMap<>();

        int counter = 1;
        while(str.hasMoreTokens()){
            String word = str.nextToken();
            result.put(word, result.getOrDefault(word,0)+1);
        }
        for(String s : result.keySet()){
            System.out.println(s+" : "+result.get(s));
        }
    }
}
