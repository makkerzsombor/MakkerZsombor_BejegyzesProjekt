package Bejegyzes;

import java.time.LocalDateTime;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private Integer likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();

    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public Integer getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    //methods
    public void setTartalom(String tartalom){
        this.szerkesztve = LocalDateTime.now();
        this.tartalom = tartalom;
    }

    public void like(){
        this.likeok++;
    }

    @Override
    public String toString() {
        return "\n" + this.szerzo+" - "+ this.likeok +" - "+this.letrejott +"" +
                "\n Szerkesztve: "+ this.szerkesztve + "" +
                "\n " + this.tartalom;
    }
}
