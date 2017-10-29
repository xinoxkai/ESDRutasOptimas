
package tareadeestructuradedatos;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class CaminosMinimos {
  //atributos  de la clase
    private Aeropuerto a;

    String ruta = " ";
    double pesos[][];
    int n;
    double d[][];
    int traza[][];
    ArrayList<Integer> aerolista = new ArrayList<Integer>();
    DecimalFormat precision = new DecimalFormat("0.00");

    
   
    public CaminosMinimos() {
       //Metodo para inicializa los datos de la matriz
        a = new Aeropuerto();
        n = a.getNumVerts();
        pesos = a.getMatPesos();
        d = new double[n][n];
        traza = new int[n][n];
    }

    public void AlgoritmoFloyd() {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = pesos[i][j]; //se copia la matriz de pesos en d[][]
                traza[i][j] = -1; // se inicializa la matriz traza a -1
            }
        }
        
     // Se le asigna valor 0 a la diagonal de la matriz 
        for (int i = 0; i < n; i++) {
            d[i][i] = 0;
        }
        //este es la escencia el algoritmo aca se recorre la matriz 
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((d[i][k] + d[k][j]) < d[i][j]) // nuevo mínimo
                    {
                        d[i][j] = d[i][k] + d[k][j];  //el valor de nuevo minimo se guarda en d[i][j]
                        traza[i][j] = k; //se guarda el indice del aeropuerto que logro que se hiciera la mejora
                        //osea que al agregar el aeropuerto k se logro que el camino de i a j mejorara por lo tanto 
                        //lo guardamos en traza[i][j]

                    }

                }
            }
        }
 
    }

    
    /*  el metodo :
        - algoritmoFloyd
        - recupera
           han sido extraidos del libro 
        Estructura de datos en java Joyanes 1 edicion 
    */
    //metodo recursivo para recuperar el camino minimo
    public String recupera(int i, int j) {

        int k = traza[i][j];
   
        if (k != -1) {

            recupera(i, k);

            aerolista.add(k);
            ruta = ruta + a.getNombre(k + 1) + "\n";
            recupera(k, j);
        }
        //al final retornamos la ruta 
        return ruta;
    }
    
    //metodo para obtener el numero de nodos que forman la solucion optima
    //este luego sera util para unir las aristas
    public int size(){
        return aerolista.size();
    }

    public String camino(int i, int j) {
        
        ruta="";
        aerolista.add(i);
        String cad = recupera(i, j);
        aerolista.add(j);
        String cad2=null;//para retornar el camino
        //System.out.println("De " + a.getNombre(i + 1) + " a " + a.getNombre(j + 1) + "\n-----RUTA------\n\n");
       cad2 = "\tORIGEN \n " + a.getNombre(i + 1) + "\n ESCALAS\n" + cad + "\n" + "\tDESTINO " + a.getNombre(j + 1);

        double distancia;
        distancia = distanciaMinima(i, j);

        return  cad2 + "\n\nDistancia  " + precision.format(distancia) + " KM\n\nSOLO ES UNA RECOMENDACION USTED DECIDE!!!";

    }

    public void addAero(Integer n) {
        aerolista.add(n);

    }

    //M etodo para obtener le distancia a recorrer
    public double distanciaMinima(int origen, int destino) {

        double distancia = d[origen][destino];
        // System.out.println("aqui " + d[origen][destino]);
        return distancia;
    }

    //para mostrar los puntos intermedios
    //con este metodo podemos imprimir los puntos de la lista
    public void imprimirPuntos() {
      
        String numero = new String();
        for (Integer pivote : aerolista) {
            numero = numero + pivote.toString();
        }
        System.out.println(" - --" + numero + "- - --");
    }
    
  

}
