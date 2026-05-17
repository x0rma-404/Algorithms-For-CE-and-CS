void main() {
    Scanner sc = new Scanner(System.in);

    String Pol = sc.nextLine();

    if (new StringBuilder(Pol).reverse().toString().equals((Pol))){
        IO.println("PALINDROME");
    }
    else {
        IO.println("NOT PALINDROME");
    }

    sc.close();
}