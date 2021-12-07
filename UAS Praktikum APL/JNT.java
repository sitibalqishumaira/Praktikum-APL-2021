/** class JNT sebagai Strategi konkret kedua yang mengimplements
 *	base strategy interfacenya yaitu Shipping Strategy
 */
class JNT implements ShippingStrategy {

	/** Method untuk memilih ekspedisi JNT oleh pelanggan yang ingin mengirimkan Bola
	 *  yang dipesan di Planet Sport Shop
	 */
	@Override
	public void selectExpedition() {
		System.out.println("Customer telah memilih Ekspedisi JNT untuk pengiriman paket Bola\nTarif pengiriman per kilogram : Rp35.000");
	}
}