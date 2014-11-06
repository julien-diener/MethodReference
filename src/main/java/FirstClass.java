
public class FirstClass {
    String prefix;
    public FirstClass(String prefix){
        this.prefix = prefix;
    }
    public String addPrefix(String suffix){
        return prefix +":"+suffix;
    }
}
