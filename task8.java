package assignment1;

public class task8 {
    public static void main(String[] args) {
        //Write a program which will break the current execution if it find number 85
        //Input – [12,34,66,85,900]

        int arr [] = {12,34,66,85,900};

        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 85){
                System.out.println("Found 85");
                break;
            }
        }


    }
}
