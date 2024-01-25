package it_epicode.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "partita")
public class PartitaCalcio extends Evento{
    private String squadra_di_casa;
    private String squadra_ospite;

    private String squadra_vincente;

    @Column(name = "gol_squadra_di_casa")
    private int gol_squadra_di_casa;

    @Column(name = "gol_squadra_di_Ospite")
    private int gol_squadra_di_Ospite;

    public PartitaCalcio() {
    }

    public PartitaCalcio(String squadra_di_casa, String squadra_ospite, String squadra_vincente, int gol_squadra_di_casa, int gol_squadra_di_Ospite) {
        this.squadra_di_casa = squadra_di_casa;
        this.squadra_ospite = squadra_ospite;
        this.squadra_vincente = squadra_vincente;
        this.gol_squadra_di_casa = gol_squadra_di_casa;
        this.gol_squadra_di_Ospite = gol_squadra_di_Ospite;
    }

    public String getSquadra_di_casa() {
        return squadra_di_casa;
    }

    public String getSquadra_ospite() {
        return squadra_ospite;
    }

    public String getSquadra_vincente() {
        return squadra_vincente;
    }

    public int getGol_squadra_di_casa() {
        return gol_squadra_di_casa;
    }

    public int getGol_squadra_di_Ospite() {
        return gol_squadra_di_Ospite;
    }

    public void setSquadra_di_casa(String squadra_di_casa) {
        this.squadra_di_casa = squadra_di_casa;
    }

    public void setSquadra_ospite(String squadra_ospite) {
        this.squadra_ospite = squadra_ospite;
    }

    public void setSquadra_vincente(String squadra_vincente) {
        this.squadra_vincente = squadra_vincente;
    }

    public void setGol_squadra_di_casa(int gol_squadra_di_casa) {
        this.gol_squadra_di_casa = gol_squadra_di_casa;
    }

    public void setGol_squadra_di_Ospite(int gol_squadra_di_Ospite) {
        this.gol_squadra_di_Ospite = gol_squadra_di_Ospite;
    }

    @Override
    public String toString() {
        return "PartitaCalcio{" +
                "squadra_di_casa='" + squadra_di_casa + '\'' +
                ", squadra_ospite='" + squadra_ospite + '\'' +
                ", squadra_vincente='" + squadra_vincente + '\'' +
                ", gol_squadra_di_casa=" + gol_squadra_di_casa +
                ", gol_squadra_di_Ospite=" + gol_squadra_di_Ospite +
                '}';
    }
}
