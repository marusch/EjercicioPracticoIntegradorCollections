package entidades;

import java.util.Scanner;

public class Menu {

    ServicioSerie serie = new ServicioSerie();
    String termina = "";
    int opcion;
    Scanner input = new Scanner(System.in).useDelimiter("\n");


    public void menu(){
        do {
            System.out.println("\nSeleccione una opcion para continuar " + "\n" +
                    "- 1.Añadir una serie a la lista de disponibilidad  " + "\n" +
                    "- 2.Lista de todas las series disponibles" + "\n" +
                    "- 3.Lista de todas las series menores a 15 minutos" + "\n" +
                    "- 4.Lista de todas las series mayores a 40 minutos" + "\n" +
                    "- 5.Lista de todas las series categorizado como '💕 ROMANCE 💕' " + "\n" +
                    "- 6.Lista de todas las series categorizado como '📌 DRAMA 📌' " + "\n" +
                    "- 7.Lista de todas las series categorizado como '😂 COMEDIA 😂' " + "\n" +
                    "- 8.Finalizar el proceso. " + "\n" +
                    "Seleccion: "


            );
            opcion = input.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Añadir una serie a la lista");
                    serie.CrearSerie();

                    System.out.println("¡Gracias! Su serie fue añadida con exito. Para volver al menu presione S," +
                            " de lo contrario, cualquier tecla para salir");
                    termina= input.next();

                    break;

                case 2:


                    serie.verLista();

                    System.out.println("Para volver al menu presione S, de lo contrario cualquier tecla para salir");
                    termina= input.next();

                    break;

                case 3:

                   serie.menor15();

                    System.out.println("Para volver al menu presione S, de lo contrario cualquier tecla para salir");
                    termina= input.next();

                    break;

                case 4:

                    serie.mayor40();

                    System.out.println("Para volver al menu presione S, de lo contrario cualquier tecla para salir");
                    termina= input.next();

                    break;

                case 5:

                    serie.categoriaRomance();

                    System.out.println("Para volver al menu presione S, de lo contrario cualquier tecla para salir");
                    termina= input.next();

                    break;

                case 6:

                   serie.categoriaDrama();

                    System.out.println("Para volver al menu presione S, de lo contrario cualquier tecla para salir");
                    termina= input.next();

                    break;
                case 7:

                    serie.categoriaComedia();

                    System.out.println("Para volver al menu presione S, de lo contrario cualquier tecla para salir");
                    termina= input.next();

                    break;

                case 8:


                    System.out.println("Has finalizado el proceso");
                     termina = input.next();
                  break;
            }
        }while (termina.equalsIgnoreCase("S"));

    }

}
