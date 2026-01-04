import java.util.Scanner;
class Afterclassproject {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a positive integer to generate a fibanocci sequence of that many numbers.");
      int n = s.nextInt();
      long c,x;
      long a=0;
      long b=1;
      for(x=0; x<n; x++){
        System.out.println(a);
        c=a+b;
        a=b;
        b=c;
      }
    }
}
