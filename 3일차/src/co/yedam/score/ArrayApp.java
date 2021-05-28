package co.yedam.score;

public class ArrayApp {
	int[] arr = new int[10];

	void init() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println();
	}

	void total() {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		System.out.println();
	}

	void max() {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			System.out.println();
		}
	}

	void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ArrayApp app = new ArrayApp();
		app.init();
		app.total();
		app.max();
		app.print();
	}
}