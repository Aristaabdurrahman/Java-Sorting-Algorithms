package sorting;
import java.util.Random;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] number = new int[20];
		
		//quicksort(number);
		for(int x = 0; x < number.length; x++){
			number[x] = rand.nextInt(100);
		}
		quicksort(number);
		for(int x = 0; x < number.length; x++){
			System.out.print(number[x] + " ");
		}
	}
	
	//overriding_method
	public static void quicksort(int[] arrayData){
		quicksort(arrayData, 0, arrayData.length-1);
	}
	
	public static void quicksort(int[] array, int lowIndex, int highIndex){
		
		if(lowIndex >= highIndex){
			return;
		}
		
		int left = lowIndex;
		int right = highIndex;
		int pivot = array[highIndex];
		int swap = 0;
		
		while(left < right){
			while(array[left] <= pivot && left < right){
				left++;
			}//leftlooping
			while(array[right] >= pivot && left < right){
				right--;
			}//rightlooping
			
			//swap
			swap(array, left, right);
		}//endwhile
		
		//swapPivot
		swap(array, left, highIndex);
		
		//recursion
		quicksort(array, lowIndex, left-1);
		quicksort(array, right+1, highIndex);
	}
	
	public static void swap(int[] array, int index1, int index2){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
