
public class CountNumberofDigits {
	public void count(int n) {
		int count =0;
	while(n!=0){
		    n=n/10;
			count++;
		}
		System.out.println("Number of Digits is : "+count);
	}

}
