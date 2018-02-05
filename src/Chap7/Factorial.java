package Chap7;

public class Factorial {
	//my fourth commit, practicing multiple changes push at one go
	int fact(int n){
		int result;
		
		if(n==1)
			return 1;
		
		result = fact(n-1)*n;		
		return result;
	}

}
