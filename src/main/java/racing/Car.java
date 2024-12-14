package racing;

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

    public String getName() {
        return name;
    }

    public int get이동거리() {
        return 이동거리;
    }
}
