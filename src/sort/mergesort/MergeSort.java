package sort.mergesort;

public class MergeSort {
public int[] splitArray(int[] inputArray){
	if((inputArray.length==1||inputArray.length==0)){
		return inputArray;
	}
	int aryLen=inputArray.length;
	int[] part1 = new int[aryLen/2];
	int[] part2 = new int[aryLen%2==0?aryLen/2:(aryLen/2)+1];
	System.arraycopy(inputArray, 0, part1, 0, part1.length);
	System.arraycopy(inputArray, part1.length, part2, 0, part2.length);
	
	return mergeSort(splitArray(part1), splitArray(part2),inputArray);
}
public int[] mergeSort(int[] part1,int[] part2,int[] result){
	int k=0;
	int a=0,b=0;
	while(a<part1.length&&b<part2.length){
		if(part1[a]<part2[b]){
			result[k]=part1[a];
			a++;
		}
		else {
			result[k]=part2[b];
			b++;
		}
		k++;
	}
	System.arraycopy(part1, a, result, k, part1.length-a);
	System.arraycopy(part2, b, result, k, part2.length-b);
	return result;
}
public static void main(String args[]){
	int inputArray[]={3,5,2,7,8,9,1,1};
	MergeSort merge=new MergeSort();
	merge.splitArray(inputArray);
	for(int i:inputArray){
		System.out.println(i);
	}
}
}
