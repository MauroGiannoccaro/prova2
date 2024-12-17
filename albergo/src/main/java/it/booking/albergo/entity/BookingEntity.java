package it.booking.albergo.entity;

import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookingEntity {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrenotazione;
  
    @Column(nullable = false)
    private OffsetDateTime dateCheckIn;

    @Column(nullable = false)
    private OffsetDateTime dateCheckOut;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = -8441053830L;


    public Long getIdPrenotazione() {
        return this.idPrenotazione;
    }

    public void setIdPrenotazione(Long idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }

    public OffsetDateTime getDateCheckIn() {
        return this.dateCheckIn;
    }

    public void setDateCheckIn(OffsetDateTime dateCheckIn) {
        this.dateCheckIn = dateCheckIn;
    }

    public OffsetDateTime getDateCheckOut() {
        return this.dateCheckOut;
    }

    public void setDateCheckOut(OffsetDateTime dateCheckOut) {
        this.dateCheckOut = dateCheckOut;
    }

}
