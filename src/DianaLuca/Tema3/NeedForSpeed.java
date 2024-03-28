package DianaLuca.Tema3;

public class NeedForSpeed {

    private int speed = 5;
    private int batteryDrain = 2;
    private int distanceDriven = 0 ;
    private int remainingBattery = 100;

    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain =  batteryDrain;
    }

    public boolean batteryDrained() {
        if(this.remainingBattery < this.batteryDrain){
            return true;
        } else
            return false;

    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()){
            this.distanceDriven += this.speed;
            this.remainingBattery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50,4);
        return car;
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    private int distance = 800;
    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        if(car.distanceDriven() >= this.distance){
            return true;
        } else
            return false;
    }
}


