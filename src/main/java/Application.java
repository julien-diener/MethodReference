
public class Application {
    public static void main(String argv[]){
        FirstClass first = new FirstClass("first");
        SecondClass second = new SecondClass();
        System.out.println(second.applyFunction("second",first::addPrefix));
    }
}
