//В последовательности чисел найти сумму «чётных и отрицательных» и «нечётных и
//отрицательных» чисел.

public class Main {
    public static void main(String[] args) {

        int sum1 = 0;
        int sum2 = 0;

        for (String x : args)
        {
            int number = Integer.parseInt(x);
            if (number < 0)
            {
                if (number % 2 == 1){
                    sum2 += number;
                }
                else {
                    sum1 += number;
                }
            }
        }
        System.out.println(sum1 + sum2);

    }
}