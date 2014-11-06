
import java.util.function.Function;

public class SecondClass {
    public String applyformatName(String name, Function<String,String> function){
        return (String) function.apply(name);
    }
}
