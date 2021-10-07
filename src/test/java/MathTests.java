import org.junit.Assert;
import org.junit.Test;

public class MathTests {

    @Test
    public void test_add() {
        Assert.assertEquals(7, Math.add(3, 4));
    }

    @Test
    public void test_add_2() {
        Assert.assertEquals(8, Math.add(3, 4));
    }

    @Test
    public void test_add_3() {
        Assert.assertEquals(9, Math.add(3, 4));
    }
}
