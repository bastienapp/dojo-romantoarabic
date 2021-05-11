import junit.framework.*;
import org.junit.Test;

public class RomanToArabicTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}
	
	@Test
	public void given2018Roman_WhenConvertingToArabic_ThenReturn2018() {
	    String roman2018 = "MMXVIII";

	    int result = RomanArabicConverter.romanToArabic(roman2018);

	    assertThat(result).isEqualTo(2018);
	}
}
