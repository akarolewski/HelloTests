import org.junit.Test;

import static com.Hello.NAME;
import static com.Hello.testHelloNameEmpty;

public class HelloTests {

  @Test
  public void helloChineseTests() {
    testHelloNameEmpty("字");
  }

  @Test
  public void helloEmptyTest() {
    testHelloNameEmpty();
  }

  @Test
  public void helloActualNameTest() {
    testHelloNameEmpty(NAME);
  }
}
