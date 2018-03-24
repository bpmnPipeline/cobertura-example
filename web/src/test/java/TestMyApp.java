import com.shekhar.ce.web.MyApp;
import org.junit.Assert;
import org.junit.Test;

public class TestMyApp {
    @Test
    public void test() {
        Assert.assertNotNull(new MyApp().app());
    }
}
