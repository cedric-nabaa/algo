package learning.algo;
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("start recursive: " + System.currentTimeMillis());
		System.out.println(computeFibRec(120));
		System.out.println("stop recursive: " + System.currentTimeMillis());
		System.out.println("start poly: " + System.currentTimeMillis());
		System.out.println(computeFibPol(120));
		System.out.println("stop poly: " + System.currentTimeMillis());
	}

	public static int computeFibRec(int x) {
		switch (x) {
		case 0:
			return 0;
		case 1:
			return 1;
		default:
			return computeFibRec(x - 1) + computeFibRec(x - 2);
		}
	}

	public static int computeFibPol(int x) {
		final int[] arr = new int[x];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[arr.length - 1] + arr[arr.length - 2];

	}

}
