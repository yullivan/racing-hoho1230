package racing;

import java.util.*;

public class Car {
    String name;
    int 이동거리;

    public Car(String name, int 이동거리) {
        if(name.length()>10){
            throw new IllegalArgumentException("자동차 이름은 10자를 초과할 수 없습니다.");
        }
        this.name=name;
        this.이동거리=이동거리;
    }

    public void set이동거리(int 이동거리) {
        this.이동거리 = 이동거리;
    }

    int goRandomCount(int 이동거리){

        int randomNum = new Random().nextInt(6)+1;
        if(!(randomNum==1||randomNum==2)){
            이동거리+=1;

        }
        return 이동거리;
    }
    static void goRandomCount(List<Car> carList){
        //List<Car> 새로운carList =new ArrayList<>();
        for (Car car : carList) {
            int randomNum = new Random().nextInt(6)+1;
            if(!(randomNum==1||randomNum==2)){
                car.set이동거리(car.get이동거리()+1);
            }
        }
    }

    public String getName() {
        return name;
    }
    public String getName(String emoji) {
        return this.name+" "+emoji;
    }

    public int get이동거리() {
        return 이동거리;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return 이동거리 == car.이동거리 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, 이동거리);
    }
    static List<String> winner(List<Car> carList){
        int max= Collections.max(carList.stream().map(car -> car.get이동거리()).toList());

        List<String> 우승자리스트=carList.stream().filter(car -> car.get이동거리()==max).map(car -> car.getName()).toList();

        return 우승자리스트;
    }

    @Override
    public String toString() {
        return name;
    }
}
