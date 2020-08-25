/*
 *  State is the gear here
*/
public class VehicleGearDemo {
    public static void main(String[] args) {
        Car car = new Car();
        for (int i = 0; i < 10; i++) {
            car.changeGear();
        }
    }
}

class Car {
    Gear g = new NeutralGear();

    void changeGear() {
        g = g.changeGear(g);
    }
}

abstract class Gear {
    abstract Gear changeGear(Gear gear);
}

class NeutralGear extends Gear {
    Gear changeGear(Gear g) {
        System.out.println("Changing to First Gear...");
        g = new FirstGear();
        return g;
    }
}

class FirstGear extends Gear {
    Gear changeGear(Gear g) {
        System.out.println("Changing to Second gear...");
        g = new SecondGear();
        return g;
    }
}

class SecondGear extends Gear {
    Gear changeGear(Gear g) {
        System.out.println("Changing to Third gear...");
        g = new ThirdGear();
        return g;
    }
}

class ThirdGear extends Gear {
    Gear changeGear(Gear g) {
        System.out.println("Changing to Fourth gear...");
        g = new FourthGear();
        return g;
    }
}

class FourthGear extends Gear {
    Gear changeGear(Gear g) {
        System.out.println("Changing to Neutral gear...");
        g = new NeutralGear();
        return g;
    }
}