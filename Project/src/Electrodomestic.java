public abstract class Electrodomestic {
    private String nom;
    private String color;
    private int preu;
    private String marca;
    private String eficiencia;

    public Electrodomestic() {}

    public Electrodomestic(Electrodomestic target) {
        if (target != null) {
            this.nom = target.nom;
            this.color = target.color;
            this.preu = target.preu;
            this.marca = target.marca;
            this.eficiencia = target.eficiencia;
        }
    }

    public abstract Electrodomestic clone(); 

}
