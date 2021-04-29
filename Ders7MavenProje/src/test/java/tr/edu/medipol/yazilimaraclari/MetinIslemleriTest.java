package tr.edu.medipol.yazilimaraclari;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBuyukHarfeCevir() {
	String deger="MerhabaArkada�lar";
	String sonuc = MetinIslemleri.buyukHarfeCevir(deger);
    assertEquals("MERHABAARKADA�LAR",sonuc);
	}

}
