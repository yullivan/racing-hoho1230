package racing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

class ApplicationTests {

    @Test
    void 랜덤값_테스트() {
        //given
        int randomNum = new Random().nextInt(6)+1;
        //then
        System.out.println(randomNum);
    }

}
