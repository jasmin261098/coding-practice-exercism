public class Lasagna {
    
    public int expectedMinutesInOven() {
        int expectedMinutesInOven = 40;
        return expectedMinutesInOven;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        int remainingMinutesInOven = expectedMinutesInOven() - minutesInOven;
        return remainingMinutesInOven;
     }

    public int preparationTimeInMinutes(int numberOfLayers) {
        int preparationTimeInMinutes = numberOfLayers * 2;
        return preparationTimeInMinutes;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        int preparationTimeInMinutes = numberOfLayers * 2;
        int totalTimeInMinutes = preparationTimeInMinutes + minutesInOven;
        return totalTimeInMinutes;
    }
}
