package OnlineJavaTestQuest;

import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
		//THis is my Second Commit
		//Practicing commint and push upstream options
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();
//		String line = scanner.nextLine();
		scanner.close();
		//long[] primenos = new long[input];
		
		long primenoindex=1;
		//primenos[0]=2;
		long currentprimeno=2;
		if(input!=1){
		for(long numbers=3;numbers>2;numbers++){
			long divisiblecount = 0;
			for(long j=1;j<=numbers;j++){
				if(numbers%j==0){
					divisiblecount++;
				}
				if((divisiblecount==2)&&(numbers==j)){
					//primenos[primenoindex]=numbers;
					//System.out.println(primenos[primenoindex]);
					currentprimeno=numbers;
					primenoindex++;
				}
/*				else if(divisiblecount>2||numbers==j){
					break;
				}*/
			}
			if(primenoindex==input){
//				for(int n=0;n<input;n++){
					System.out.println("Prime number at index no "+input+" is  "+currentprimeno);
//				}
				break;
			}

		}
		}else if(input<1){
			System.out.println("Input cannot be zero or negative value");
		}else{
			System.out.println("Prime number at index no "+input+" is  "+currentprimeno);
		}
	}

}
