package assignment1;

public class Task7 {
    public static void main(String[] args) {
       // Task 8- Write a program to print below students marks who have scored above 80
        //Example- 78,12,89,5

        int arr [] = {78,12,89,5};

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 80) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
