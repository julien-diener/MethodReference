/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 11/6/14
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class FirstClass {
    String prefix;
    public FirstClass(String prefix){
        this.prefix = prefix;
    }
    public String addPrefix(String suffix){
        return prefix +":"+suffix;
    }
}
