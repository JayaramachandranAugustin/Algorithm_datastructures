package inversion;

public class InversionDivideConquer {
	int number=0;
	public int[] splitArray(int[] inputAry){
		if(inputAry.length<=1){
			return inputAry;
		}
		
		int[] part1=new int[inputAry.length/2];
		int[] part2=new int[inputAry.length-part1.length];
		
		System.arraycopy(inputAry, 0, part1, 0, part1.length);
		System.arraycopy(inputAry, part1.length,part2 , 0, part2.length);
		return findInversion(splitArray(part1),splitArray(part2),inputAry);
	}
	public int[] findInversion(int[] part1,int[] part2,int[] result){
		int first=0;
		int second=0;
		int k=0;
		while(first<part1.length&&second<part2.length){
			if(part1[first]<part2[second]){
				result[k]=part1[first];
				first++;
			}
			else{
				result[k]=part2[second];
				number=number+part1.length-first;
				second++;
			}
			k++;
		}
		System.arraycopy(part1, first, result, k, part1.length-first);
		System.arraycopy(part2, second, result, k, part2.length-second);
		return result;
	}
	public static void main(String args[]){
		int[] ary={6,5,4,3,2,1};
		InversionDivideConquer idc=new InversionDivideConquer();
		idc.splitArray(ary);
		System.out.println("The number of inversions are "+idc.number);
	}
}
