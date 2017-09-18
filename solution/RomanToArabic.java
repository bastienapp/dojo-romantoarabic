import java.util.HashMap;

class RomanToArabic {

	public static int convertRomanToArabic(String roman) {
		char[] romanChars = roman.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int arabic = 0;

		for(int i = 0; i < romanChars.length; i++) {
			if (romanChars[i] == 'I' && (i + 1) < romanChars.length) {
				if (romanChars[i + 1] != 'I') {
					arabic -= 1;
				} else {
					arabic += 1;
				}
			} else {
				arabic += map.get(romanChars[i]);
			}
		}
		return arabic;

	}
}
