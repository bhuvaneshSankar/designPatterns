//Generalized super class for making beverages(Tea and Coffee)
public abstract class MakeBeverage {
    public final void makeBeverage() {
        boilWater();
        boilMilk();
        addBeverageInWater();
        mixMilkWithBeverage();
        addSugarToBeverage();
        serveBeverage();
    }

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public void boilMilk() {
        System.out.println("Boiling milk...");
    }

    public abstract void addBeverageInWater();

    public abstract void mixMilkWithBeverage();

    public void addSugarToBeverage() {
        System.out.println("Adding sugar to the beverage...");
    }

    public abstract void serveBeverage();
}