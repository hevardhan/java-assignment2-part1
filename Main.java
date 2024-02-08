package part1;

public class Main {
    private static void print(float[] arr, int count)
    {
        for (int i=0;i <count; i++)
        {
            System.out.println(""+arr[i]);
        }
    }

    public static void main(String[] args) {
        input inp = new input();
        check_num check = new check_num();

        int num_total = inp.totalNumber();
        int count_even=0, count_odd=0;

        float[] even = new float[num_total];
        float[] odd = new float[num_total];

        for(int i=0; i<num_total; i++)
        {
            float number = inp.inputNumber();

            String numType = check.checker(number);
            if (numType.equals("Even"))
            {
                even[count_even] = number;
                count_even++;
            }

            else
            {
                odd[count_odd] = number;
                count_odd++;
            }
        }
        System.out.println("Even Numbers: ");
        print(even, count_even);

        System.out.println("\nOdd Numbers: ");
        print(odd, count_odd);
    }
}