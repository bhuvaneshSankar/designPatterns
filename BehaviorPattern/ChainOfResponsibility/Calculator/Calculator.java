public class Calculator {
    public static void main(String[] args) {
        Handler firstHandler = new AdditionHandler();
        Handler secondHandler = new SubtractionHandler();
        Handler thirdHandler = new MultiplicationHandler();
        Handler fourthHandler = new DivisionHandler();

        firstHandler.setNextHandler(secondHandler);
        secondHandler.setNextHandler(thirdHandler);
        thirdHandler.setNextHandler(fourthHandler);
        fourthHandler.setNextHandler(null);

        Calculate c1 = new Calculate(23, 33, "add");
        firstHandler.calculate(c1);

        Calculate c2 = new Calculate(32, 23, "mul");
        firstHandler.calculate(c2);

        Calculate c3 = new Calculate(123, 21, "pow");
        firstHandler.calculate(c3);
    }
}