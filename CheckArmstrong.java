import java.util.Scanner;
class CheckArmstrong {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int num=s.nextInt();
    int num2=num;
    int sum=0;
    while(num > 0) {
      int remainder= num%10;
      System.out.println(remainder);
      sum=remainder*remainder*remainder+sum;
      num=num/10;
  }
    System.out.println(sum);
    if (num2==sum){
      System.out.println("Yayy it's an armstrong number");
    }
    else{
      System.out.println("Noo it's not an armstrong number");
    }
}
}