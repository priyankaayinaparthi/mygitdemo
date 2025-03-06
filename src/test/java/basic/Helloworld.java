package basic;

public class Helloworld {


    public void tc1() {

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 10; i++) {

            System.out.println("i = " + i);
        }
    }

    public static void main(String[] args) {
        Helloworld hw = new Helloworld();
        hw.tc1();
    }
}
