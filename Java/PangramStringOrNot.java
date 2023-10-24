import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramStringOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check Pangram or not : ");
		String str = sc.nextLine();

		Set<Character> set = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				set.add(str.charAt(i));
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				set.add(Character.toLowerCase(str.charAt(i)));
			}
		}
		if (set.size() == 26) {
			System.out.println("String is pangram");
		} else {
			System.out.println("String is not pangram");
		}
	}
}