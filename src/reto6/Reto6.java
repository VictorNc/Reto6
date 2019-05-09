package reto6;

public class Reto6 {

    public static void main(String[] args) {
        int [][] datos = {{111,192,289,415},{483,500,470,114},{471,355,474,161},{427,158,160,308}};
        int [][] datosmasaltos = {{0,0,0,0},{0,0,0,0}};
        
        String [] trimestre = {"Enero a Marzo", "Abril a Junio", "Julio a Septiembre", "Octubre a Diciembre"};

        for( int n = 0; n<datos.length; n++){
            for( int i = 0; i<datos.length; i++){
            if(datos[i][n]>datosmasaltos[0][n]){
            datosmasaltos[0][n] = datos[i][n];
            datosmasaltos[1][n] = i;
             }
            }
        } 
        System.out.println("El periodo donde el sabor chocolate se vendio más fue: " +trimestre[datosmasaltos[1][0]]);
        System.out.println("El periodo donde el sabopr vainilla se vendio más fue: " +trimestre[datosmasaltos[1][1]]);
        System.out.println("El periodo donde el sabor fresa de vendio más fue: " +trimestre[datosmasaltos[1][2]]);
        System.out.println("El periodo donde el sabor oreo se vendio más fue: " +trimestre[datosmasaltos[1][3]]);

            int[] totaltrimestres = {0,0,0,0,};
            int [][] trimestreconmasventa = {{0},{0}};
        
            for( int n = 0; n<datos.length; n++){
                for( int i = 0; i<datos.length; i++){
                    totaltrimestres[n] += datos [n][i];
                    }   
            } 
            for (int n = 0; n<datos.length; n++){
                if(totaltrimestres[n]>trimestreconmasventa[0][0]){
                    trimestreconmasventa[0][0] = totaltrimestres[n];
                    trimestreconmasventa [1][0] = n;
                    }
                }
                System.out.println("El trimestre que tuvo mayor venta de producto fue : "+trimestre[trimestreconmasventa[1][0]]);
            }
}


