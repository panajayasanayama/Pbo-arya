package newpackage;

public class LuasSegitiga {
    double a,b;
    double hitung(){
        return 0.5*a*b;
    }double pytagoras(){
        return (a * a) + (b * b);
    }double keliling(){
        double c=pytagoras();
        return a+b+c;
    }
}
