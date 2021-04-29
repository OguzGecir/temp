package tr.edu.medipol.yazilimaraclari;

public class MetinIslemleri {

	public static void main(String[] args) {
		String ornek1 = "Merhaba Arkadaþlar";
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek1);
		System.out.println(ornek1 + "->" + sonuc);
		System.out.println("1");

	}
static String buyukHarfeCevir(String orjinalMetin) {
	if(orjinalMetin==null) {
		return orjinalMetin;
		
	}
		
	return orjinalMetin.toUpperCase();
}
}
