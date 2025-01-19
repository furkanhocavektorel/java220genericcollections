package generic;
// T=DOUBLE
// T=Integer
public class Islem<T extends Number> {

    public Double toplama(T a, T b){
        return a.doubleValue()+b.doubleValue();
    }

    // furkan-ali
    public Double cikartma(T a, T b){
        return a.doubleValue()-b.doubleValue();
    }

    // frkan*mehmet
    public Double carpma(T a, T b){
        return a.doubleValue()*b.doubleValue();
    }


}
