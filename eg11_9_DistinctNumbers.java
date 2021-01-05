package Example;

import java.util.Scanner;
import java.util.ArrayList;

public class eg11_9_DistinctNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integers (input end with 0): ");
		int value;
		
		while(true) {
			value = input.nextInt();
			if(value == 0)
				break;
			if(!list.contains(value) && value!=0)
				list.add(value);
		}
		for(int i=0;i<list.size();++i) {
			System.out.print(list.get(i)+" ");
		}
		input.close();
	}
}