package elevator;

import model.Foodstuffs;
import service.ElevatorSystem;

/**
 * @author kamillodzinski
 * @version 1.0
 * @see service.ElevatorSystem
 */
public class ServiceElevator implements ElevatorSystem {
    private static final int MAX_PACKAGE = 6;
    private Foodstuffs[]foodstuffs = new Foodstuffs[MAX_PACKAGE];
    private int nElem = 0;
    private final double maxWeight = 356.999;

    public void add(Foodstuffs stuffs){
        if (nElem < MAX_PACKAGE){
            foodstuffs[nElem] = stuffs;
            nElem++;
        }else {
            System.out.println("Za dużo paczek!!! Poczekaj na kolejną windę");
        }
    }
    @Override
    public void start() {
        if (weightIsOk()){
            System.out.println("Winda start");
        }else{
            double overload = weightValue() - maxWeight;
            System.out.println("Obciążenie za duże o: " + overload);
        }
    }

    private boolean weightIsOk() {
        return weightValue() <= maxWeight;
    }

    private double weightValue(){
        return foodstuffs[0].getWeightPackage() + foodstuffs[1].getWeightPackage() + foodstuffs[2].getWeightPackage() +
                foodstuffs[3].getWeightPackage() + foodstuffs[4].getWeightPackage() + foodstuffs[5].getWeightPackage();
    }
}
