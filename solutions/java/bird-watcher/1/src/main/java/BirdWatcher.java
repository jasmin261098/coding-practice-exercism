
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    }

    public int getToday() {
        int birdCountToday = birdsPerDay[birdsPerDay.length - 1];
        return birdCountToday;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdVisit: birdsPerDay) {
            if (birdVisit == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCountForNumberOfDays = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (i <= numberOfDays - 1) {
                birdCountForNumberOfDays += birdsPerDay[i];
            }
        }
        return birdCountForNumberOfDays;
    }

    public int getBusyDays() {
        int busyDaysCount = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                busyDaysCount++;
            }
        }
        return busyDaysCount;
    }
}
