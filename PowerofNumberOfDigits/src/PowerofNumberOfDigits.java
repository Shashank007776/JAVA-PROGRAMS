
public class PowerofNumberOfDigits {

	public int count(int n) {
		int count =0;
		while(n!=0){
			    n=n/10;
				count++;
			}
			return count;
	
		
	}
	public void power(int num,int n) {
	int result = 1;
	for(int i = 1 ; i <= n ; i++) {
		result = result*num;
	}
	System.out.println("Result : "+result);
	}
	}

