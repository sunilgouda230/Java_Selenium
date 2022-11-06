package assignment1;

public class Task3 {
    //Write a program to print all even numbers from 1-200

    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++){
            if(i % i == 0 && i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
