/** class object kedua yang mengimplements
 *	interface BallWeightInfo sebagai implementasi konkret
 */
public class VolleyBall implements BallWeightInfo {

	/** Method getter untuk mengembalikan berat Bola Basket dalam satuan gram
     *  @return double
     */
    @Override
    public double getWeight() {
        return 260;
    }
}