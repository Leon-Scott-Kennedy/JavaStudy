public class Memoryaddress{
     public static void main(String[] args){
         String s1 = "hello";
         String s2 = "world";
         System.out.println(System.identityHashCode(s1));
         System.out.println(System.identityHashCode(s2));
     }

}