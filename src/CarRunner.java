public class CarRunner {
    public static void main (String args[]){
        Car car1 = new Car("Honda", 2000);
        System.out.println(car1);

        UsedCarLot lot = new UsedCarLot();
        lot.addCar(new Car("Mustang", 12500));
        lot.addCar(new Car("Camry", 8400));
        lot.addCar(new Car("Ram", 17200));
        lot.addCar(new Car("Accent", 1980));
        lot.addCar(new Car("Cruiser", 10500));
        System.out.println(lot.getInventory());

    }
}
