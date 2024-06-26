package model;

public class ChitaraAcustica extends Chitara{
    private String forma;

    public ChitaraAcustica(String denumire, float pret, String conditie, int stoc, String culoare,String forma)
    {
        super(denumire, pret, conditie, stoc, culoare);
        this.forma=forma;
    }

    public ChitaraAcustica() {
        super();
    }

    private void play()
    {
        System.out.println("Poti canta folk, country, bluegrass ♫ ♬");
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "ChitaraAcustica{" +
                "forma='" + forma + '\'' +
                "culoare='" + getCuloare() + '\'' +
                "denumire='" + getDenumire() + '\'' +
                ", pret=" + getPret() +
                ", conditie='" + getConditie() + '\'' +
                ", stoc=" + getStoc() +
                ", rating=" + getRating() +
                ", nrReviewuri=" + getNrReviewuri() +
                '}';
    }
}
