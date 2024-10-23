import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        Figura figura = null;

        System.out.println("Selecciona una fig geometrica para calcular su ares");
        System.out.println("1 - Cuadrado");
        System.out.println("2 - Circulo");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Ingrese el lado del cuadro: ");
                double lado = scanner.nextDouble();
                System.out.println("Ingrese la coordenada x del cuadrado: ");
                int xCuadrado = scanner.nextInt();
                System.out.println("Ingrese la coordenada y del cuadrado: ");
                int yCuadrado = scanner.nextInt();
                figura = new Cuadrado(lado, xCuadrado, yCuadrado);

                break;

            case 2:
                System.out.println("Ingrese el radio del Circulo: ");
                double radio = scanner.nextDouble();
                System.out.println("Ingrese la coordenada x del cuadrado: ");
                int xCirculo = scanner.nextInt();
                System.out.println("Ingrese la coordenada y del cuadrado: ");
                int yCirculo = scanner.nextInt();
                figura = new Circulo(xCirculo, yCirculo, radio);

                break;
            
            default:
                System.out.println("Opcion no es valida!");
                break;

        


        }

    if (figura != null){
        double area=figura.calcularArea();
        System.out.println("El area de la figura es:  "+ area);
    }
    scanner.close();

    }
}
