package main;

/**
 * User: Akarak
 * Date: 15.02.2016
 */
public class Main {
    /**
     * First java program
     *
     * @param args : program arguments
     */
    public static void main(String[] args) {
        // Задать входной параметр args. В меню выбрать Run -> Edit Configurations...-> Program arguments
        // Форматировть код Ctrl + Alt + L
        System.out.println("1:" + "Hello " + args[0] + " !");
        System.out.format("2:" + "Hello %s\n", args[0] + " !");
        Car car = new Car();
        car.setSpeed(200);
        Car car2 = new Car();
        System.out.println(car.getSpeed());
        car.go();
        car2.go();
    }
}
