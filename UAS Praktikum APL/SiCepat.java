/** class SiCepat sebagai Strategi konkret ketiga yang mengimplements
 *	base strategy interfacenya yaitu Shipping Strategy
 */
class SiCepat implements ShippingStrategy {

	/** Method untuk memilih ekspedisi SiCepat oleh pelanggan yang ingin mengirimkan Bola
	 *  yang dipesan di Planet Sport Shop
	 */
	@Override
	public void selectExpedition() {
		System.out.println("Customer telah memilih Ekspedisi SiCepat untuk pengiriman paket Bola\nTarif pengiriman per kilogram : Rp36.000");
	}
}