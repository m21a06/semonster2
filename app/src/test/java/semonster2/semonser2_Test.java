package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class semonser2_Test {
  @Test
  public void testsemonster2() {
    semonster2 Test = new semonster2(5);
    assertNotNull("ドラゴン:レア度[5]", Test.toString());
  }
}
