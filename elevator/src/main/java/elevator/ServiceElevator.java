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
    private final Foodstuffs[] foodstuffs = new Foodstuffs[MAX_PACKAGE];
    private final double maxWeight = 356.999;
    private int nElem = 0;

    public void add(Foodstuffs stuffs) {
        if (nElem < MAX_PACKAGE) {
            foodstuffs[nElem] = stuffs;
            nElem++;
        } else {
            System.out.println("Za dużo paczek!!! Poczekaj na kolejną windę");
        }
    }

    @Override
    public void start() {
        if (weightIsCorrect()) {
            System.out.println("Winda start! Obciążenie wynosi " + weightTotalValue());
        } else {
            double overload = weightTotalValue() - maxWeight;
            System.out.println("Obciążenie za duże o: " + overload);
        }
    }

    private boolean weightIsCorrect() {
        return weightTotalValue() <= maxWeight;
    }

    private double weightTotalValue() {
        double total = 0;//weight
        for (Foodstuffs foodstuff : foodstuffs) {
            if (foodstuff != null) {
                foodstuff.getWeightPackage();
            }
        }
        return total;
    }

}
