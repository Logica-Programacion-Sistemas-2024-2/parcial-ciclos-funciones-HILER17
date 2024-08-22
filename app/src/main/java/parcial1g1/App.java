
package parcial1g1;

public class App {

public static void main(String[] args) {
        
        // Implementar la logica de solucion
        float distancia = 0f;
        int CantidadVehiculos = 0;
        float ConsumoTotal = 0f;
        float consumoVehiculo = 0f;
        float kmRecorrido = 0f;
        int contadorVehiculo= 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de vehiculos");
        CantidadVehiculos = sc.nextInt();


        for(int i = 1; i >= 1 && i <= CantidadVehiculos; i ++){

            System.out.println("Ingrese la distancia recorrida por el vhehiculo en metros: " + contadorVehiculo); 
            distancia = sc.nextInt();

            kmRecorrido = (distancia/1000);

            consumoVehiculo = calcularConsumoGasolina(kmRecorrido);

            contadorVehiculo = contadorVehiculo + 1;

            System.out.println("El consumo de combustible del vehiculo " + contadorVehiculo + " Es: " + consumoVehiculo + " Litros ");

            ConsumoTotal += consumoVehiculo;

            System.out.println("La distancia de el recorrido del vehiculo" + contadorVehiculo + " Es: " + kmRecorrido + " Kilometros ");
           
        }

        
        
        System.out.println("El consumo total de gasolina de los " + contadorVehiculo + " Vehiculo(s) " + ConsumoTotal + " Litros ");

              
    }

        /*  Implemente una funcion llamada calcularConsumoGasolina que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Un float representando los km recorridos
        * Retorna:
            - Un float representando los litros de gasolina consumidos
        */
        //------------------------------------------------------------------
        //Implemente la funcion en este espacio
        public static float calcularConsumoGasolina(float kmRecorrido){
        
        try {
            return ((kmRecorrido * 55) / 750);

          
        } catch (Exception e) {
            return -1;
        }
    
   
    }

}
