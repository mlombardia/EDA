public class Timer {
    private long start;
    private long end;
    private long days;
    private long hours;
    private long minutes;
    private long seconds;

    public Timer(){
        this.start = System.currentTimeMillis();
        System.out.println(String.valueOf(start));
    }

    void stop(){
       if(this.end <= 0) {
           this.end = System.currentTimeMillis();
           System.out.println(String.valueOf(end));
       }
    }


    public String toString(){
        if(start > end){
            return "No se puede establecer un tiempo porque el timer aun no se ha detenido";
        }else {
            days = (end - start) / 86400000;
            hours = ((end - start) % 86400000) / 3600000;
            minutes = (((end - start) % 86400000) % 3600000) / 60000;
            seconds = ((((end - start) % 86400000) % 3600000) % 60000) / 1000;
            String result = "(" + String.valueOf(end - start) + " ms)";
            result = result + " " + String.valueOf(days) + " dias " + String.valueOf(hours) + " hs " + String.valueOf(minutes) + " mins " + String.valueOf(seconds) + " s";
            return result;
        }
    }

    public long getStart(){
        return this.start;
    }

    public long getEnd(){
        return this.end;
    }

    public long getDays(){
        return this.days;
    }

    public long getHours(){
        return this.hours;
    }

    public long getMinutes(){
        return this.minutes;
    }

    public long getSeconds(){
        return this.seconds;
    }
}
