package transferwise;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Pairs {

	public static void main(String[] args) {

		int a[] = {5,5,1,5,3,4};
		int d = 2;
		dif(a, d);
	}

	public static int dif(int[] a, int k){
		
		int dif = k;
		int pairs = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < a.length; i++) {
			list.add(Integer.valueOf(a[i]));
		}
		
		for (int i = 0; i < list.size(); i++) {
			
			if(list.contains(list.get(i)+dif)){
				pairs += getOccurences(list, list.get(i)+dif);
				list.remove(list.get(i));
			}
				//pairs ++;
		}
//	
		System.out.println(pairs);
		return pairs;
	}
	
	public static int getOccurences(List<Integer> list, int num){
		int occurence = 0;
		for (int i = 0; i < list.size(); i++) {
			if(num == list.get(i))
				occurence++;
		}
		return occurence;
	}
}
