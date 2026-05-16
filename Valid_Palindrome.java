void main(){
    StringBuilder a = new StringBuilder();
    String c = IO.readln("Daxil Et: ");
    c = c.toLowerCase();
    for (int i = 0; i < c.length(); i++) {
        if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z') {
            a.append(c.charAt(i));
        }
    }

    if (a.toString().equals(a.reverse().toString())) {
        IO.println("Valid Palindrome");        
    }
    else{
        IO.print("Not Valid Palindrome");
    }
    
}