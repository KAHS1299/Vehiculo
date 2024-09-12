import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Karen Audrey Hoya Salinas
//Clase de Vehiculo
//12-09.2024

public class Main {
    public static void main(String[] args) {
        List<Vehiculo>listaVehiculos=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Menu");
            System.out.println("1.Agregar");
            System.out.println("2.Mostrar");
            System.out.println("3.Buscar");
            System.out.println("3.Salir");
            int opcion= scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese la placa: ");
                    String placa = scanner.next();

                    System.out.println("Ingrese la marca: ");
                    String marca = scanner.next();

                    System.out.println("Ingrese el modelo: ");
                    String modelo = scanner.next();

                    System.out.println("Ingrese el tipo: ");
                    String tipo = scanner.next();

                    System.out.println("Ingrese el color: ");
                    String color = scanner.next();

                    listaVehiculos.add(new Vehiculo(placa, marca, modelo, tipo, color));

                    break;
                case 2:
                    for (Vehiculo vehiculo:listaVehiculos){
                        System.out.println("--------------------------");
                        System.out.println("LOS DATOS DEL VEHICULO SON:");
                        System.out.println("Placa: "+vehiculo.getPlaca());
                        System.out.println("Marca: "+vehiculo.getMarca());
                        System.out.println("Modelo: "+vehiculo.getModelo());
                        System.out.println("Tipo: "+vehiculo.getTipo());
                        System.out.println("Color: "+vehiculo.getColor());

                    }
                    System.out.println("-------------------------");
                    break;
                case 3:
                    System.out.println("Ingrese la placa a buscar: ");
                    String placaBuscar=scanner.next();
                    boolean encontrado=false;
                    for (Vehiculo vehiculo:listaVehiculos){
                    if (vehiculo.getPlaca().equals(placaBuscar)) {
                        System.out.println("VEHICULO ENCONTRADO");
                        System.out.println("Placa: " + vehiculo.getPlaca());
                        System.out.println("Modelo: " + vehiculo.getModelo());
                        System.out.println("Marca: " + vehiculo.getMarca());
                        System.out.println("Tipo: " + vehiculo.getTipo());
                        System.out.println("Color: " + vehiculo.getColor());
                        encontrado=true;
                        break;
                    }
                    }
                    if (!encontrado){
                        System.out.println("-----------------------");
                        System.out.println("VEHICULO NO ENCONTRADO");
                        System.out.println("-----------------------");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo.....");
                    return;
                default:
                    System.out.println("Opcion Invalida");
            }
        }
    }
}
