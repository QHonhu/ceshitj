package demo;
import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
  int num[] = new int[6];
  Scanner sc = new Scanner(System.in);
  System.out.println("������6λͬѧ�ķ�����");
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
    System.out.println("����ƽ������ֵΪ��"+num[i]);
    //System.out.println(i+"��");
  }
 }
}