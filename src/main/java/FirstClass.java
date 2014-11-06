/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 11/6/14
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class FirstClass {
    String baseName;
    public FirstClass(String baseName){
        this.baseName = baseName;
    }
    public String formatName(String suffix){
        return baseName+":"+suffix;
    }
}
