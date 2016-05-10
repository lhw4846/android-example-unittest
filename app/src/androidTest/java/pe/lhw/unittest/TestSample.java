package pe.lhw.unittest;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class TestSample {
    private Calculator calculator;

    /**
     * test setup method (@Before)
     * 테스트를 수행하기 전에 실행됨
     */
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * test method (@Test)
     * annotation을 여러개 설정하면 테스트도 여러개 수행 가능
     */
    @Test
    public void test() {
        int result = calculator.add(12, 11);
        //assertThat(result, is(20));  // fail
        assertThat(result, is(23));  // success
    }
}
