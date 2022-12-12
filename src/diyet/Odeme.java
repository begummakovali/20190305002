package diyet;
import java.util.Scanner;

public class Odeme <T> {
    int total;
    int idHasta;

    Odeme() {
    }

    public int getTotal() {
        return total;
    }

    public int getIdHasta() {
        return idHasta;
    }

    public Odeme(int total, int idHasta) {
        this.total = total;
        this.idHasta = idHasta;
    }
}
