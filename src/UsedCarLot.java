import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public void addCar(Car car){
        inventory.add(car);
    }

    public boolean swap(int one, int two){
        if (one<inventory.size() && two<inventory.size()){
            Car temp = inventory.get(two);
            inventory.set(two, inventory.get(one));
            inventory.set(one, temp);
            return true;
        } else{
            return false;
        }

    }
}
