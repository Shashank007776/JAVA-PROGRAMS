
public class Armstrong {
	int count(int num) {
		int count = 0;
		while(num != 0) {
			num = num/10;
			count++;
		}
		return count;
	}
	boolean isArmstrong(int num) {
		int digits = count(num);
		int sum = 0;
		int original = num;
		while(num != 0) {
			int ld = num % 10;
			int cubeofld = (int)Math.pow(ld,digits);
			sum = sum+cubeofld;
			num = num/10;
		}
		if(original == sum) {
			return true;
		}
		else {
			return false;
		}
	}

	
		

	}


