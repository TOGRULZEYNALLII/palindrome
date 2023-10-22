import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("palindrome yoxlamaq ucun ededi daxil edin:  ");
            Scanner scanner=new Scanner(System.in);
            int number =scanner.nextInt();
            int reversednumber=0,temp=number;
            while (temp>0){
                int yeni=temp%10;
                reversednumber=reversednumber*10+yeni;
                temp=temp/10;
            }
          if (number==reversednumber) {
              System.out.println("eded palindromdur");
          }else {
              System.out.println("eded palindrom deyildir");
          }

        scanner.close();
        }
}
