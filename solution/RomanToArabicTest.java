import junit.framework.*;
import org.junit.Test;

public class RomanToArabicTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}
	@Test
	public void test1() throws Exception {
		assertEquals(1, RomanToArabic.convertRomanToArabic("I"));
	}
	@Test
	public void test2() throws Exception {
		assertEquals(5, RomanToArabic.convertRomanToArabic("V"));
	}
	@Test
	public void test3() throws Exception {
		assertEquals(4, RomanToArabic.convertRomanToArabic("IV"));
	}
	@Test
	public void test4() throws Exception {
		assertEquals(1666, RomanToArabic.convertRomanToArabic("MDCLXVI"));
	}
	@Test
	public void test5() throws Exception {
		assertEquals(29, RomanToArabic.convertRomanToArabic("XXIX"));
	}
}
