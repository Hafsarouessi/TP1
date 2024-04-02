package presentation;

import ext.DaoImplV2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args){
        DaoImplV2 dao=new DaoImplV2();
        MetierImpl metier=new MetierImpl(dao);
       // metier.setDao(dao);
        System.out.println("Resultat="+metier.calcul());

    }

}
