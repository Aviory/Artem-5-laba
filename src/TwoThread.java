public class TwoThread extends Thread {
    int[] nums;

    public TwoThread(String name, int[] nums) {
        setName(name);
        this.nums = nums;
    }


    @Override
    public synchronized void start() {
        super.start();
        System.out.println(getName()+ " Start" );
    }


    @Override
    public void interrupt() {
        super.interrupt();
        System.out.println(getName()+ " Interrupt"  );
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+ " ");
        }
    }


    public void run(){

        synchronized (nums){
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i]*3;
            }
        }
    }
}
