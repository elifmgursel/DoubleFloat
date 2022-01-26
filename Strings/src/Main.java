public class Main {

    public static void main(String[] args) {
	String a ="Merhaba";

        System.out.println(a + " Hoşgeldiniz..");

        String b = "Java";
        String c = "Programlama";
        String d = "Dili";
        int x = 66;
        double z = 3.52;
        byte y = 10;

        b = b + z + y;
        String f = b + x;

        System.out.println(a + b + c);
        System.out.println(b);

        //  \t karakteri bir tab kadar boşluk bırakır.
        //  \n karakteri bir alt satıra atlatıyor.

        String emg = "Java\tProgramlama\tDili";
        String de = "Java\nogreniyorum";
        System.out.println(emg);
        System.out.println(de);

    }
}
