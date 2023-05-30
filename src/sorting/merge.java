package sorting;

public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {80,34,79,33,14,99,56,31,78};
		
		/*for(int a = 0; a < data.length; a++){
			System.out.print(data[a] + " ");
		}*/
		//System.out.println();
		data = merge(data);
		for(int a = 0; a < data.length; a++){
			System.out.print(data[a] + " ");
		}
	}
	
	
	public static int[] merge(int[] x){
		if(x.length <= 1){
			return x;
		}
		
		int midpoint = x.length/2;
		
		int[] left = new int[midpoint];
		int[] right;
		
		if(x.length % 2 == 0){
			right = new int[midpoint];
		}else{
			right = new int[midpoint+1];
		}//
		
		
		
		for(int i = 0; i < midpoint; i++){
			left[i] = x[i];
		}//
		
		/*int add = 0;
		for(int y = midpoint; y < x.length; y++){
			if(add < right.length){
				right[add] = x[y];
				add++;
			}
		}*/
		
		// 
		
		for(int y = midpoint; y < x.length; y++){
			right[y] = x[y];
		}
		
		int[] result = new int[x.length];
		
		left = merge(left);
		right = merge(right);
		
		result = mergesort(left, right);
		
		return result;
	}
	
	public static int[] mergesort(int[] left, int[] right){
		int lengthresult = left.length + right.length;
		int[] result = new int[lengthresult];
		int indexL = 0;
		int indexR = 0;
		int indexResult = 0;
		
		while(indexL < left.length || indexR < right.length){
			if(indexL < left.length && indexR < right.length){
				if( left[indexL] <= right[indexR] ){
					result[indexResult] = left[indexL];
					indexL++;
					indexResult++;
				}else{
					result[indexResult] = right[indexR];
					indexR++;
					indexResult++;
				}//
			}else if( indexL < left.length ){
				result[indexResult] = left[indexL];
				indexL++;
				indexResult++;
			}else if( indexR < right.length ){
				result[indexResult] = right[indexR];
				indexR++;
				indexResult++;
			}
		}//
		return result;
	}

}
