public class Main {

    public static void main(String[] args) {
        Complejidad c = new Complejidad();
        int ejecuciones = 20;
        int resultados[][] = new int[ejecuciones][20];
  /*
        for (int renglon=0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 1;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.lineal(n);
        }
        imprimir(resultados);
*/
        for (int renglon=0; renglon <= 3; renglon++) {
            int n = (renglon + 1) * 1;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.cuadratica(n);
        }
        imprimir(resultados);
        /*
        for (int renglon=0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 100;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.log(n);
        }
        imprimir(resultados);
        */

    }


    private static void imprimir(int[][] resultado) {
        int impresion[][] = new int[20][20];
        for (int renglon = 0; renglon < resultado.length; renglon++) {
            int aux = 0;
            for (int veces = 0; veces < resultado[renglon][1] ; veces++) {
                impresion[renglon][aux] = 1;
                aux++;
            }
        }

        for (int i = 19; i >= 0; i--) {
            for(int j = 0; j < 20; j++){
                System.out.print(" ");
                if(impresion[j][i] == 0){
                    System.out.print(" ");
                }
                if(impresion[j][i]==1){
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

}

/*
    private static void imprimir(int [][] resultado){
        for (int renglon = 0; renglon < resultado.length ; renglon++){
            for(int veces = 0; veces < resultado[renglon][1]; veces++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
*/

