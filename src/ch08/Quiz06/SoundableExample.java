package ch08.Quiz06;

public class SoundableExample {
    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }

    /*
       Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);

        Car myCar = new Car();
        myCar.run();

        // 타이어 교체(다형성)
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();
     */

}
