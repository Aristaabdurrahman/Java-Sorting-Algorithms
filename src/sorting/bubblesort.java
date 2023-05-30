package sorting;

import java.util.Arrays;

public class bubblesort {
	
	
	public static void sort(int[] x){
		
		int swap = 0;
		
		for(int i = 0; i < x.length; i++){
			for(int y = i; y < x.length; y++){
				if(x[y] > x[i]){
					swap = x[i];
					x[i] = x[y];
					x[y] = swap; 
				}
			}//
		}//
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {80,34,79,33,14,99,56,31,78};
		sort(data);
		for(int a = 0; a < data.length; a++){
			System.out.print(data[a] + " ");
		}
	}

}
