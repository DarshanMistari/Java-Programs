import java.util.Scanner;

public class Stack_Operations {

      static int top = -1;
     final static int MAXSIZE=5;
      static int stack[] = new int[MAXSIZE];
    static Scanner scan = new Scanner(System.in);

    static void push(){
        int num;
       if( top == MAXSIZE-1){
          System.out.println("Stack is Overflow");
       } 
       else{
        System.out.println("Enter an Elements for Push :");
        num = scan.nextInt();
        top++;
        stack[top] = num;
       }
    }

    static void pop(){

        if(top == -1){
            System.out.println("Stsck is Empty");
        }
        else{
            int num;
            num = stack[top];
            top--;
            System.out.println("Poped the Elements :"+num);
        }

    }

    // static void display(){

    //     if(top == -1){
    //         System.out.println("Stack is Empty");
    //     }
    //     else{
    //         System.out.println("Elements of Stack :");
    //         for(int i=top; i=0; i--)
    //         {
    //             System.out.println(stack[i]);
    //         }
    //     }
    // }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);

        do { 

            System.out.println("********** Stack MEnu  **********");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("***********************************");

            System.out.println("Enter Your Choice :");
            choice = scan.nextInt();

            switch (choice) {
                case 1 -> push();

                case 2 -> pop();

                // case 3 -> display();

                case 4 -> {
                }
                default -> System.out.println("Invalid Choice.");
            }
        } while(choice != 3);
    }
}
