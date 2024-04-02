package dao;


import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getDate() {
        /*se connecter a la base de donnes et recuperer la temperature */
        System.out.println("Version base da donnes");
        double temp=Math.random()*40 ;

        return temp;
    }
}
