package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements Imetier{
    //couplage faible

    private IDao dao;

    public MetierImpl(IDao dao){
        this.dao=dao;

    }
    @Override
    public double calcul() {
        double tmp= dao.getDate();
        Double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
