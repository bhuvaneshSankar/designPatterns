//generic interface for all the handler objects/classes
public interface Handler {
    public void setNextHandler(Handler nextHandler);

    public void calculate(Calculate request);
}