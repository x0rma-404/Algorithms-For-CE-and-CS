void main(){
    Scanner sc = new Scanner(System.in);
    IO.print("Daxil Et: ");
     int a = sc.nextInt();
     while (a!=1 && a!=4) {
        int c=0;
        while (a!=0) {
            c=c+(int)(Math.pow(a%10,2));
            a=a/10;
        }
        a=c;
     }

     if (a==1) {
        IO.println("Happy");
     }
     else{
        IO.println("Not Happy");
     }

     sc.close();
}