package com.Patterns.Level38;

public class Main {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				int num =0;
				num++;
				if((i==2&&j==2)||(i==1&&j==1)||(i==3&&j==1)||(i==3&&j==3)||(i==4&&j==2)||(i==4&&j==4))
				{
					System.out.print(+num);
				}
				else {
					num--;
					System.out.print(+num);
				}
				
			}
			System.out.println();
		}

	}

}
