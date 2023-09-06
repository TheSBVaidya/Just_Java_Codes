abstract class AeroPlan {
    abstract public void takeoff();

    abstract public void fly();

    public void landing() {
        System.out.println("Plan is Landing");
    }
}

class CargoPlane extends AeroPlan {
    public void takeoff() {
        System.out.println("CargoPlane requires longer runway");
    }

    public void fly() {
        System.out.println("CargoPlane flies at lower hight");
    }
}

class PassengerPlan extends AeroPlan {
    public void takeoff() {
        System.out.println("PassengerPlan requires medium runway");
    }

    public void fly() {
        System.out.println("PassengerPlan files at high height");
    }

    public void alert() {
        System.out.println("Alsett........!!!");
    }
}

class FighterPlan extends AeroPlan {
    public void takeoff() {
        System.out.println("FighterPlan requires small runway");
    }

    public void fly() {
        System.out.println("FighterPlan flies at high hight");
    }
}

class Airport {
    public void poly(AeroPlan ref) {
        ref.takeoff();
        ref.fly();
        ref.landing();
        System.out.println("===================================================");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        
        CargoPlane cp = new CargoPlane();
        PassengerPlan pp = new PassengerPlan();
        FighterPlan fp = new FighterPlan();
        Airport ap = new Airport();

        // AeroPlan aap = new AeroPlan(); // we Cannot make object of a abstract class

        ap.poly(cp);
        ap.poly(pp);
        ap.poly(fp);

        // cp.takeoff();
        // cp.fly();

        // pp.takeoff();
        // pp.fly();

        // fp.takeoff();
        // fp.fly();
    }
}