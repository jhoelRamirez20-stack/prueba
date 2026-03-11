import java.util.Scanner;
public class DIGITOS {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
    
        String telf;
        int n;
        
        System.out.print("INGRESA TU NUMERO TELEFONICO: ");
        telf = leer.nextLine();
        
        n = telf.length();

        System.out.println("----------------------------------\n");

        if (n > 0) {
            char primero = telf.charAt(0);
            char medio = telf.charAt(n / 2);
            char ultimo = telf.charAt(n - 1);

            System.out.println(" PRIMER DIGITO: " + primero);
            System.out.println(" DIGITO DEL MEDIO: " + medio);
            System.out.println(" ULTIMO DIGITO: " + ultimo);
        } else {
            System.out.println(" NUMERO NO VALIDO.");
        }

        System.out.println("\n----------------------------------");
        System.out.println("      ORDEN ASCENDENTE            ");
        System.out.println("----------------------------------\n");

        
        System.out.print(" NUMERO ORDENADO: ");
        int i,j;
        for ( i = 0; i <= 9; i++)      { 
            for ( j = 0; j < n; j++)      { 
                
    if (Character.getNumericValue(telf.charAt(j)) == i) {
                    System.out.print(i);
                }
            }
        }
        
         System.out.println("\n----------------------------------");
        System.out.println("      ORDEN DESENDENTE        ");
        System.out.println("----------------------------------\n");

        System.out.print(" NUMERO ORDENADO: ");
        
        for ( i = 9; i >= 0; i--) { 
        	  for ( j = 0; j < n; j++)      { 
                if (Character.getNumericValue(telf.charAt(j)) == i) {
                    System.out.print(i);
                }
 
            }
        }
        System.out.println("\n----------------------------------");
        leer.close();
    }

}