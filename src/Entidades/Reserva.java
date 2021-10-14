package Entidades;

import excepetions.DomainException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author afrancelino
 */
public class Reserva {

    
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Reserva() {
    }

    public Reserva(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
          if(!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }
    
    //calcula a duracao em dias 
    public long duration (){
        long dif = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS); // Converte em milisegundos a diferenca entre checkIn e checkOut
    }
    
    public void updateDates(Date checkIn, Date checkOut) throws DomainException{
        
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Reservation dates fot update must be future dates");
        }
        if(!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room" 
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", checkOut: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nigths";
    }
}
