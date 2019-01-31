
public class Main {

    
    public static void main(String[] args) {
 
//        Car defaultCar = new Car();
//        
//        // defaultCar.printAttributes();
//        
//        
//        
//        Car audi = new Car("Audi A3", "BG-1234");
//        audi.printAttributes();
//        audi.setWeight(1400);
//        audi.setConsumption(10);
       // audi.printAttributes();
       
        
        Car bmw = new Car("bmw", 200, 1300, "BG-446-UZ", 0, 0, 100, 15, 5, 10);
        bmw.fuelUp();
        bmw.printAttributes();
        bmw.travel(4);
        bmw.printAttributes();
        
        bmw.travel(6);
        bmw.getOut(1);
        bmw.printAttributes();
        
     Bus volvo = new Bus("volvo", 200, 1300, "BG-446-UZ", 0, 0, 100, 15, 10, 20);
        volvo.printAttributes();
    
    }
    
}
