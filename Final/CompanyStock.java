package Final;
public class CompanyStock {
    private double tesla;
    private double apple;
    private double nerdWallet;
    private double peloton;
    private double zoom;
    private double homeDepot;
// defines all the stock companies
    public CompanyStock(double t, double a, double nW, double p, double z, double hD) {
        tesla = t;
        apple = a;
        nerdWallet = nW;
        peloton = p;
        zoom = z;
        homeDepot = hD;
    }
//sets all the stock companies
    public double getTesla() {
        return tesla;
    }
    public void setTesla(double t) {
        tesla = t;
    }

    public double getApple() {
        return apple;
    }
    public void setApple(double a) {
        apple = a;
    }

    public double getNerdWallet() {
        return nerdWallet;
    }
    public void setNerdWallet(double nW) {
        nerdWallet = nW;
    }

    public double getPeloton() {
        return peloton;
    }
    public void setPeloton(double p) {
        peloton = p;
    }

    public double getZoom() {
        return zoom;
    }
    public void setZoom(double z) {
        zoom = z;

    }
    public double getHomeDepot() {
        return homeDepot;
    }
    public void setHomeDepot(double hD) {
        homeDepot = hD;
    }
}