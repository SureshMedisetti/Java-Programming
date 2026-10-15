import java.util.Scanner;

enum TrafficLight{
    Red,
    Yellow,
    Green
}
public class TrafficEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try{
            TrafficLight light = TrafficLight.valueOf(str);
            switch(light){
                case Red:
                    System.out.println("Stop!");
                    break;
                case Yellow:
                    System.out.println("Ready To Go...");
                    break;
                case Green:
                    System.out.println("Go...");
                    break;
            }
        }catch(IllegalArgumentException e){
            System.out.println("Invalid Input");
        }finally{
            sc.close();
        }

        
    }
}
