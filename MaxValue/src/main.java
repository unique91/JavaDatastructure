import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Length of Array?");
		int len = scanner.nextInt();
		
		int[] arr = new int [len];
		// create dynamic array and fill it
		int i = 0;
		while(i < len) {
			System.out.println("Enter a Number");
			int input = scanner.nextInt();
			arr[i] = input;
			i++;
		}
		
		// output the array
		System.out.print("|");
		for(int j = 0; j < len; j++) {
			System.out.print(arr[j] + " | ");
		}
		System.out.println();
		
		// search maximum in the array
		int maxValue = arr[0];
		for(int k = 1; k < len; k++) {
			if(maxValue < arr[k]) 
				maxValue = arr[k];
		}
		System.out.println("Maximum in Array are: " + maxValue);
	}

}
