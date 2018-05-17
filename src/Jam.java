

/**
 *
 * @author alumne
 */
public class Jam {

    private String contents;
    private String date;
    private int capacity;
    private static int numTotalJars, noJam = 0;

    Jam(String contents, String date, int size) {
        this.contents = contents;
        this.date = date;
        capacity = size;
        numTotalJars++;
    }

    /**
     * Mètode que retorna un bolea depenent de si la capacitat és o no igual a 0.
     * @return
     */
    public boolean empty() {
        return (capacity == 0);
    }

    /**
     * Mètode void per a imprimir el valor de les variables 'contents', date' i capatity.
     * Imprimeix quans Jar s'han quedat sense mermelada i quants han estat creats.
     */
    public void print() {
        System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
        System.out.println("El n�mero total de Jars creats des de l'inici dels temps s�n: " + Jam.getNumTotalJars());
        System.out.println("El n�mero de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
    }

    /**
     * Mètode que va repartint el fluid introduit (int) mentres que el Jar no està buit. Si el fluit
     * és més gran que la capacitat ens indicarà que no queda 'jam'.
     * @param fluidOz
     */
    public void spread(int fluidOz) {
        if (!empty()) {
            if (fluidOz < capacity) {
                System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
                capacity = capacity - fluidOz;
            } else {
                System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
                capacity = 0;
                noJam++;
            }
        } else {
            System.out.println("No jam in the Jar!");
        }
    }

    /**
     * Mètode int que ens retorna el nombre total de Jars.
     * @return
     */
    public static int getNumTotalJars() {
        return numTotalJars;
    }

    /**
     * Mètode int que retorna el nombre de Jars que s'han quedat sense mermelada.
     * @return
     */
    public static int getNoJam() {
        return noJam;
    }
}
