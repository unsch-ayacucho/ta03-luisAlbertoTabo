
package arreglos;

/**
 *Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 
 * (ambos incluidos). A continuación, el programa mostrará el array y preguntará si el usuario quiere destacar el 
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el número destacado 
 * entre dobles asteriscos.
 */
import java.util.Scanner;

public class Ejercicio003 {
    public static void main(String[] args){
      //variables
    int m=0,i;
    //Arreglos
    int n[]=new int[5];
    //entrada
    Scanner te=new Scanner(System.in);
    System.out.print("Numero 1:");
    n[0]=te.nextInt();
    System.out.print("Numero 2:");
    n[1]=te.nextInt();
    System.out.print("Numero 3:");
    n[2]=te.nextInt();
    System.out.print("Numero 4:");
    n[3]=te.nextInt();
    System.out.print("Numero 5:");
    n[4]=te.nextInt();
    //proceso
    for(i=0; i<=4; i++){
        if(n[i]>m)
            m=n[i];
    }
    //salida
        System.out.println("");
        System.out.println("el Mayor es :"+m);
}
}