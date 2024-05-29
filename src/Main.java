abstract class Transport{
    String name;
}
interface Logistic{
    Transport createTransport();
}

class Truck extends Transport{
    public Truck(){
        name = "Грузовик";
    }

}
class TruckFactory implements Logistic{
    public Transport createTransport(){
        return new Truck();
    }
}

class Air extends Transport{
    public Air(){
        name = "Самолёт";
    }

}
class AirFactory implements Logistic{
    public Transport createTransport(){
        return new Air();
    }
}

class Ship extends Transport{
    public Ship(){
        name = "Кораблик";
    }

}
class ShipFactory implements Logistic{
    public Transport createTransport(){
        return new Ship();
    }
}

public class Main {
    public static void main(String[] args) {

        TruckFactory truckFactory = new TruckFactory();
        AirFactory airFactory = new AirFactory();
        ShipFactory shipFactory = new ShipFactory();

        Transport truck = truckFactory.createTransport();
        Transport air = airFactory.createTransport();
        Transport ship = shipFactory.createTransport();

        System.out.println(truck.name);
        System.out.println(air.name);
        System.out.println(ship.name);
    }
}