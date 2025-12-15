class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    private int metersDriven;
    private int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if (battery >= 0 && battery >= batteryDrain) {
            return false;
        } else {
            return true;
        }
    }

    public int distanceDriven() {
        return metersDriven;
    }

    public void drive() {
        if (battery > 0) {
            metersDriven += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50, 4);
        return nitro;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDrives = 100 / car.batteryDrain;
        int maxDistance = maxDrives * car.speed;
        return maxDistance >= distance;
    }
}
