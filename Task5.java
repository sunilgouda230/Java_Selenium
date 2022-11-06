package assignment1;

public class Task5 {
    public static void main(String[] args) {
       // Write a program to print all prime numbers from 1-1000
        int num = 0;
        String  primeNumbers = "";
        for (int i = 1; i <= 1000; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
    }
}
