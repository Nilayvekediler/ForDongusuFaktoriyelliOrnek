// 1 + x/1! – x^2/2! + x^3/3! + ... + x^N/N! dizisini hesaplayan program. Bir + bir - şeklinde ilerler.
import java.util.*;

public class ForDongusuFaktoriyelliOrnek
{

        public static void main(String [] args)
        {
            Scanner klavye = new Scanner(System.in);

            double x;
            double toplam = 1.0;
            double fakt = 1;
            double xpow = 1;

            int i;
            int N; /*Genel sanılanın aksine değişken isimleri büyük harfle de başlayabilir. Ama küçük harfle başlaması
            yaygın ve gerekli kullanımdır. Burada büyük harfli alma sebebimiz matematikte N in genelde toplamı tutmasındandır.*/
            int isaret = 1;

            System.out.print("x değerini giriniz:");
            x = klavye.nextDouble(); //kullanıcıdan bir double sayı alınır x e atılır.

            System.out.print("Toplam terim sayısını giriniz:");
            N = klavye.nextInt();//kullanıcıdan ne kadar terim olunması isteniyorsa o sayıyı alır ve N değişkenine atar.

            for (i = 1; i <= N; i++)
            {
                isaret = -isaret; // eksi terimler için isaret degistiriliyor. Yani -1 olur ilk terim - li. 2. dönüşünde -(-) den dolayı +1 olur işaret. Böylece bir + bir - yapısı sağlanır.
                xpow = xpow * x;
                fakt = fakt * i;
                toplam += isaret * xpow / fakt;
            }
            System.out.print("Toplam"+ toplam);
        }
}

/* x    i   N   isaret  xpow    fakt    toplam
   2    1   4    1       1 x^0    1        1
   2    2   4   -1       2 x^1    2       1-1=0
   2    3   4    1       4 x^2    6        2/3
   2    4   4    -1      8 x^3    24     2/3-1/3=1/3=0.33333333
 */


