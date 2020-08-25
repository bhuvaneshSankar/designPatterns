class Singleton{
    static Singleton singletonObject = new Singleton();
    private Singleton(){

    }
    static Singleton getSingletonObject(){
        return singletonObject;
    }
    void print(){
        System.out.println("Hello World...!");
    }
}
public class SingletonPattern{
    public static void main(String[] args){
        Singleton obj = Singleton.getSingletonObject();
        obj.print();
    }
}