/** class Customer mewakili Pelanggan
 *  Pelanggan dapat memilih jenis Ekspedisi pengiriman melalui
 *  interface Shipping Strategy
 */
public class Customer {
    private ShippingStrategy shippingStrategy;

    /** Method setter agar Strategi Pengiriman dapat diubah saat runtime
     *  @param shippingMethod
     */
    public void setShippingStrategy(ShippingStrategy shippingMethod) {
    	this.shippingStrategy = shippingMethod;
    }

    /** Method getter untuk mengembalikan jenis Shipping Strategy yang dipilih
     *  @return shippingStrategy
     */
    public ShippingStrategy getShippingStrategy() {
    	return shippingStrategy;
    }

    /** Method untuk memilih ekspedisi oleh pelanggan yang ingin mengirimkan Bola yang dipesan
     *  di Planet Sport Shop
     */
    public void selectExpedition() {
        shippingStrategy.selectExpedition();
    }
}