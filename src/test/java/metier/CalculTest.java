package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private calcul Calcul;
    @Test
    public void testSomme(){
        Calcul =new calcul();
        double a=5; double b=9;
        double expected=14;
        double res =Calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
