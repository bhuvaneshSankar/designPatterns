public class SubtractionHandler implements Handler {

    Handler nextHandler;

    @Override
    public void calculate(Calculate request) {
        if (request.getOperator().equals("sub")) {
            System.out.println("result = " + (request.getOperandOne() - request.getOperandTwo()));
        } else {
            nextHandler.calculate(request);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

}