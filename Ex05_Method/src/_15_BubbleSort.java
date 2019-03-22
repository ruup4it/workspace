
public class _15_BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 7, 9, 4, 1, 5 };
		ascBubleSort(arr);
		descBubleSort(arr);
	}

	public static int[] ascBubleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				for (int k = 0; k < arr.length; k++)
					System.out.print(arr[k] + " ");
				System.out.println();
			}
		}
		return arr;
	}

	public static int[] descBubleSort(int[] arr) {
		int temp = 0;
		System.out.println("====================");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				for (int k = 0; k < arr.length; k++)
					System.out.print(arr[k] + " ");
				System.out.println();
			}
		}
		return arr;
	}
}
