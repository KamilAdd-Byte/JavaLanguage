package model;

public class Foodstuffs {
    private int id;
    private double weightPackage;

    public Foodstuffs(int id, double weightPackage) {
        this.id = id;
        this.weightPackage = weightPackage;
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public double getWeightPackage() {
        return weightPackage;
    }

    public void setWeightPackage(double weightPackage) {
        this.weightPackage = weightPackage;
    }

    @Override
    public String toString() {
        return "Foodstuffs{" +
                "id=" + id +
                ", weightPackage=" + weightPackage +
                '}';
    }
}
