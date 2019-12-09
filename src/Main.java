public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread(); // получаем главный поток
        System.out.println(t.getName()); // main

        int[] nums  = new int[100];

        OneThread one = new OneThread("one",nums);


        TwoThread two = new TwoThread("two",nums);
       // two.start();

        ThreeThread three = new ThreeThread("three",nums);
        three.start();
        two.start();


    }
}
