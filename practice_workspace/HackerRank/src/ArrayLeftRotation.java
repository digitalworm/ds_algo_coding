import java.io.IOException;
import java.util.Scanner;

public class ArrayLeftRotation {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {

		for(int i = 0; i < d; i++ ) {
			int tempItem = a[0];
			
			//Shift elements.
			int counter = 0;
			for(int j = 0; j < a.length - 1; j++) {
				a[j] = a[j+1];
				counter++;
			}
			a[counter] = tempItem;
		}
		
		return a;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] result = rotLeft(a, d);

		for (int i = 0; i < result.length; i++) {
			//bufferedWriter.write(String.valueOf(result[i]));

//			if (i != result.length - 1) {
//				bufferedWriter.write(" ");
//			}
			System.out.print(result[i] + " ");
		}

		//bufferedWriter.newLine();

		//bufferedWriter.close();

		scanner.close();
	}
}
