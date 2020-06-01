import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ObjectUtilTest {
    
    @Test
    public void isExist_withNull_object_shouldReturn_false() {
        // given

        // when
        boolean isObjectExist = ObjectUtil.isExist((String) null);

        // then
        assertThat(isObjectExist, is(false));
    }

    @Test
    public void isExist_shouldReturn_true() {
        // given

        // when
        boolean isObjectExist = ObjectUtil.isExist("Something");

        // then
        assertThat(isObjectExist, is(true));
    }
}