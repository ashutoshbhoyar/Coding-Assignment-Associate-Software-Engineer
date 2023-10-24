import java.util.Random;

public class ArrayShuffleIt {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		Random random = new Random();

		for (int i = 0; i < arr.length ; i++) {
			int j = random.nextInt(i + 1);

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
