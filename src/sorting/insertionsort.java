package sorting;

public class insertionsort {
	
	public static void sort(int[] x){
		int sorted;
		int val;
		int swap;
		
		for(int i = 1; i < x.length; i++){
			sorted = i - 1;
			val    = x[i];
			
			while(sorted >= 0 && val < x[sorted]){
				swap = x[sorted];
				x[sorted] = x[sorted+1];
				x[sorted+1] = swap;
				sorted--;
			}
			
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
