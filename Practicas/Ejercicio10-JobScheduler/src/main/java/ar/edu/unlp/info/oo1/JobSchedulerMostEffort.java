package ar.edu.unlp.info.oo1;

public class JobSchedulerMostEffort extends JobScheduler{
    private JobDescription nextJob;

    public JobDescription next(){
        nextJob = jobs.stream()
            .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
            .orElse(null);
        this.unschedule(nextJob);
        return nextJob;
    }
}
