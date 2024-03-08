
public class Powerofn {
public void power(int num,int n) {
	int result = 1;
	for(int i = 1 ; i <= n ; i++) {
		result = result*num;
	}
	System.out.println("Resulr : "+result);
}
}
