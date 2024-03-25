package DianaLuca.Tema3;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        if(birdsPerDay.length == 0) return 0;
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        if(birdsPerDay.length > 0)
            birdsPerDay[birdsPerDay.length - 1]++ ;
    }

    public boolean hasDayWithoutBirds() {
        for( int i : birdsPerDay){
            if(i==0)
                return true;
        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int vis = 0;
        if(numberOfDays >= birdsPerDay.length)
            numberOfDays = birdsPerDay.length;
        if(birdsPerDay.length != 0)
            for(int i = 0; i < numberOfDays; i++){
                vis +=birdsPerDay[i];
            }
        return vis;
    }
    public int getBusyDays() {
        int vis  = 0;
        for(int i : birdsPerDay){
            if(i >= 5)
                vis++;
        }
        return vis;
    }
}
