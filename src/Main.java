
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();

        int option = showOptionsMenuAndCaptureOption();
        while (option != 8) {

            switch (option) {
                case 1:
                    ReservarHotel(service);
                    break;
                case 2:
                    ReservarCitaMedica(service);
                    break;
                case 3:
                    ReservarMesaRest(service);
                    break;
                case 4:
                    OtraReserva(service);
                case 5:
                    buscarDocumentoHotel(service);
                    break;
                case 6:
                    buscarDocumentoCitaMedica(service);
                    break;
                case 7:
                    buscarDocumentoMesaRest(service);
                    break;
                case 8:
                    buscarDocumentoOtraReserva(service);
            }
            option = showOptionsMenuAndCaptureOption();
        }
    }

    private static void buscarDocumentoHotel(Service service) {
        System.out.println("Ingresa el documento de tu reserva de hotel");
        Scanner scanner = new Scanner(System.in);
        String documento = scanner.nextLine();
        Optional<ReservaHotel> reservaOptional = service.buscarDocumentoHotel(documento);
        if (reservaOptional.isPresent()) {
            System.out.println(reservaOptional.get());
        } else {
            System.out.println("el documento"  + documento + " no se ha encontrado");
        }
    }

    private static void buscarDocumentoCitaMedica(Service service) {
        System.out.println("Ingresa el documento de la reserva de tu cita medica  ");
        Scanner scanner = new Scanner(System.in);
        String documento = scanner.nextLine();
        Optional<ReservaCitaMedica> reservaOptional = service.buscarDocumentoCitaMedica(documento);
        if (reservaOptional.isPresent()) {
            System.out.println(reservaOptional.get());
        } else {
            System.out.println("el documento"  + documento + " no se ha encontrado");
        }
    }

    private static void buscarDocumentoMesaRest(Service service) {
        System.out.println("Ingresa el documento de tu reserva para la mesa de restaurante");
        Scanner scanner = new Scanner(System.in);
        String documento = scanner.nextLine();
        Optional<ReservaMesaRest> reservaOptional = service.buscarDocumentoMesaRest(documento);
        if (reservaOptional.isPresent()) {
            System.out.println(reservaOptional.get());
        } else {
            System.out.println("el documento"  + documento + " no se ha encontrado");
        }
    }

    private static void buscarDocumentoOtraReserva(Service service) {
        System.out.println("Ingresa el documento para consultar tu otra reserva");
        Scanner scanner = new Scanner(System.in);
        String documento = scanner.nextLine();
        Optional<OtraReserva> reservaOptional = service.buscarDocumentoOtraReserva(documento);
        if (reservaOptional.isPresent()) {
            System.out.println(reservaOptional.get());
        } else {
            System.out.println("el documento"  + documento + " no se ha encontrado");
        }
    }


    private static void ReservarHotel(Service service) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu documento: ");
        String documento = scanner.nextLine();
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa tu numero celular");
        String celular = scanner.nextLine();
        System.out.println("Ingresa tu fecha de reservacion ");
        String fechaReserva = scanner.nextLine();
        System.out.println("Ingresa tu hora de reservacion");
        String horaReserva = scanner.nextLine();
        System.out.println("REGISTRO EXITOSO");
        ReservaHotel reservaHotel = new ReservaHotel(documento, nombre,celular,fechaReserva,horaReserva);
        service.reservaHotel(reservaHotel);
    }

    private static void ReservarCitaMedica(Service service) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu documento: ");
        String documento = scanner.nextLine();
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa tu numero celular");
        String celular = scanner.nextLine();
        System.out.println("Ingresa tu fecha de reservacion ");
        String fechaReserva = scanner.nextLine();
        System.out.println("Ingresa tu hora de reservacion");
        String horaReserva = scanner.nextLine();
        System.out.println("REGISTRO EXITOSO");
        ReservaCitaMedica reservaCitaMedica = new ReservaCitaMedica(documento, nombre,celular,fechaReserva,horaReserva);
        service.reservaCitaMedica(reservaCitaMedica);
    }
    private static void ReservarMesaRest(Service service) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu documento: ");
        String documento = scanner.nextLine();
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa tu numero celular");
        String celular = scanner.nextLine();
        System.out.println("Ingresa tu fecha de reservacion ");
        String fechaReserva = scanner.nextLine();
        System.out.println("Ingresa tu hora de reservacion");
        String horaReserva = scanner.nextLine();
        System.out.println("REGISTRO EXITOSO");
        ReservaMesaRest reservaMesaRest = new ReservaMesaRest(documento, nombre,celular,fechaReserva,horaReserva);
        service.reservaMesaRest(reservaMesaRest);
    }
    private static void OtraReserva(Service service) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu documento: ");
        String documento = scanner.nextLine();
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa tu numero celular");
        String celular = scanner.nextLine();
        System.out.println("Ingresa tu fecha de reservacion ");
        String fechaReserva = scanner.nextLine();
        System.out.println("Ingresa tu hora de reservacion");
        String horaReserva = scanner.nextLine();
        System.out.println("REGISTRO EXITOSO");
        OtraReserva otraReserva= new OtraReserva(documento, nombre,celular,fechaReserva,horaReserva);
        service.otraReserva(otraReserva);
    }


    private static int showOptionsMenuAndCaptureOption() {
        System.out.println("*----------------------------------------------*");
        System.out.println("| BIENVENIDO QUE TIPO DE RESERVACION DESEA HACER:  |");
        System.out.println("| 1. Reservar un hotel                         |");
        System.out.println("| 2. Reservar una cita medica                  |");
        System.out.println("| 3. Reservar una mesa en un restaurante       |");
        System.out.println("| 4. Otro tipo de reserva                      |");
        System.out.println("| 5. Buscar reserva de hotel                   |");
        System.out.println("| 6. Buscar reserva de cita medica             |");
        System.out.println("| 7. Buscar reserva de mesa de restaurante     |");
        System.out.println("| 8. Buscar otra reserva                       |");
        System.out.println("| 9. Salir                                     |");
        System.out.println("*----------------------------------------------*");
        Scanner scanner = new Scanner(System.in);
        int option = 9;
        try {
            option = scanner.nextInt();
            if (option < 1 || option > 9) {
                System.out.println("| La opcion seleccionada no es valida |");
                showOptionsMenuAndCaptureOption();
            }
        } catch (Exception e) {
            System.out.println("| La opcion seleccionada no es valida vuelva a intentarlo |");
            showOptionsMenuAndCaptureOption();
        }
        return option;
    }
}


