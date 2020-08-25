package designPatterns.structuralPatterns.AdapterPattern;

/*Adapter that facilitates user to access old coffee vending machine as it implements the interface which 
  the user can access.
  The user cannot directly access oldcoffeevendingmachine
*/
public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface {
    OldCoffeeMachine oldVendingMachine;

    public CoffeeTouchScreenAdapter(OldCoffeeMachine oldVendingMachine) {
        this.oldVendingMachine = oldVendingMachine;
    }

    public void chooseFirstSelection() {
        this.oldVendingMachine.selectA();
    }

    public void chooseSecondSelection() {
        this.oldVendingMachine.selectB();
    }
}