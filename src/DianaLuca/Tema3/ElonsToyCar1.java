package DianaLuca.Tema3;

public class ElonsToyCar1 {

    public int distanceDriven;
    public int batteryPercentage = 100;

    public static ElonsToyCar1 buy() {
        return new ElonsToyCar1();
    }
    public String distanceDisplay() {
        String display = "Driven " + distanceDriven + " meters";
        return display;
    }
    public String batteryDisplay() {
        String display;
        if (batteryPercentage <= 0) {
            display = "Battery empty";
        } else {
            display = "Battery at " + batteryPercentage + "%";
        }
        return display;
    }
    public void drive() {
        if (batteryPercentage >= 1) {
            distanceDriven = distanceDriven + 20;
            batteryPercentage--;
        }
    }
}
