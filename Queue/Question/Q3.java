import java.util.*;

class Job {
    char id;
    int deadline;
    int profit;

    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Q3 {
    public static void jobScheduling(Job[] jobs) {
        // Step 1: Sort jobs by profit in descending order
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find maximum deadline to create time slots
        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline)
                maxDeadline = job.deadline;
        }

        // Step 2: Create array to mark free time slots
        // -1 means slot free, otherwise store index of job assigned
        int[] slots = new int[maxDeadline];
        Arrays.fill(slots, -1);

        // List to keep track of scheduled job IDs
        List<Character> scheduledJobs = new ArrayList<>();

        // Step 3: Schedule jobs greedily
        for (int i = 0; i < jobs.length; i++) {
            // Find a free slot for this job, starting from last possible slot
            for (int j = Math.min(maxDeadline, jobs[i].deadline) - 1; j >= 0; j--) {
                if (slots[j] == -1) {
                    slots[j] = i; // Assign job to this slot
                    scheduledJobs.add(jobs[i].id);
                    break;
                }
            }
        }

        // Step 4: Print scheduled jobs
        System.out.print("Scheduled jobs: ");
        for (char jobId : scheduledJobs) {
            System.out.print(jobId + " ");
        }
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job('a', 4, 20),
            new Job('b', 1, 10),
            new Job('c', 2, 40),
            new Job('d', 1, 30)
        };

        jobScheduling(jobs);
    }
}
