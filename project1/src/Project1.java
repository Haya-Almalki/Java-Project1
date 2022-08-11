import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Project1 {
    static ArrayList <String> todoList=new ArrayList<String>();
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("* Todo List *\n" +
                "Enter Your choice or choose -1 to exit \n" +
                "1- To add to the todo list \n" +
                "2- To delete from the todo list \n" +
                "3- To update from the todo list \n" +
                "4- To print all the todos ");
        int choice=0;
        while(choice!=-1){
            choice = readInt();
            if (choice == 1) {
                    add();
            } else if (choice == 2) {
                remove();
            } else if (choice == 3) {
                replace();
            } else if (choice == 4) {
                System.out.println(todoList);
                System.out.println("choose another choice");
            } else if(choice!=-1){
                System.out.println("Your choice not in the list!");
            }
            System.out.println("----------");
        }
        System.out.println("program terminated , based on user input");
    }
    public static void add(){
        System.out.println("Enter your todo name :");
        String todoName = input.next();
        todoList.add(todoName);
        System.out.println("Your todo saved .. choose another choice");
    }
    public static void remove(){
        System.out.println("Enter the todo index that you want to remove:");
        int index = readInt();
        while(index>=todoList.size()){
            System.out.println("Sorry wrong index! try again!");
            index = readInt();
        }
        todoList.remove(index);
        System.out.println("Your todo saved .. choose another choice");
    }
    public static void replace(){
        System.out.println("Enter the todo index that you want to replace :");
        int index = readInt();
        System.out.println("Enter the todo name :");
        String name = input.next();
        todoList.set(index, name);
        System.out.println("Your todo saved .. choose another choice");
    }
    public static int readInt() {
        int choice = 0;
        boolean check=true;
        do {
        try {
            choice = input.nextInt();
            check=false;
            return choice;
        } catch (InputMismatchException e) {
            System.out.println("Incorrect datatype choice, Try again please!");
            input.nextLine();
        }
        } while (check);
        return choice;
    }
}