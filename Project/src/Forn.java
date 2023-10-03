public class Forn extends Electrodomestic {
    private int temperatura;
    private String autoneteja;

    public Forn() {}

    public Forn(Forn target) {
        super(target);
        if (target != null) {
            this.temperatura = target.temperatura;
            this.autoneteja = target.autoneteja;
        }
    }

    @Override
    public Electrodomestic clone() {
        return new Forn(this);
    }
    
}
