class RunningNumberSquareSum {
    public static void main(String[] args) {
        
        int lowerBound = 1;
        int upperBound = 100;
        int sum = 0;
        while(lowerBound <= upperBound){
            sum  += lowerBound * lowerBound;
            lowerBound = lowerBound + 1;
        }
        
        System.out.println(sum);
    }
}
