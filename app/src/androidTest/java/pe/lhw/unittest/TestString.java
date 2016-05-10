package pe.lhw.unittest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
public class TestString {
    private MainActivity activity;

    /**
     * MainActivity의 Resource를 가져오기 위함
     * Activity와 테스트를 연갈함
     */
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    /**
     * test setup method (@Before)
     * 테스트를 수행하기 전에 실행됨
     */
    @Before
    public void setUp() {
       this.activity = mActivityRule.getActivity();
    }

    @Test
    public void testString() {
        String str = mActivityRule.getActivity().getString(R.string.testStr);
        assertThat("hihihi", is(str));
    }
}
