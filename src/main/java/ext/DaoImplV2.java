package ext;

import dao.IDao;


public class DaoImplV2 implements IDao {
    @Override
    public double getDate() {
        System.out.println("Version Capteurs");
        double temp =6000;

        return temp ;
    }
}
