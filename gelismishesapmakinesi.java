import java.util.Scanner;

public class gelismishesapmakinesi {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        double sayi,sonuc=0,ilksayi;
        String islem;
        System.out.println("sayı ve işlemleri ayrı giriniz. Not= İşlem önceliği bulunmamaktadır, işlemler adım adım işlenmektedir!");
        System.out.println("İşlemi bitirmek istediğinizde '='(eşittir) sembolü kullanmanız gerekmektedir.");
        ilksayi=k.nextDouble();
        for(int i=0;;i++){
            if(i==0){ 
            islem=k.next();
            sayi=k.nextDouble();   
            if(islem.equals("+")){
               sonuc+=(ilksayi+sayi);
            }
            if(islem.equals("-")){
                sonuc+=(ilksayi-sayi);
            }
            if(islem.equals("*")){
                sonuc+=(ilksayi*sayi);

            }
            if(islem.equals("/")){
                sonuc+=(ilksayi/sayi);
            }
            if(islem.equals("=")){
                System.out.println(sonuc);
                break;
            } }
            islem=k.next();
            if(islem.equals("=")){
                System.out.println(sonuc);
                break;
            }
            sayi=k.nextDouble();             
            if(islem.equals("+")){
               sonuc+=sayi;
            }
            if(islem.equals("-")){
                sonuc-=sayi;
            }
            if(islem.equals("*")){
                sonuc*=sayi;

            }
            if(islem.equals("/")){
                sonuc/=sayi;
            }
            
        }
    }
}
