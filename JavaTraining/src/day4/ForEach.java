package JavaTraining.src.day4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> strings= new ArrayList<>(Arrays.asList("a","b","c"));
        for(String value:strings){
            System.out.println(value);
        }
        String [] stringVal={"sunu","geror","jacob","manna","anna"};
        for (String val: stringVal)
            System.out.println(val);
    }
}
