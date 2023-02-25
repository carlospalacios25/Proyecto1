package proyecto1;
public class Proyecto1 {
    /*
        1. A partir de un arreglo que posee N cantidad de promedios de estudiantes
        colocarlos en una lista y sacar el promedio global de todos los estudiantes. Se debe
        verificar que los elementos que están en la lista son correcto (rango de 0 a 5). 
        Imprimir todos los promedios y el promedio global.
     */
    public static void main(String[] args) {
        double[] promedios = {4, 5, 5, 3, 6.3, 5};
        double sumaPromedios = 0;
        double global = 0;
        boolean valido =true;

        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] > 5 || promedios[i] <0) {
                System.err.println("Error en la columna "+(i+1)+" el numero registrado supera el rango ");
                valido=false;
                return;
            } else {
                sumaPromedios +=promedios[i];
                global = sumaPromedios/promedios.length;
            }
        }

        for (double promedio:promedios){
            System.out.println(promedio);
        }

        System.out.println();
        if (valido==true){
            System.out.println("sumaPromedios = " + sumaPromedios);
            System.out.println("global = " + global);
        }
    } 
}
