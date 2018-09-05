public class Base {

    private Addition ad_1;
    private Addition ad_2;
    private Addition ad_3;
    private Addition ad_4;

    private Bread bread;

    public Base(Bread bread) {
        this.bread = bread;
//        this.ad_1 = null;
//        this.ad_2 = null;
//        this.ad_3 = null;
//        this.ad_4 = null;
    }

    protected void addIngredient(Addition ingredient){
        if(ad_1 == null) ad_1 = ingredient;
        else if(ad_2 == null) ad_2 = ingredient;
        else if(ad_3 == null) ad_3 = ingredient;
        else if(ad_4 == null) ad_4 = ingredient;
        else System.out.println("You already added 4 additions");
    }

    public int getBurgerPrice(){
        int burgerPrice = this.bread.getPrice();
        if(ad_1 != null) burgerPrice += ad_1.getPrice();
        if(ad_2 != null) burgerPrice += ad_2.getPrice();
        if(ad_3 != null) burgerPrice += ad_3.getPrice();
        if(ad_4 != null) burgerPrice += ad_4.getPrice();

        return burgerPrice;
    }

    public Bread getBread() {
        return bread;
    }

    public Addition getAd_1() {
        return ad_1;
    }

    public void setAd_1(Addition ad_1) {
        this.ad_1 = ad_1;
    }

    public Addition getAd_2() {
        return ad_2;
    }

    public void setAd_2(Addition ad_2) {
        this.ad_2 = ad_2;
    }

    public Addition getAd_3() {
        return ad_3;
    }

    public void setAd_3(Addition ad_3) {
        this.ad_3 = ad_3;
    }

    public Addition getAd_4() {
        return ad_4;
    }

    public void setAd_4(Addition ad_4) {
        this.ad_4 = ad_4;
    }
}
