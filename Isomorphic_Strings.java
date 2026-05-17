void main(){
    Scanner scanner = new Scanner(System.in);
    String e = scanner.nextLine();
    String t = scanner.nextLine();
    StringBuilder c = new StringBuilder();
    HashMap<Character, Character> hash = new HashMap<>();

    for (int i = 0; i < e.length(); i++) {

        if (!hash.containsKey(e.charAt(i)) && !hash.containsValue(t.charAt(i))) {
            hash.put(e.charAt(i), t.charAt(i));
        }
    }

    for (int i = 0; i < e.length(); i++) {
        c.append(hash.get(e.charAt(i)));
    }

    if(t.equals(c.toString())){
        System.out.println("ISOMORPHIC");
    }
    else{
        System.out.println("NOT ISOMORPHIC");
    }

    scanner.close();
}