import java.util.*;

class Job {
    int deadline;
    int profit;
    char id;

    public Job(int deadline, int profit, char id) {
        this.deadline = deadline;
        this.id = id;
        this.profit = profit;
    }
}

public class JobSequence {
    public static void main(String[] args) {
        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        char ch = 'A';
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(jobInfo[i][0], jobInfo[i][1], ch++));
        }

        Collections.sort(jobs, (b, a) -> a.profit - b.profit);

        // Find max deadline to size slots array
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        boolean[] slots = new boolean[maxDeadline + 1]; // 1-based indexing
        ArrayList<Job> result = new ArrayList<>();
        int totalProfit = 0;

        for (Job job : jobs) {
            // find a slot from job.deadline to 1
            for (int t = job.deadline; t >= 1; t--) {
                if (!slots[t]) {
                    slots[t] = true;
                    result.add(job);
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Jobs done: " + result.size());
        System.out.println("Total Profit: " + totalProfit);
        System.out.print("Jobs: ");
        for (Job job : result) {
            System.out.print(job.id + " ");
        }
        System.out.println();
    }
}
