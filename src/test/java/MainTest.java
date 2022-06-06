import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MainTest {

   @Test
    public void multipleWordsToUppercase(){
        List<String> input = Arrays.asList("a","b","demo");
        List<String> result = Main.allToUpperCase(input);
       Assert.assertEquals(Arrays.asList("A","B","DEMO"),result);
    }
}
