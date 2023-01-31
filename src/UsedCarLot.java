import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> get(){
        return inventory;
    }

    public void addCar(Car car){
        inventory.add(car);
    }

    /* public boolean swap(int one, int two){

        inventory.set(inventory.get(one));
    }*/
}
