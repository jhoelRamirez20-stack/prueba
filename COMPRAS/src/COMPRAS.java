
import java.util.*;
public class COMPRAS {
    
    public static void main(String[] args) {
     int com,b=0,m=0;
     Scanner dat =new Scanner(System.in);
     System.out.print("\n ING, MONTO DE LA COMPRA:");
     com =dat.nextInt();
     b=com/200;
     if (b>0)
     {
     	System.out.print("\nPAGAR "+b+"BILLETES DE 200bs");
     	com =com%200;
     	
     }
     b=com/100;
    if (b>0)
     
     {
     	System.out.print("\nPAGAR "+b+"BILLETES DE 100bs");
     	com =com%100;
     	
     }
      b=com/50;
    if (b>0)
     
     {
     	System.out.print("\nPAGAR "+b+"BILLETES DE 50bs");
     	com =com%50;
     	
     }
      b=com/20;
    if (b>0)
     
     {
     	System.out.print("\nPAGAR "+b+"BILLETES DE 20bs");
     	com =com%20;
     	
     }
      b=com/10;
    if (b>0)
     
     {
     	System.out.print("\nPAGAR "+b+"BILLETES DE 10bs");
     	com =com%10;
     	
     }
      b=com/5;
    if (b>0)
     
     {
     	System.out.print("\nPAGAR "+b+"monedas DE 5bs");
     	com =com%5;
     	
     }
      b=com/2;
    if (b>0)
     
     {
     	System.out.print("\nPAGAR "+b+"monedas DE 2bs");
     	com =com%2;
     	
     }
      b=com/1;
    if (b>0)
     
     {
     	System.out.print("\nPAGAR "+b+"modendas DE 1bs");
     	com =com%1;
     	
     }
     
     }
}
