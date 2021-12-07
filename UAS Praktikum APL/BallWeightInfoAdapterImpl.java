public class BallWeightInfoAdapterImpl implements BallWeightInfoAdapter {
    private BallWeightInfo ballWeightInfo;
    
    /** Method Constructor
     *  @param ballWeightInfo
     */
    public BallWeightInfoAdapterImpl(BallWeightInfo ballWeightInfo) {
        this.ballWeightInfo = ballWeightInfo;
    }

    /** Method getter untuk mengembalikan nilai berat bola yang sudah dikonversikan
     *  dari satuan gram ke kilogram
     *  @return gram
     */
    @Override
    public double getWeight() {
        double gram = ballWeightInfo.getWeight();
        return gramToKilogram(gram);
    }
    
    /** Method untuk mengonversikan berat bola dari satuan gram ke kilogram
     *  @param gram
     */
    private double gramToKilogram(double gram) {
        return gram / 1000;
    }
}