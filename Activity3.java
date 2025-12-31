import java.util.Scanner;
class Activity3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        char choice;
        do {
            System.out.println("Enter the number");
            num = s.nextInt();
            if (num<min) {
                num=min;
            }
            if (num>max) {
                num=max;
            }
            System.out.println("Do you want to continue y/n?");
            choice = s.next().charAt(0);

        }
        while (choice == 'y' || choice == 'Y');
        System.out.println("Largest number "+max);
        System.out.println("Smallest number "+min);

    }
}
