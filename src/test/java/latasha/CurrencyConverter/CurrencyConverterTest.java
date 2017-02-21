package latasha.CurrencyConverter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by latashawatson on 2/16/17.
 */
public class CurrencyConverterTest {
    CurrencyConverter c1;

    @Before
    public void setUp() {
        c1 = new CurrencyConverter();
    }

    @Test
    public void dollarToEuroTest(){
        assertEquals(0.94, c1.convert("Us Dollar", "Euro", 1.00), 0.0);

    }
    @Test
    public void EuroToDollarTest(){
        assertEquals(1.06, c1.convert("Euro", "Us Dollar", 1.00), 0.0);

    }
    @Test
    public void EuroToPoundTest(){
        assertEquals(.87, c1.convert("Euro", "British Pound", 1.00), 0.0);

    }
    @Test
    public void PoundToRupeeTest(){
        assertEquals(83.31, c1.convert("British Pound", "Indian Rupee", 1.00), 0.0);

    }
    @Test
    public void IndianRupeeToCanadianDollarTest(){
        assertEquals(.02, c1.convert("Indian Rupee", "Canadian Dollar", 1.00), 0.01);

    }
    @Test
    public void CanadianToSingaporeDollarTest(){
        assertEquals(1.08, c1.convert("Canadian Dollar", "Singapore Dollar", 1.00), 0.00);

    }
    @Test
    public void SingaporeDollarToSwissFrancTest(){
        assertEquals(.70, c1.convert("Singapore Dollar", "Swiss Franc", 1.00), 0.01);

    }
    @Test
    public void SwissFrancToMalaysianRinggitTest(){
        assertEquals(4.42, c1.convert("Swiss Franc", "Malaysian Ringgit", 1.00), 0.01);

    }
    @Test
    public void MalaysianRinggitToJapaneseYenTest(){
        assertEquals(25.91, c1.convert("Malaysian Ringgit", "Japanese Yen", 1.00), 0.01);

    }
    @Test
    public void JapaneseYenToChineseYuanTest(){
        assertEquals(.05, c1.convert("Japanese Yen", "Chinese Yuan", 1.00), 0.01);

    }


}
