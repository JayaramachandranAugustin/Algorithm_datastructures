package inversion;

public class InversionBruteForce {
public static void main(String args[]){
	int[] a={6,5,4,3,2,1};
	InversionBruteForce inv=new InversionBruteForce();
	System.out.println(inv.findInversion(a));
}
public int findInversion(int[] a){
	int result=0;
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]>a[j]){
				result++;
			}
		}
	}
	return result;
}
}
