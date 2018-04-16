package demo;
import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
  int num[] = new int[6];
  Scanner sc = new Scanner(System.in);
  System.out.println("请输入6位同学的分数：");
  for (int i = 0; i < 6; i++) {
num[i] = sc.nextInt();  }
  double avg;
  long sum = 0;
  for (int i = 0; i < num.length; i++) {
   sum = sum + num[i];
  }
  avg = sum / 6;
for (int i = 0; i < num.length; i++) {
   if (num[i] > avg)
   //i++;
    System.out.println("大于平均数的值为："+num[i]);
    //System.out.println(i+"个");
  }
 }
}