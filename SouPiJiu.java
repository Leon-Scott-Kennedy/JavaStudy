public class SouPiJiu{
     public static void main(String[] args){
          int N;  //啤酒瓶子的数量         
          for(N=99;N>0;N--){
            if(N!=1){
                System.out.println(N+" bottles of bear on the well"); 
            }else{
                System.out.println(N+" bottle of bear on the well");
            } //第一句话注意单复数
          System.out.println("Take one down");
          System.out.println("Pass it around");
            if(N>2&&N<=99){
                System.out.println((N-1)+" bottles of bear on the well\n");
            }else if(N==2){
                System.out.println((N-1)+" bottle of bear on the well\n");
            }else{
                System.out.println("No more bottles of beer on the well\n");
            } //最后一句话有三种情况
          }
     }

}
