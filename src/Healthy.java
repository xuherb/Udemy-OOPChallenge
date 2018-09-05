public class Healthy extends Base {
    public Healthy(int price) {
        super(new Bread_Healthy(price));
        setAd_1(new Lettuce(4));
        setAd_2(new Onion(4));
        setAd_3(new Tomato(4));
        setAd_4(new Potato(4));
    }
}
