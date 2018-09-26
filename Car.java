
import java.util.*;

public class Car{
//属性
   String []model;
   double []tan;
   double []oil;

//方法 
      public Car(int n){
      this.model = new String[n];
      this.tan = new double[n];
      this.oil = new double[n];
   }
   public void run(){};
   public void gas(){};
 //主函数 
   public static void main(String[] args){
       int i;
//输入
       Scanner sc = new Scanner(System.in);
       Car array = new Car(5);
//油箱和油耗利用数组传参的方式提前赋值
       double tan1[] = {40.0,42.5,50.0,35.5,55.0};
       double oil1[] = {2.0,1.5,2.0,1.5,3.0};
       for(i=0;i<5;i++){
           array.tan[i] = tan1[i];
       }
       for(i=0;i<5;i++){
           array.oil[i] = oil1[i];
       }
//输入5辆车的型号   
       for(i = 0;i < 5;i++){
           System.out.print("第"+(i+1)+"辆车的型号:");
           array.model[i] = sc.next();
       }
//输出5辆车的参数
       for(i = 0;i < 5;i++){
           System.out.println("第"+(i+1)+"辆车的属性"); 
           System.out.println("The model of the car:"+array.model[i]+"\n"+"The tank of the car:"+array.tan[i]+"\n"+"The oilConsumption of the car:"+array.oil[i]); 
       }

   }

}

