package ext;

import dao.IDao;

public class DaoImplVWS implements IDao {
    @Override
    public double getDate() {
        System.out.println("Vertion web Service ");
        return 90;
    }
}
