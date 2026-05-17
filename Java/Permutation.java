void main(){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int p = scanner.nextInt();

    int k = 1;
    int np =1;
    for (int i = 1; i < 1+n; i++) {
        k*=i;
    }

    for (int i = 1; i < n-p+1; i++) {
        np*=i;
    }

    System.out.println(k/np);

    scanner.close();

}