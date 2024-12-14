package racing;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.*;

class ApplicationTests {

    @Test
    void 차생성테스트() {
        Car car1 = new Car("이름", 4);

        assertThat(car1.getName()).isEqualTo("이름");
        assertThat(car1.get이동거리()).isEqualTo(4);
    }

    @Test
    void 차생성오류테스트() {

        assertThatThrownBy(()->new Car("엄청이름이 긴 자동차가 지나갑니다", 10)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void cartolistTest() {
        Car car1 = new Car("c1", 1);
        Car car2 = new Car("c2", 2);
        Car car3 = new Car("c3", 3);

        List<Car> carList = Application.carToList(car1,car2,car3);
        assertThat(carList).isEqualTo(List.of(new Car("c1",1),new Car("c2",2),new Car("c3",3)));
    }
}



