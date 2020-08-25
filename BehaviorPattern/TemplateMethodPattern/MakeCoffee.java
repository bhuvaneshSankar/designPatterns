public class MakeCoffee extends MakeBeverage {
    // implementing the abstracted functions that differ with the other class(Tea)
    public void addBeverageInWater() {
        System.out.println("Adding coffee powder in water...");
    }

    public void mixMilkWithBeverage() {
        System.out.println("Mixing milk with coffee...");
    }

    public void serveBeverage() {
        System.out.println("Serving Coffee...");
    }

}