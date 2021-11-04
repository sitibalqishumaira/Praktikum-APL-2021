public class Main {
    public static void main(String[] args) {
        Kucing milo = new KucingMeow();

        // bebek KW bersuara seperti kucing
        Bebek meowAdapter = new MeowAdapter(milo);
        System.out.println("Suara bebek KW jaman now :");
        meowAdapter.kwek();
    }
}
