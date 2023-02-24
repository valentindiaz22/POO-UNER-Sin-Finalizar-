public class primos{
 public static void main(String[] args){
 int suma=0, cantidad=100, contador=0, i=2, cantidadprimos=0;
 while (cantidadprimos<cantidad){
  contador=0;
  for (int j=1;j<=i;j++){
   if (i%j==0){
    contador++;
   }
  }
  if (contador==2){
   cantidadprimos=cantidadprimos+1;
   suma=suma+i;
  }
  i++;
 }
 System.out.println(suma);
 }
}