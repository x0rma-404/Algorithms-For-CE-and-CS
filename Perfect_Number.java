import java.util.Scanner;

void main(){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int c = 0;
    for (int i = 1; i < a-1; i++) {
        if (a%i==0){
            c+=i;
        }
    }

    if (a==c){
        IO.println("Perfect");
    }
    else{
        IO.println("Not Perfect");
    }

    scanner.close();
}