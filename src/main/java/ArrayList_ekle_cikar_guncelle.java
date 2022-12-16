import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_ekle_cikar_guncelle {

 /* - Kullanıcıdan int öğelerini girmesini ve listeye öğe eklemesini istemek için kod yazın
      - Kullanıcıdan kaldırılacak öğeleri girmesini isteyin, ardından bu öğeyi listeden kaldırın.
      - Kullanıcıdan güncellemek için öğeyi girmesini isteyin, ardından güncelleyin.

*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> liste = new ArrayList<>();

        while (true){
            System.out.println("Ekleme yapmak icin 'ekle'\n" +
                    "Guncelleme yapmak icin 'guncelle'\n" +
                    "Silmek icin 'sil'\n" +
                    "Cikmak icin'cikis' komutunu giriniz.");

            String secim = input.next();

            if(secim.equalsIgnoreCase("ekle")){
                System.out.println("Eklemek istediginiz sayiyi giriniz");
                int eklenecekSayi =  input.nextInt();
                liste.add(eklenecekSayi);
            }else if (secim.equalsIgnoreCase("guncelle")){
                System.out.println("Guncellemek istediginiz sayiyi giriniz");
                int guncellenecekSayi = input.nextInt();
                System.out.println("Girmek istediginiz yeni sayiyi giriniz.");
                int yeniSayi = input.nextInt();
                liste.set(liste.indexOf(guncellenecekSayi), yeniSayi);
            }else if(secim.equalsIgnoreCase("sil")){
                System.out.println("Silmek istediginiz sayiyi giriniz");
                int silinecekSayi = input.nextInt();
                liste.remove((Integer)silinecekSayi);
            } else if (secim.equalsIgnoreCase("cikis")) {
                break;
            }else {
                System.out.println("Gecerli bir komut giriniz");
            }
            System.out.println(liste);
        }
    }
}

