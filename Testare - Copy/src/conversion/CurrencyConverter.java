package conversion;

public class CurrencyConverter {

    public double EurtoMdl(double eur, double mdl){
        double conv = eur * mdl;
        return conv;
    }

    public double MdltoEur(double mdl, double eur){
        double conv = mdl / eur;
        return conv;
    }



}
