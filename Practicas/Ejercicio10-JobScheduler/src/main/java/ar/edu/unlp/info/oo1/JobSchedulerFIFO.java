package ar.edu.unlp.info.oo1;

public class JobSchedulerFIFO extends JobScheduler {
    private JobDescription nextJob;


    public JobDescription next(){
        nextJob = jobs.get(0);
        this.unschedule(nextJob);
        return nextJob;
    }
}
