public class tablamul{
 public static void main(String[] args){
 int a,res;
 a=Integer.parseInt(args[0]);
 for (int i=1;i<11;i++){
  res=a*i;
  System.out.println(a+"x"+i+"= "+res);
 }
 }
}