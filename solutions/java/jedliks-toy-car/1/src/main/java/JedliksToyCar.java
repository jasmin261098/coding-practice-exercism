public class JedliksToyCar {

    private int distance = 0;
    private int battery = 100;
    
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        String distanceDisplay;

        if (distance >= 2000) {
            distanceDisplay = "Driven 2000 meters";
        } else {
            distanceDisplay = "Driven " + distance + " meters";
        }
        return distanceDisplay; 
    }

    public String batteryDisplay() {
        String batteryDisplay;
        
        if (battery <= 0) {
            batteryDisplay = "Battery empty";
        } else {
            batteryDisplay = "Battery at " + battery + "%";
        }
        return batteryDisplay;
    }

    public void drive() {
        distance += 20;
        battery -= 1;
    }
}
