/** class object kedua yang mengimplements
 *	interface BallWeightInfo sebagai implementasi konkret
 */
public class TennisBall implements BallWeightInfo {

	/** Method getter untuk mengembalikan berat Bola Tenis dalam satuan gram
     *  @return double
     */
    @Override
    public double getWeight() {
        return 56;
    }
}