import javafx.scene.chart.PieChart;

import java.util.Date;

public class stopWatch {
    private long startTime, endTime;

    public long getStartTime(){
        return this.startTime;
    }
    public void setStartTime(int starttime){
        this.startTime= starttime;
    }

    public long getEndTime(){
        return this.endTime;
    }
    public void setEndTime(int endtime){
        this.endTime= endtime;
    }

    stopWatch(){
    }

    public void start(){
        this.startTime = new Date().getTime();
    }
    public void stop(){
        this.endTime= new Date().getTime();
    }

    public double getElapsedTime(){
        return this.endTime- this.startTime;
    }

    public void CountPrimeFrom2To2000(){
        int count=0;
        for (int i=2; i<2000;i++){
            if (i%2==0 && i > 2 || i % 3 == 0 && i > 3 || i % 5 == 0 && i > 5 || i % 7 == 0 && i > 7){
            }else {
                count++;
            }
        }
    }

    public static void main(String[] args) {
        stopWatch SW= new stopWatch();
        SW.start();
        System.out.println(SW.getStartTime());
        SW.CountPrimeFrom2To2000();
        SW.stop();
        System.out.println(SW.getEndTime());
        System.out.println(SW.getElapsedTime());
    }


}
