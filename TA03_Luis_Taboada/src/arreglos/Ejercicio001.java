
package arreglos;
/**
 * @author ASUS
 */
import java.util.Scanner;
public class Ejercicio001 {

    /**
     * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla 
     * separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación cambiará todas 
     * las ocurrencias del primer valor por el segundo en la lista generada anteriormente. Los números que se han 
     * cambiado deben aparecer entre comillas.
     */
    public static void main(String[] args) {
        // variables
        int tmp, i,j,LI,LS;
        //arreglos
        int n[]=new int[10];
        //entrada
        Scanner te= new Scanner(System.in);
        System.out.println("numero 1: ");
        n[0]=te.nextInt();
        System.out.println("numero 2: ");
        n[1]=te.nextInt();
        System.out.println("numero 3: ");
        n[2]=te.nextInt();
        System.out.println("numero 4: ");
        n[3]=te.nextInt();
        System.out.println("numero 5: ");
        n[4]=te.nextInt();
        System.out.println("numero 6: ");
        n[5]=te.nextInt();
        System.out.println("numero 7: ");
        n[6]=te.nextInt();
        System.out.println("numero 8: ");
        n[7]=te.nextInt();
        System.out.println("numero 9: ");
        n[8]=te.nextInt();
        System.out.println("numero 10: ");
        n[9]=te.nextInt();
        //proceso
        LI=0;
        LS=n.length-1;
        for(i=LI; i<=LS-1; i++){
            for(j=LI; j<=LS-1; j++){
                if(n[j]>n[j+1]){
                    tmp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=tmp;
                }
            }
        }
        System.out.println("");
        System.out.println("ordenado");
        System.out.println("Numero 1:"+n[0]);
        System.out.println("Numero 2:"+n[1]);
        System.out.println("Numero 3:"+n[2]);
        System.out.println("Numero 4:"+n[3]);
        System.out.println("Numero 5:"+n[4]);
        System.out.println("Numero 6:"+n[5]);
        System.out.println("Numero 7:"+n[6]);
        System.out.println("Numero 8:"+n[7]);
        System.out.println("Numero 9:"+n[8]);
        System.out.println("Numero 10:"+n[9]);
    
  }
}
    
    

