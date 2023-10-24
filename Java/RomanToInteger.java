import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a roman number");
		String romanValue = sc.next().toUpperCase();

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		Integer result = map.get(romanValue.charAt(romanValue.length() - 1));

		for (int i = romanValue.length() - 2; i >= 0; i--) {

			if (map.get(romanValue.charAt(i)) < map.get(romanValue.charAt(i + 1))) {
				result = result - map.get(romanValue.charAt(i));
			} else {

				result = result + map.get(romanValue.charAt(i));
			}
		}

		System.out.println(result);
	}
}
