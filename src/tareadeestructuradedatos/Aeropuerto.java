/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareadeestructuradedatos;


/**
 *
 * @author Roberto
 */
public class Aeropuerto {
    int card=23;
    private String nombre [] = new String[card];
    private int coordenadas[][]=new int[23][2];;
    private double[][] matPesos;
    private int numVerts;
    
    //en este consructor inicializamos la lista de aeropuertos y las coordenadas de cada uno
    Aeropuerto(){
        double[][] mat = {{0, 1742.33, 3929.31, 3970.87, 5024.28, 999999999, 999999999, 999999999, 999999999, 999999999, 8424.48, 7923.62, 8057.3, 999999999, 999999999, 999999999, 7566.52, 10278.05, 999999999, 999999999, 11370.82, 12523.1},
    {1742.33, 0, 3978.79, 2498.46, 3706.59, 5607.23, 999999999, 999999999, 999999999, 10219.14, 999999999, 9112.95, 9331.41, 999999999, 999999999, 999999999, 8822.48, 11677.39, 999999999, 999999999, 10488.7, 12074.35},
    {3929.31, 3978.79, 0, 3373.7, 3355.08, 4001.32, 8543.77, 7738.65, 8253.86, 6885.75, 5767.54, 5840.02, 6199.91, 999999999, 999999999, 999999999, 10887.54, 12984.81, 999999999, 999999999, 999999999, 999999999},
    {3970.87, 2498.46, 3373.7, 0, 1235.34, 3168.57, 999999999, 999999999, 999999999, 999999999, 9081.37, 9213.68, 9570.35, 999999999, 999999999, 999999999, 11320.86, 999999999, 999999999, 999999999, 999999999, 999999999},
    {5024.28, 3706.59, 3355.08, 1235.34, 0, 1934.1, 999999999, 999999999, 999999999, 999999999, 8671.04, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999},
    {999999999, 5607.23, 4001.32, 3168.57, 1934.1, 0, 999999999, 4546.14, 4262.27, 999999999, 8039.97, 9105.55, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999},
    {999999999, 999999999, 8543.77, 7408.52, 999999999, 4692.91, 0, 1997.55, 1127.7, 11190.5, 10096.6, 11111.89, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999},
    {999999999, 999999999, 7738.65, 999999999, 999999999, 4546.14, 1997.55, 0, 2929.06, 999999999, 8156.35, 9194.3, 9590.92, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999},
    {999999999, 999999999, 8253.86, 6617.5, 999999999, 4262.27, 1127.7, 2929.06, 0, 999999999, 10727.69, 11683.29, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 9680.87, 999999999},
    {999999999, 999999999, 6885.75, 999999999, 999999999, 999999999, 11190.5, 999999999, 11923.55, 0, 1352.88, 1106.99, 959.8, 2134.83, 2002.16, 999999999, 999999999, 9269.83, 999999999, 5917.38, 999999999, 999999999},
    {999999999, 999999999, 5767.54, 9081.37, 999999999, 8039.97, 10096.6, 8156.35, 10727.69, 1352.88, 0, 1064.31, 1434.59, 3344.13, 869.24, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999},
    {999999999, 999999999, 5840.02, 9213.68, 999999999, 999999999, 11111.89, 9194.3, 999999999, 1106.99, 1064.31, 0, 459.43, 3209.83, 1933.52, 8746.64, 9718.36, 9601.4, 999999999, 999999999, 999999999, 999999999},
    {8057.3, 9331.41, 6199.91, 9570.35, 999999999, 9105.55, 11526.38, 9590.92, 999999999, 959.8, 1434.59, 459.43, 0, 2922.63, 2291.62, 8705.12, 9359.88, 9152.94, 8976.55, 999999999, 999999999, 999999999},
    {999999999, 12232.36, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 2134.83, 3344.13, 3209.83, 2922.63, 0, 999999999, 6262.19, 999999999, 999999999, 999999999, 4425.41, 999999999, 999999999},
    {999999999, 999999999, 5802.31, 999999999, 999999999, 999999999, 999999999, 7308.49, 999999999, 2002.16, 869.24, 1933.52, 2291.62, 3673.77, 0, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999},
    {999999999, 999999999, 12845.12, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 8746.64, 8705.12, 6262.19, 999999999, 0, 999999999, 10687.2, 8987.81, 999999999, 999999999, 11037.04},
    {7566.52, 8822.48, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 9718.36, 9359.88, 999999999, 999999999, 999999999, 0, 2905.4, 4609.76, 999999999, 999999999, 7825.89},
    {10278.05, 11677.39, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 9269.83, 999999999, 9601.4, 9152.94, 999999999, 999999999, 10687.2, 2905.4, 0, 1708.02, 999999999, 9167.72, 7401.21},
    {999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 8838.6, 999999999, 9435.43, 8976.55, 999999999, 999999999, 999999999, 4609.76, 1708.02, 0, 2925.41, 999999999, 7546.93},
    {999999999, 999999999, 11768.42, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 6573.48, 6119.46, 999999999, 999999999, 999999999, 5867.13, 3751.23, 2925.41, 0, 999999999, 999999999},
    {11370.82, 10488.7, 999999999, 999999999, 999999999, 999999999, 10339.46, 999999999, 9680.87, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 8833.47, 9167.72, 9583.26, 999999999, 0, 2159.23},
    {12523.1, 12074.35, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 11037.04, 7825.89, 7401.21, 7546.93, 999999999, 2159.23, 0}};
              
        matPesos = mat;
         nombre[0]="Lista de Aeropuertos";
         nombre[1] = "Aeropuerto Internacional de vancouver(Vancouver, Canadá)";
         nombre[2] = "Aeropuerto Internacional de Los Ángeles (Los Ángeles, Estados Unidos";
         nombre[3] = "Aeropuerto Internacional John F.Kennedy (Nueva York, Estados Unidos)";
         nombre[4] = "Aeropuerto Internacional de la Ciudad de México (Ciudad de México, México)";
         nombre[5] = "Aeropuerto Internacional de El Salvador (San Salvador, El Salvador)";
         nombre[6] = "Aeropuerto Internacional El Dorado (Bogotá, Colombia)";
         nombre[7] = "Aeropuerto Internacional Ministro Pistarini  (Buenos Aires, Argentina)";
         nombre[8] = "Aeropuerto Internacional de Galeão (Río de Janeiro, Brasil)";
         nombre[9] = "Aeropuerto Internacional Comodoro Arturo Merino Bení­tez (Santiago de Chile, Chile)";
         nombre[10] = "Aeropuerto de Roma-Fiumicino (Roma, Italia)";
         nombre[11] = "Aeropuerto Adolfo Suárez Madrid-Barajas (Madrid, España)";
         nombre[12] = "Aeropuerto de París Charles de Gaulle (París, Francia)";
         nombre[13] = "Aeropuerto de Frankfurt (Frankfurt, Alemania)";
         nombre[14] = "Aeropuerto Internacional de El Cairo (El Cairo, Egipto)";
         nombre[15] = "Aeropuerto Internacional Mohámmed V (Casablanca, Marruecos)";
         nombre[16]  ="Aeropuerto de Johannesburgo (Johannesburgo, Sudáfrica)";
         nombre[17] = "Aeropuerto Internacional de Tokio (Tokio, Japón)";
         nombre[18] = "Aeropuerto Internacional de Hong Kong (Hong Kong, China)";
         nombre[19] = "Aeropuerto Internacional de Bangkok (Bangkok, Tailandia)";
         nombre[20] = "Aeropuerto Internacional Indira Gandhi (India)";
         nombre[21] = "Aeropuerto Internacional de Auckland (Auckland, Nueva Zelanda)";
         nombre[22]  = "Aeropuerto de Sídney (Sidney, Australia)";
         
         coordenadas[1][0]=147;coordenadas[1][1]=108;
         coordenadas[2][0]=158;coordenadas[2][1]=149;
         coordenadas[3][0]=256;coordenadas[3][1]=137;
         coordenadas[4][0]=202;coordenadas[4][1]=185;
         coordenadas[5][0]=237;coordenadas[5][1]=211;
         coordenadas[6][0]=272;coordenadas[6][1]=235;
         coordenadas[7][0]=304;coordenadas[7][1]=342;
         coordenadas[8][0]=347;coordenadas[8][1]=298;
         coordenadas[9][0]=280;coordenadas[9][1]=335;
         coordenadas[10][0]=499;coordenadas[10][1]=134;
         coordenadas[11][0]=451;coordenadas[11][1]=138;
         coordenadas[12][0]=465;coordenadas[12][1]=113;
         coordenadas[13][0]=488;coordenadas[13][1]=104;
         coordenadas[14][0]=538;coordenadas[14][1]=171;
         coordenadas[15][0]=442;coordenadas[15][1]=161;
         coordenadas[16][0]=529;coordenadas[16][1]=320;
         coordenadas[17][0]=816;coordenadas[17][1]=145;
         coordenadas[18][0]=755;coordenadas[18][1]=178;
         coordenadas[19][0]=721;coordenadas[19][1]=208;
         coordenadas[20][0]=650;coordenadas[20][1]=169;
         coordenadas[21][0]=911;coordenadas[21][1]=355;
         coordenadas[22][0]=839;coordenadas[22][1]=338;

    }
    
    
 

    public String[] getNombre() {
        return nombre;
    }
    
    public String getNombre(int card){
        return nombre[card];
    }
 
    public int getCardinal(){
        return card;
    }

    public double[][] getMatPesos() {
        return matPesos;
    }

    public void setMatPesos(double[][] matPesos) {
        this.matPesos = matPesos;
    }

    public int getNumVerts() {
        numVerts = matPesos.length;
        return numVerts;
    }

    public void setNumVerts(int numVerts) {
        this.numVerts = numVerts;
    }
    
    public int getCoordenadasSize(){
        int j=coordenadas.length;
        return j;
    }
    
    public int getCoordenada(int j, int k){
        return coordenadas[j][k];
    }
    
    
    
    
}

    
    
