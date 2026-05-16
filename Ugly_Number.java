import java.util.Scanner;

void main(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Daxil et: ");
    int a = scanner.nextInt();
        while (true) {
            if (a==1){
                IO.println("Ugly");
                break;
            }
            if (a==0){
                IO.println("Not Ugly");
                break;
            }
            if (a%2==0){
                a/=2;
            }
            else if (a%5==0){
                a/=5;
            }
            else if (a%3==0){
                a/=3;
            }
            else{
                IO.println("Not Ugly");
                break;
            }


        }
    }
    

