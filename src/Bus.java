
public class Bus {
      private String model;
    private int maxSpeed;
    private double weight;
    private String licence;

    private double mileage;
    private int currentFuel;
    private int maxFuel;
    private int consumption;  //per 1km 

    private int seats;
    private int numberOfPassengers;
    
    public Bus(String model, int maxSpeed, double weight, String license, double mileage, int currentFuel, int maxFuel, int consumption, int seats, int numberOfPassengers) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.licence = license;
        this.mileage = mileage;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
        this.consumption = consumption;
        
        //minimum number of seats in a bus is 8
         if(seats < 8) {
            this.seats = 8;
        } else {
             this.seats = seats;
        }
        
         //minimum number of passengers is 1 (driver)
        if(numberOfPassengers < 1) {
            this.numberOfPassengers = 1;
            // Number of passengers cannot be higher than number of seats
        } else if(numberOfPassengers > this.seats){
            this.numberOfPassengers = this.seats;
        } else{
             this.numberOfPassengers = numberOfPassengers;
        }
       
    }
    public void printAttributes() {

        System.out.println("Model: " + this.model);
        System.out.println("Maksimalna brzina " + this.maxSpeed);
        System.out.println("Težina: " + this.weight);
        System.out.println("Registracija : " + this.licence);
        System.out.println("Pređena kilometraža: " + this.mileage);
        System.out.println("Stanje rezervoara : " + this.currentFuel);
        System.out.println("Max stanje rezervoara : " + this.maxFuel);
        System.out.println("Potrošnja: " + this.consumption);
        System.out.println("Broj sedista: " + this.seats);
        System.out.println("Trenutni broj putnika: " + this.numberOfPassengers);
        System.out.println("----------------------------------------------------");
    }

    public void setWeight(double customWeight) {
        this.weight = customWeight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setConsumption(int customConsumption) {
        this.consumption = customConsumption;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    
    

    public void travel(int distance) {
        if (distance < this.maxFuel / this.consumption) {

            if (this.currentFuel < distance * this.consumption) {
                this.fuelUp();
            }

            this.mileage = this.mileage + distance;
            this.currentFuel = this.currentFuel - this.consumption * distance;

        } else {
            System.out.println("Ne možeš da pređeš toliki put ni sa punim rezervoarom!");
        }
    }

    public void fuelUp() {

        System.out.println("U autobus " + this.model + " je sipano " + (this.maxFuel - this.currentFuel) + " litara goriva");
        this.currentFuel = this.maxFuel;
    }
    
    public void getIn(int newPassengers) {
        if(this.seats - this.numberOfPassengers >= newPassengers) {
             this.numberOfPassengers += newPassengers;
             System.out.println("U autobus " + this.model + " je primljeno " + newPassengers + " novih putnika.");
        } else {
            System.out.println("U autobusu " + this.model + " ima samo " + (this.seats - this.numberOfPassengers) + " slobodnih mesta.");
            System.out.println("Ne mozete primiti " + newPassengers + " putnika.");
        }
       
    } 
    
    public void getOut(int outPassengers) {
        if(outPassengers > 0 && this.numberOfPassengers > outPassengers) {
             this.numberOfPassengers -= outPassengers;
             System.out.println("Iz autobusa " + this.model + " je izaslo " + outPassengers + " putnika.");
        } else if(this.numberOfPassengers == outPassengers) {
             System.out.println("Ne mozete izbaciti vozaca.");
        } else {
            System.out.println("U autobusu " + this.model + " ima " + this.numberOfPassengers + " putnika.");
            System.out.println("Ne mozete izbaciti " + outPassengers + " putnika.");
        }
       
    } 
   
}
