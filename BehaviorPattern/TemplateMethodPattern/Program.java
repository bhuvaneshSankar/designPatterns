public class Program {
    public static void main(String[] args) {
        MakeBeverage coffee = new MakeCoffee();
        coffee.makeBeverage();

        MakeBeverage tea = new MakeTea();
        tea.makeBeverage();
    }
}