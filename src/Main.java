import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,CarInfo> hashMap=new HashMap<>();
        hashMap.put(new Car(1234,555),new CarInfo(2001,"Toyota",15000000,"Red"));
        hashMap.put(new Car(5678,222),new CarInfo(2000,"Mercedes",1000000,"Blue"));
        hashMap.put(new Car(9012,333),new CarInfo(2002,"Honda",18000000,"Black"));
        hashMap.put(new Car(3456,777),new CarInfo(1998,"BMW",19000000,"White"));

        for (Map.Entry elements:hashMap.entrySet()) {
            System.out.println(elements.getKey()+" "+elements.getValue());
        }
    }
}