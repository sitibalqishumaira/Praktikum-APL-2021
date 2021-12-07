/** class JNE sebagai Strategi konkret pertama yang mengimplements
 *	base strategy interfacenya yaitu Shipping Strategy
 */
class JNE implements ShippingStrategy {

	/** Method untuk memilih ekspedisi JNE oleh pelanggan yang ingin mengirimkan Bola
	 *  yang dipesan di Planet Sport Shop
	 */
	@Override
	public void selectExpedition() {
		System.out.println("Customer telah memilih Ekspedisi JNE untuk pengiriman paket Bola\nTarif pengiriman per kilogram : Rp37.000");
	}
}