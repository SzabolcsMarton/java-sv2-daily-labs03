package day02;

public class Mathematics {


    private boolean isPrime = true;

    public boolean numberIsPrime(int number) {
        for (int i = 2; i < number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();

        System.out.println(mathematics.numberIsPrime(7));
    }
}
