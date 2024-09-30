package ar.edu.unlp.info.oo1;

public class JobSchedulerLIFO extends JobScheduler{
    private JobDescription nextJob;

    public JobDescription next(){
        nextJob = jobs.get(jobs.size()-1);
        this.unschedule(nextJob);
        return nextJob;
    }
}
