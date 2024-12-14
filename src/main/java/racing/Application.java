package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Application {

    public static void main(String[] args) {
//        입력(car1,car2,car3)
//        List<Car> carList=carToList(car1,car2,car3);
//        입력(반복횟수) -미정
//
//        Car.goCount(carList);
//
//        makeLoad(carList);









    }

    public static List<Car> carToList(Car car1,Car car2,Car car3){
            List<Car> carList =new ArrayList<>(List.of(car1
                    ,car2,car3));
            return carList;
    }
    public static String makeLoad(Car car) {
        String load="-";
        String goLoad=car.getName()+load.repeat(car.get이동거리());

        return goLoad;
    }
    public static List<String> makeLoad(List<Car> carList) {
        String load="-";
        List<String> goLoad=carList.stream().map(car ->car.getName()+load.repeat(car.get이동거리())).toList();

        return goLoad;
    }

}






