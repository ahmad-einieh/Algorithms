import java.util.Arrays;

public class WightedIntervalSechedualing {
    static class Job {
        int start, profit, p;
        public static int finish;


        Job(int start, int finish, int profit, int p) {
            this.start = start;
            this.finish = finish;
            this.profit = profit;
            this.p = p;
        }

        public int getFinish() {
            return finish;
        }

        public int getP() {
            return p;
        }

        public int getProfit() {
            return profit;
        }
        /*public static int com(Job j1, Job j2){
            //return j1.finish < j2.finish;
        }*/
    }

    public static int WIS(Job[] nums, int n) {
        //Arrays.sort(nums,Job.finish);
        int[] m = new int[n];
        m[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            m[i] = Integer.max(m[i - 1], m[nums[i - 1].getP()] + nums[i - 1].getProfit());
        }
        for (var i : m) System.out.print(i + " ");
        System.out.println();
        return Arrays.stream(m).max().getAsInt();
    }

    public static void main(String[] args) {
        int m = 4;
        Job[] arr = new Job[m + 1];
        /*arr[0] = new Job(1, 2, 50, 0);
        arr[1] = new Job(3, 10, 20, 1);
        arr[2] = new Job(6, 19, 100, 1);
        arr[3] = new Job(2, 100, 200, 0);*/
        //arr[0] =
        arr[0] = new Job(0, 6, 2, 0);
        arr[1] = new Job(2, 10, 4, 0);
        arr[2] = new Job(9, 15, 6, 1);
        arr[3] = new Job(7, 18, 7, 1);

        int n = arr.length;

        System.out.println(WIS(arr, n));


    }
}

