/** class object pertama yang mengimplements
 *	interface BallWeightInfo sebagai implementasi konkret
 */
public class BasketBall implements BallWeightInfo {
	
	/** Method getter untuk mengembalikan berat Bola Basket dalam satuan gram
     *  @return double
     */
    @Override
    public double getWeight() {
        return 580;
    }
}
