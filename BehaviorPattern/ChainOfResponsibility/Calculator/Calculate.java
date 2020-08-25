public class Calculate {
    int operandOne;
    int operandTwo;
    String operator;

    public Calculate(int operandOne, int operandTwo, String operator) {
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
        this.operator = operator;
    }

    public int getOperandOne() {
        return operandOne;
    }

    public int getOperandTwo() {
        return operandTwo;
    }

    public String getOperator() {
        return operator;
    }

}