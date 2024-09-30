package ar.edu.unlp.info.oo1;

public class JobSchedulerHighestPriority extends JobScheduler{
    private JobDescription nextJob;

    public JobDescription next(){
        nextJob = jobs.stream()
            .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
            .orElse(null);
        this.unschedule(nextJob);
        return nextJob;
    }
}
