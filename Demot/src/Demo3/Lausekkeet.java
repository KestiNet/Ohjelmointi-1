package Demo3;
/**
 * Lasketaan 
 * a) vuorokauden sekuntien lukum‰‰r‰
 * b) vuoden tuntien lukum‰‰r‰
 * c) kauanko valolla kuluu aikaa matkaan auringosta maahan
 * d) valovuosi kilometrein‰
 *  
 * @author vesal
 * @version 19.9.2008
 *
 */
public class Lausekkeet {

    /** Vuorokauden sekuntien lukum‰‰r‰ */
    public static final int SEKUNTEJAVUOROKAUDESSA = 24*60*60;

    /** Vuoden pituus vuorokausina */
    public static final double VUODENPITUUSVRK = 365.2425;

    /** Matka maasta aurinkoon keskim‰‰rin kilometrein‰ */
    public static final double MAASTAAURINKOONKM = 149597871;

    /** Valon nopeus m/s */
    public static final double VALONNOPEUSMS = 299792458;
    
    /**
     * Lasketaan lausekkeiden arvot
     * @param args
     */
    public static void main(String[] args) {
        double tuntejaVuodessa = 24 * VUODENPITUUSVRK;
        double valoMaahanSekuntia = MAASTAAURINKOONKM * 1000 / VALONNOPEUSMS;
        double valovuosiKm = VALONNOPEUSMS * tuntejaVuodessa * 60 * 60 / 1000;
        
        System.out.printf("Vuorokaudessa on %d sekuntia.%n",SEKUNTEJAVUOROKAUDESSA);
        System.out.printf("Vuodessa on %3.1f tuntia%n",tuntejaVuodessa);
        System.out.printf("Valolla kest‰‰ %4.1f sekuntia auringosta maahan%n",valoMaahanSekuntia);
        System.out.printf("Valovuosi on %.0f km%n",valovuosiKm);

    }

}
