public  class Recursion_Practice{

public static double recursionPower(int a, int n) throws IllegalArgumentException{
	if( n == 0){
		return 1;
	}

	else if( n >= 1){
		return a*(recursionPower(a, n-1));
	}

	else {
		return 1/recursionPower(a, -1*n);
	}

}

public static void main(String[] args) {

 	System.out.println(recursionPower(2,5));
	
}
}

	
