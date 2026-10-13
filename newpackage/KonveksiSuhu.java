package newpackage;

public class KonveksiSuhu {
    double c,f,r;
       double celciusKeFahrenheit() {
        return (c * 9 / 5) + 32;
    }
    double fahrenheitKeCelcius() {
        return (f - 32) * 5 / 9;
    }
    double celciusKeReamur() {
        return c * 4 / 5;
    }
    double reamurKeCelcius() {
        return r * 5 / 4;
    }
     double fahrenheitKeReamur() {
        return (f - 32) * 4 / 9;
    }
   double reamurKeFahrenheit() {
        return (r * 9 / 4) + 32;
    }
}
