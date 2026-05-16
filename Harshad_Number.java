void main(){
    int a = Integer.parseInt(IO.readln());
    int k = a;
    int c=0;
    while (a!=0) {
        c+=a%10;
        a/=10;
    }

    if (k%c==0){
        IO.println("Harshad");
    }
    else{
        IO.println("Not Harshad");
    }
}