
import java.util.*;

public class Car{
//����
   String []model;
   double []tan;
   double []oil;

//���� 
      public Car(int n){
      this.model = new String[n];
      this.tan = new double[n];
      this.oil = new double[n];
   }
   public void run(){};
   public void gas(){};
 //������ 
   public static void main(String[] args){
       int i;
//����
       Scanner sc = new Scanner(System.in);
       Car array = new Car(5);
//������ͺ��������鴫�εķ�ʽ��ǰ��ֵ
       double tan1[] = {40.0,42.5,50.0,35.5,55.0};
       double oil1[] = {2.0,1.5,2.0,1.5,3.0};
       for(i=0;i<5;i++){
           array.tan[i] = tan1[i];
       }
       for(i=0;i<5;i++){
           array.oil[i] = oil1[i];
       }
//����5�������ͺ�   
       for(i = 0;i < 5;i++){
           System.out.print("��"+(i+1)+"�������ͺ�:");
           array.model[i] = sc.next();
       }
//���5�����Ĳ���
       for(i = 0;i < 5;i++){
           System.out.println("��"+(i+1)+"����������"); 
           System.out.println("The model of the car:"+array.model[i]+"\n"+"The tank of the car:"+array.tan[i]+"\n"+"The oilConsumption of the car:"+array.oil[i]); 
       }

   }

}

