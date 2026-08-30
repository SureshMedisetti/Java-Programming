enum Traffic{
    Red,
    Yellow,
    Green;

    public void action(){
        switch(this){
            case Red:
                System.out.println("Stop");
                break;
            case Yellow:
                System.out.println("Ready");
                break;
            case Green:
                System.out.println("You Can Go");
                break;
        }
    }
}

public class Enum {
    public static void main(String[] args) {
        Traffic light = Traffic.Red;
        light.action();
    }
}
