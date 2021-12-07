import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String args[]) {
        System.out.println("==============================\n Welcome to Planet Sport Shop\n==============================");
        System.out.println("Our Best Seller Ball Product :");

        BallWeightInfo basketBall = new BasketBall();
        BallWeightInfoAdapter basketBallWeightAdapter = new BallWeightInfoAdapterImpl(basketBall);
        System.out.println("1. BASKET BALL\nHarga : Rp200.000\nBerat Bola Basket dalam gram : 580 g");
        System.out.println("Hasil konversi berat Bola Basket dalam kilogram : " + basketBallWeightAdapter.getWeight() + " kg");
        System.out.println();

        BallWeightInfo tennisBall = new TennisBall();
        BallWeightInfoAdapter tennisBallWeightAdapter = new BallWeightInfoAdapterImpl(tennisBall);
        System.out.println("2. TENNIS BALL\nHarga : Rp7.000\nBerat Bola Tennis dalam gram : 56 g");
        System.out.println("Hasil konversi berat Bola Tennis dalam kilogram : " + tennisBallWeightAdapter.getWeight() + " kg");
        System.out.println();

        BallWeightInfo volleyBall = new VolleyBall();
        BallWeightInfoAdapter volleyBallWeightAdapter = new BallWeightInfoAdapterImpl(volleyBall);
        System.out.println("3. VOLLEY BALL\nHarga : Rp160.000\nBerat Bola Voli dalam gram : 260 g");
        System.out.println("Hasil konversi berat Bola Voli dalam kilogram : " + volleyBallWeightAdapter.getWeight() + " kg");
        System.out.println();

        // user diminta untuk menginput angka untuk memilih jenis bola yang ingin dipesan
        System.out.println("Silahkan masukkan nomor bola pesanan Anda (1, 2, atau 3): ");
        scanner = new Scanner(System.in);
        String ballType = scanner.next();
        // menampilkan jenis bola yang dipesan oleh user sebagai validasi
        System.out.println("Bola pesanan anda adalah : ");
        if("1".equalsIgnoreCase(ballType)) {
           System.out.println("BASKET BALL");
        }
        else if("2".equalsIgnoreCase(ballType)) {
           System.out.println("TENNIS BALL");
        }
        else if("3".equalsIgnoreCase(ballType)) {
           System.out.println("VOLLEY BALL");
        }
        else {
            System.out.println("Maaf, nomor bola pesanan Anda tidak valid.");
        }
        System.out.println();

        // user diminta untuk menginput nama jasa ekspedisi untuk pengiriman bola
        System.out.println("Silahkan masukkan Ekspedisi Pengiriman pilihan anda ('JNE', 'JNT', atau 'SiCepat') : ");
        scanner = new Scanner(System.in);
        String expeditionType = scanner.next();

        Customer customer = null;
        customer = new Customer();
        if("JNE".equalsIgnoreCase(expeditionType)) {
           customer.setShippingStrategy(new JNE());
        }
        else if("JNT".equalsIgnoreCase(expeditionType)) {
           customer.setShippingStrategy(new JNT());
        }
        else if("SiCepat".equalsIgnoreCase(expeditionType)) {
           customer.setShippingStrategy(new SiCepat());
        }
        else {
            System.out.println("Maaf, Ekpedisi tidak tersedia.");
        }
        customer.selectExpedition();
        System.out.println();
        System.out.println("Terima kasih telah berbelanja di Planet Sport Shop!^^");
    }
}
