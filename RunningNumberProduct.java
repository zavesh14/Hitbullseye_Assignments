class RunningNumberProduct
	 { public static void main(String[] args) { 
	int lowerBound = 1; 
	int upperBound = 10; 
	int product = 1;
	 while(lowerBound <= upperBound){
	 product *= lowerBound; 
	lowerBound = lowerBound + 1; 
	}
	 System.out.println(product); 
	}
}
