public class Main {
    public static void main(String[] args) {
    	Bebek duck = new BebekKwek();
        Kucing milo = new KucingMeow();

        // membungkus kucing di dalam sebuah MeowAdapter sehingga bisa berperilaku seperti bebek KW
        Bebek meowAdapter = new MeowAdapter(milo);

        System.out.println("suara bebek duck:");
        duck.kwek();
        System.out.println();

        System.out.println("suara kucing milo:");
        milo.meow();
        System.out.println();

        // bebek KW bersuara seperti kucing
        System.out.println("Suara bebek KW jaman now seperti kucing :");
        meowAdapter.kwek();
    }
}
