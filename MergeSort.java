public class MergeSort implements SortingAlgorithm{

	public void sort(int [] a){
		int middle=a.length/2;
		if(a.length<2){
			return;
		}
		int [] L_arr = new int [middle];
		int [] R_arr = new int [a.length-middle];
		
		
		for (int k = 0; k < middle; k++){
			L_arr[k] = a[k];
		}
		for (int j = middle; j <a.length; j++){
			R_arr[j-middle]=a[j];
		}
		sort(L_arr);
		sort(R_arr);
		merge(a, L_arr, R_arr);
	
		
	}
	public void merge(int [] a, int[] l, int[] r){
		int L_length = l.length;
		int R_length = r.length;
		int i=0;
		int k=0;
		int index=0;
		//merge
		while(i < L_length && k < R_length){
			if(l[i] <= r[k]){
				a[index] = l[i];
				i++;
				
			}
			else{
				a[index] = r[k];
				k++;
			}
			index++;
		}
		
		while(i < L_length){
			a[index]= l[i];
			index++;
			i++;
		}
		while(k < R_length){
			a[index]= r[k];
			index++;
			k++;
		}
	}
	
}