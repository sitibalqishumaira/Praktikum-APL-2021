public class MeowAdapter implements Bebek {
    Kucing kitty;

    public MeowAdapter(Kucing kitty) {
        this.kitty = kitty;
    }

    @Override
    public void kwek() {
        kitty.meow();
    }
}
