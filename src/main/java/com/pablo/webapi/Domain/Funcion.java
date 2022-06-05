package com.pablo.webapi.Domain;
import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "funciones")
public class Funcion {
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "funcion_id")
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Temporal(TemporalType.TIME)
    private Date horario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    @ManyToOne
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    @OneToMany(cascade = CascadeType.REMOVE,mappedBy = "funcion")
    private Collection<Ticket> tickets;
}
