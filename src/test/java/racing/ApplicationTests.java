package racing;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTests {

    @Test
    void 랜덤값_테스트() {
        //given
        int randomNum = new Random().nextInt(6)+1;
        //then
        System.out.println(randomNum);
    }

    @Test
    void 차_생성에러() {
        assertThatThrownBy(()->new Car("우리집자동차는열자가넘어요")).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    void game함수테스트() {
        //given
        Car car1 = new Car("car1");
        //when

        //then
        //System.out.println(car1.game());
    }
}
