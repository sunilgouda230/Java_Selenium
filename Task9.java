package assignment1;

public class Task9 {

    public static void main(String[] args) {
//        Task 10- Write a program which will break the current execution if it find “Selenium”
//        Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]

        String arr [] = {"Java","JavaScript","Selenium","Python","Mukesh"};

        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals("Selenium")){
                System.out.println("Found Selenium");
                break;
            }
        }
    }
}
