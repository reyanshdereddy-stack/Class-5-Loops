import java.util.Scanner;
class Activity2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i; 
        int sum=0;
        for(i=1; i<n+1; i++){
            
            sum += i;
        }
System.out.println("The sum is "+ sum);
    }
}
