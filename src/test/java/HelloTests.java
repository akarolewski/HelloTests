import org.junit.Test;

import static com.Hello.NAME;
import static com.Hello.testHelloName;
import static com.Hello.testHelloNameEmpty;

public class HelloTests {

  @Test
  public void helloChineseTest() {
    testHelloName("字");
  }

  @Test
  public void helloEmptyTest() {
    testHelloNameEmpty();
  }

  @Test
  public void helloActualNameTest() {
    testHelloName(NAME);
  }
}
