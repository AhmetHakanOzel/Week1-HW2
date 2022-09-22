
public class Main {

	public static void main(String[] args) {

		// Hello world uygulaması
		System.out.println("Merhaba Java");

//--------------------------------------------------------------------
		// variables
		int ogrenciSayısı = 10;
		String mesaj = "Öğrenci sayısı : ";
		System.out.println(mesaj + ogrenciSayısı);
		System.out.println("Öğrenci sayım : " + ogrenciSayısı);
		System.out.println("Öğrenci sayım : " + ogrenciSayısı);
		System.out.println("Öğrenci sayım : " + ogrenciSayısı);

//---------------------------------------------------------------------
		// data types
		int sayi = 12;
		sayi = -36;
		System.out.println(sayi);

		double ondalıklıSayı = 18.67;
		System.out.println(ondalıklıSayı);

		char karakter = 'A';
		System.out.println(karakter);

		boolean dogruMu = false;
		System.out.println(dogruMu);

//---------------------------------------------------------------------
		// if else
		int sayi1 = 23;
		if (sayi1 < 20) {

			System.out.println("sayi 20'den küçüktür");
		}

		else if (sayi1 == 20) {

			System.out.println("sayi 20'ye eşittir");
		} else {

			System.out.println("sayi 20'den büyüktür");
		}

//---------------------------------------------------------------------
		// reCap

		int sayiX = 56;
		int sayiY = 25;
		int sayiZ = 2;
		int enBuyuk = sayiX;

		if (enBuyuk < sayiY) {
			enBuyuk = sayiY;
		}
		if (enBuyuk < sayiZ) {
			enBuyuk = sayiZ;
		}
		System.out.println("En buyuk sayi = " + enBuyuk);

//--------------------------------------------------------------------
		// switch

		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesefef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}
//-----------------------------------------------------------------
		// loop for
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		// while
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		
		// Do-While
		int j=1;
		do{
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
		
		// arrays
		
		String ogrenci1="Engin";
		String ogrenci2="Derin";
		String ogrenci3="Salih";
		String ogrenci4="Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("-------------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ahmet";
		
		for(int k=0; k<ogrenciler.length;k++) {
			System.out.println(ogrenciler[k]);
		}
		System.out.println("---------------------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		//reCap
		
		double[] myList = {1.2,6.3,4.3,5.6};
		double total=0;
		double max = myList[0];
		for (double number : myList) {
			if(max<number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
			
		}
		System.out.println("Toplam = "+ total);
		System.out.println("En Büyük = "+ max);
		
		//multiDimensionalArray
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";
		
		for(int a = 0; a<=2; a++) {
			System.out.println("-----------------");
		for(int b=0;b<=2;b++) {
				System.out.println(sehirler[a][b]);
			}
		}
//---------------------------------------------------------------
		// strings
		
		String mesaj1 = "Bugün hava çok güzel.";
		
		System.out.println(mesaj1);
		
		System.out.println("Eleman sayısı : "+ mesaj1.length());
		System.out.println("5. eleman : "+mesaj1.charAt(4));
		System.out.println(mesaj1.concat(" Yaşasın!"));
		System.out.println(mesaj1.startsWith("B"));
		System.out.println(mesaj1.endsWith("."));
		char[]karakterler1 = new char[5];
		mesaj1.getChars(0, 5, karakterler1, 0);
		System.out.println(karakterler1);
		System.out.println(mesaj1.indexOf("av"));
		System.out.println(mesaj1.lastIndexOf("a"));
		
		
		String yeniMesaj = mesaj1.replace(' ','-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj1.substring(2,5));
		
		for (String kelime: mesaj1.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj1.toLowerCase());
		System.out.println(mesaj1.toUpperCase());
		System.out.println(mesaj1.trim());
		
		
//----------------------------------------------------------------
		//miniProjeAsalSayı
		
		int number = 25;
		int reminder = number % 2;
		//System.out.println(reminder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if(number<2) {
			System.out.println("Geçersiz sayı");
			return;
		}
		for (int a = 2; a<number; a++) {
			if(number % a == 0) {
				isPrime = false;
			}
			
		}
		if(isPrime) {
			System.out.println("Sayı asaldır");
		}
		else {
			System.out.println("Sayı asal değildir");
		}
		
		//miniProjeSesliHarfler
		
		char harf = 'E';
		
		switch (harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalın sesli harf");
				break;
				default:
				System.out.println("İnce sesli harf");
		}
		
		//miniProjeMukemmelSayı
		
		int number1 = 6;
		int total1 = 0;
		
		for(int c = 1;c<number1;c++) {
			if(number %c ==0) {
				total1 = total1 + c;
			}
		}
		
		if(total1 == number1) {
			System.out.println("Mükemmel sayıdır");
		}
		else {
			System.out.println("Mükemmel sayı değildir");
		}
		
		//miniProjeArkadasSayilar
		
		int sayia = 2;
		int sayib = 284;
		int toplama = 0;
		int toplamb = 0;
		
		for(int z=1;z<sayia;z++) {
			if(sayia%z==0) {
				toplama = toplama +z;
			}
		}
		
		for(int z=1;z<sayib;z++) {
			if(sayib%z==0) {
				toplamb = toplamb +z;
			}
		}
		
		if(sayia==toplamb  && sayib==toplama) {
			System.out.println("bu iki sayı arkadaştır");
		}
		else {
			System.out.println("bu iki sayı arkadaş değildir");
		}
		
		//miniProjeSayıBulma
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi = false;
		
		for(int sayif: sayilar) {
			if(sayif==aranacak) {
				varMi = true;
				break;
				
			}
		}
		
		if(varMi) {
			System.out.println("Sayı mavcuttur");
		}
		else {
			System.out.println("Sayı mevcut değildir");
		}
		
	}

}
