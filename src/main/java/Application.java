/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 11/6/14
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class Application {
    public static void main(String argv[]){
        FirstClass  o1 = new FirstClass("prefix");
        SecondClass o2 = new SecondClass();
        System.out.println(o2.applyformatName("suffix",o1::formatName));
    }
}
