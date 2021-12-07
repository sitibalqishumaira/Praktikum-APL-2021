/** Interface untuk Strategi Pengiriman Bola
 *	Pelanggan dapat memilih ekspedisi pengiriman yang diinginkan
 */
interface ShippingStrategy {

	/** method untuk memilih ekspedisi bagi pelanggan yang ingin mengirimkan Bola yang dipesan
	 *  di Planet Sport Shop
	 */
	public void selectExpedition();
}