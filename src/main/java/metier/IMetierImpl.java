package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IMetierImpl implements IMetier {

    //@Autowired
    //@Qualifier("dao")
    private IDao dao; //couplage faible

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
        double tmp=dao.getData();
        return tmp*540/Math.cos(tmp*Math.PI);
    }
    /*
    Injecter dans la variable dao un objet d'une classe
    qui implémente l'interface IDao

    public void setDao(IDao dao) {
        this.dao = dao;
    }*/
}
