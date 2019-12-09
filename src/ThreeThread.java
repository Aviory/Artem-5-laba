public class ThreeThread extends Thread {
    int[] nums;
    public ThreeThread(String name, int[] nums) {
        setName(name);

    }


    @Override
    public synchronized void start() {
        super.start();
        System.out.println(getName()+ " Start" );
    }


    @Override
    public void interrupt() {
        super.interrupt();
        System.out.println(getName()+ " Interrupt");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+ " ");
        }
    }


    @Override
    public void run() {
        synchronized (nums){
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i]+3;
            }
        }
    }
}
