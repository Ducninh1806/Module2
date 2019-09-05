import javafx.scene.paint.Stop;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private long startTimes, endTimes;

    public long getStartTimes(){
        return this.startTimes;
    }
    public void setStartTimes(long startTimes){
        this.startTimes=startTimes;
    }

    public long getEndTimes(){
        return this.endTimes;
    }
    public void setEndTimes(long endTimes){
        this.endTimes=endTimes;
    }

    StopWatch(){
    }

    public void start(){
        this.startTimes=new Date().getTime();
    }
    public void stop(){
        this.endTimes= new Date().getTime();
    }

    public double getElapseTime(){
        return this.endTimes - this.startTimes;
    }

}


