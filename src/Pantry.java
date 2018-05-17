

/**
 *
 * @author alumne
 */
public class Pantry {

    private Jam jar1;
    private Jam jar2;
    private Jam jar3;
    private Jam selected;

    Pantry(Jam jar1, Jam jar2, Jam jar3) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        selected = null;
    }

    /**
     * Mètode per a imprimir per pantalla els 3 Jam de la classe.
     */
    public void print() {
        System.out.print("1: ");
        jar1.print();
        System.out.print("2: ");
        jar2.print();
        System.out.print("3: ");
        jar3.print();
    }

    /**
     * Comprova quin 'jarNumber' hem passat per paràmetres al mètode i estableix aquest número
     * com a el valor de 'selected'.
     * @param jarNumber
     */
    public void select(int jarNumber) {
        if (jarNumber == 1) {
            selected = jar1;
        } else if (jarNumber == 2) {
            selected = jar2;
        } else {
            selected = jar3;
        }
    }

    /**
     * Realitza la funció 'spread()' de la classe Jam a partir de la variable 'selected' i l'integer
     * que li passarem a aquest mètode.
     * @param oz
     */
    public void spread(int oz) {
        selected.spread(oz);
    }
}
