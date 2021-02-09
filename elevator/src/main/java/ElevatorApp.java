import elevator.ServiceElevator;
import model.Foodstuffs;

public class ElevatorApp {
    public static void main(String[] args) {
        Foodstuffs f1 = new Foodstuffs(1,45.78);
        Foodstuffs f2 = new Foodstuffs(2,49.88);
        Foodstuffs f3 = new Foodstuffs(3,98.56);
        Foodstuffs f4 = new Foodstuffs(4,19.18);
        Foodstuffs f5 = new Foodstuffs(5,100.11);
        Foodstuffs f6 = new Foodstuffs(6,72.98);
        Foodstuffs f7 = new Foodstuffs(7,34.28);

        ServiceElevator se = new ServiceElevator();
        se.add(f1);
        se.add(f3);
        se.add(f4);
        se.add(f6);
        se.add(f7);
        se.add(f5);

        se.start();
    }
}
