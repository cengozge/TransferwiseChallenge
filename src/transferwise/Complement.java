package transferwise;

public class Complement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getComplement(50);
	}

	static void getComplement(int n){
		
		StringBuilder two = new StringBuilder();
		int res = n;
		int complement = 0;
		for (int i = 2; res/2 > 0; i++) {
			int mode = res % 2;
			res = res/2;
			two.append(String.valueOf(mode));
			if(res == 1)
				two.append(String.valueOf(mode));
		}
		
		
		//System.out.println(two);
		
		for (int i = 0; i < two.length(); i++) {
			if("0".equals(String.valueOf(two.charAt(i)))){
				complement += 1 * Math.pow(2, i);
			}
		}
		System.out.println(complement);
	}
}
