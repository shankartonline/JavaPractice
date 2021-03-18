package lambda;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(numberOfPrime(100));

    }

    public static int numberOfPrime(int n){
        boolean[] primes = new boolean[n];
        for(int i = 2 ; i * i < primes.length;i++){
            //if(!primes[i]){
                for(int j = i;j*i< primes.length;j++){
                    primes[i * j] = true;
                }
            //}
        }

        int primeCount = 0;
        for(int i=2;i<primes.length;i++){
            if(!(primes[i])){
                primeCount++;
            }
        }

        return primeCount;
    }
}
