public class multiplicacion{
 public static void main(String[] args){
 int var1,var2=1;
 var1=Integer.parseInt(args[0]);
 int arg1[]=new int[10];
 for (int i=0;i<=9;i++){
  arg1[i]=var1*var2;
  System.out.println(var1+"x"+var2+" "+arg1[i]);
  var2++;
  }
 }
}
  