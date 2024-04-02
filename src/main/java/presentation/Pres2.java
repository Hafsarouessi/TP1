package presentation;

import dao.IDao;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        try {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();

            Class cDao= Class.forName(daoClassName);
       IDao dao=(IDao) cDao.newInstance();

        String metierClassName=scanner.nextLine();
            Class cMetier= Class.forName(metierClassName);
        Imetier metier =(Imetier) cMetier.newInstance();

        System.out.println(dao.getDate());
        Method method=cMetier.getMethod("setDao",IDao.class);

        method.invoke(metier,dao);
        System.out.println("Resultat=>"+metier.calcul());
    }catch (FileNotFoundException | ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
        e.printStackTrace();
    }
}
}
