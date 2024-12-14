package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Application {

    public static void main(String[] args) {


        List<Car> carList =inputToCarlist();
        int count = inputCount();

        for(int i=0;i<=count;i++) {
        System.out.printf("("+i+")\n");
        List<Car> newCarList=Car.goRandomCount(carList);//  기억할수있게 만들어줘!!!!!!
            System.out.println(newCarList);//계속 값이 새롭게 만들어져
            for (Car car : newCarList) {
            System.out.println(Application.makeLoad(car));
        }
    }
    Car.winner(carList);

    }
    static List<Car> inputToCarlist(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("레이스에 참가할 자동차들의 이름을 쉼표(,)로 구분하여 입력하세요. \n");
        String cars = scanner.nextLine();  //ho,yo,ni
        String carS1 = cars.substring(0, cars.indexOf(',')); //0,2   ho
        String carS2 = cars.substring(cars.indexOf(',') + 1,cars.indexOf(',',cars.indexOf(',') + 1));//3,
        String carS3 = cars.substring(carS1.length()+1+carS2.length()+1);
        List<Car> carList=carToList(new Car(carS1,0),new Car(carS2,0),new Car(carS3,0));
        return carList;
    }
    public static int inputCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 회 실행할까요?");
        int count = scanner.nextInt();
        return count;
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
        //List<String> goLoad=carList.stream().map(car ->new ArrayList(List.of( car.getName().concat(load.repeat(car.get이동거리()))))).toList();
        List<String> goLoad=new ArrayList<>();

        for (Car car : carList) {
            String s=car.getName().concat(load.repeat(car.get이동거리()));
            goLoad.add(s);
        }

        return goLoad;
    }


}






