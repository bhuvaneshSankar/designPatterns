//final handler
public class DivisionHandler implements Handler {

    Handler nextHandler;

    @Override
    public void calculate(Calculate request) {
        if (request.getOperator().equals("div")) {
            System.out.println("result = " + (request.getOperandOne() / request.getOperandTwo()));
        } else {
            System.out.println("Only add sub mul div are allowed ...");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

}