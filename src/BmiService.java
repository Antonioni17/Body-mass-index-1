public class BmiService {

    public int calculate (double weihgtKilo, double heigtMetr) {
        int result = (int)Math.round(weihgtKilo / (heigtMetr * heigtMetr));
    return result;
    }
}
