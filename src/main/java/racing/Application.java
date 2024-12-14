package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Application {

    public static void main(String[] args) {

    }

   static List<Car> carToList(Car car1,Car car2,Car car3){
            List<Car> carList =new ArrayList<>(List.of(car1
                    ,car2,car3));
            return carList;
    }
}






