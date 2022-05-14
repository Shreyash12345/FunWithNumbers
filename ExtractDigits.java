import java.util.Scanner;
class ExtractDigits {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int num=s.nextInt();
    int num2=num;
    while(num > 0) {
      int remainder= num%10;
      System.out.println(remainder);
      num=num/10;
  }
}
}