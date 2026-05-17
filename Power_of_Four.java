void main(){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();

    if (a <= 0){
        System.out.println("4 un quvveti deyil");
        scanner.close();
        return;
    }

    while (a % 4 == 0) {
        a /= 4;
    }

    if(a == 1){
        System.out.println("4 un quvvetidir");
    }
    else{
        System.out.println("4 un quvveti deyil");
    }

    scanner.close();
}