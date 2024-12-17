package it.booking.albergo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nomeOspite;
    @Column(nullable = false)
    private String cognomeOspite;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String numeroTelefono;
    @Column(nullable = false)
    private Integer idPrenotazione;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeOspite() {
        return this.nomeOspite;
    }

    public void setNomeOspite(String nomeOspite) {
        this.nomeOspite = nomeOspite;
    }

    public String getCognomeOspite() {
        return this.cognomeOspite;
    }

    public void setCognomeOspite(String cognomeOspite) {
        this.cognomeOspite = cognomeOspite;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Integer getIdPrenotazione() {
        return this.idPrenotazione;
    }

    public void setIdPrenotazione(Integer idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }
    private static final long serialVersionUID = 7018474761L;

}
