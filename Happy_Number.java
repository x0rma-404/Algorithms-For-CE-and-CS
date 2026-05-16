void main(){
    Scanner sc = new Scanner(System.in);
    IO.print("Daxil Et: ");
     int a = sc.nextInt();

     while (String.valueOf(a).length()>1) {
        int c=0;
        while (a!=0) {
            c=c+a%10;
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

}