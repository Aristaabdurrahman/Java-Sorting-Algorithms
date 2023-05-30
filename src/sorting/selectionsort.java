package sorting;

public class selectionsort {
	
	public static void sort(int[] x){
		int swap;
		int MinVal;
		int MinIndex;
		for(int i = 0; i < x.length; i++){
			MinVal = x[i];
			MinIndex = i;
			for(int y = i; y < x.length; y++){
				if(x[y] < MinVal){
					MinVal = x[y];
					MinIndex = y;
				}
			}//
			if(MinVal < x[i]){
				swap = x[MinIndex];
				x[MinIndex] = x[i];
				x[i] = swap;
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
