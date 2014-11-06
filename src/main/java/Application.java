/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 11/6/14
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class Application {
    public static void main(String argv[]){
        FirstClass first = new FirstClass("first");
        SecondClass second = new SecondClass();
        System.out.println(second.applyFunction("second",first::addPrefix));
    }
}
