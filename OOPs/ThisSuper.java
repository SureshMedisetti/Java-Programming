package OOPS;

class Vehicles{
    String brand;
    Vehicles(String brand){
        this.brand = brand;
    }
    void show(){
        System.out.println("Brand = " + this.brand);
    }
}

class Cars extends Vehicles{
    String brand;
    Cars(String carBrand,String vehicleBrand){
        super(vehicleBrand);
        this.brand = carBrand;
    }
    @Override
    void show(){
        super.show();
        System.out.println("Car Brand = " + this.brand);
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        Cars car = new Cars("Bmw","Toyato");
        car.show();
    }
}
