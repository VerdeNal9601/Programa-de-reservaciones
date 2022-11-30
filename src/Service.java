import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Service {

    List<ReservaHotel> hotelList = new ArrayList<>();
    List<ReservaCitaMedica> citaMedicaList = new ArrayList<>();
    List<ReservaMesaRest> mesaRestauranteList = new ArrayList<>();
    List<OtraReserva> otraReservaList = new ArrayList<>();


    public void reservaHotel(ReservaHotel reservaHotel) {
        if (!hotelList.contains(reservaHotel)) {
            hotelList.add(reservaHotel);
        }
    }

    public Optional<ReservaHotel> buscarDocumentoHotel(String documento) {
        return hotelList.stream()
                .filter(reservaHotel -> reservaHotel.getDocumento().equals(documento))
                .findAny();
    }

    public void reservaCitaMedica(ReservaCitaMedica reservaCitaMedica) {
        if (!citaMedicaList.contains(reservaCitaMedica)) {
            citaMedicaList.add(reservaCitaMedica);
        }
    }

    public Optional<ReservaCitaMedica> buscarDocumentoCitaMedica(String documento) {
        return citaMedicaList.stream()
                .filter(reservaCitaMedica -> reservaCitaMedica.getDocumento().equals(documento))
                .findAny();
    }
    public void reservaMesaRest(ReservaMesaRest reservaMesaRest) {
        if (!mesaRestauranteList.contains(reservaMesaRest)) {
            mesaRestauranteList.add(reservaMesaRest);
        }
    }

    public Optional<ReservaMesaRest> buscarDocumentoMesaRest(String documento) {
        return mesaRestauranteList.stream()
                .filter(reservaMesaRest -> reservaMesaRest.getDocumento().equals(documento))
                .findAny();
    }

    public void otraReserva(OtraReserva otraReserva) {
        if (!otraReservaList.contains(otraReserva)) {
            otraReservaList.add(otraReserva);
        }
    }

    public Optional<OtraReserva> buscarDocumentoOtraReserva(String documento) {
        return otraReservaList.stream()
                .filter(otraReserva -> otraReserva.getDocumento().equals(documento))
                .findAny();
    }
}
