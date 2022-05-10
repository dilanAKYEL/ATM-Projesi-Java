import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        String usarName, password;
        Scanner input= new Scanner(System.in);
        int right= 3;
        int balance= 1500;
        int select;
        while (right>0){
            System.out.print("Kullanıcı Adınız:");
            usarName= input.next();
            System.out.print("Parolanız:");
            password= input.next();

            if (usarName.equals("Patika")&& password.equals("dev123")){
                System.out.print("Merhaba Kodluyoruz Bankasına Hoşgeldiniz!");
                do {

                    System.out.println("1-Para Yatırma\n"+
                    "2-Para Çekme\n"+
                    "3-Bakiye Sorgulama\n "+
                    "4-Çıkış yap");
                    System.out.println(
                            "Lütfen yapmak istediğiniz işlemi seçiniz.");
                    select=input.nextInt();
                    if (select==1){
                        System.out.print("Para miktarı:");
                        int price =input.nextInt();
                        balance+= price;
                    }else if ((select== 2)){
                        System.out.print("Para miktarı;" );
                        int price= input.nextInt();
                        if (price>balance){
                            System.out.print("Bakiye Yetersiz:");
                        }else {
                            balance = price;
                        }
                        } else if (select== 3) {
                        System.out.print("Bakiyeniz:" + balance);
                    }
                        } while (select !=4);
                        System.out.print("Tekrar görüşmek dileğiyle.");
                        break;
                    } else {
                        right--;
                        System.out.print("Hatalı kullanıcı adı veya şifre.Tekrar deneyiniz.");
                        if (right==0){
                            System.out.print("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");

                        }else{
                            System.out.print("Kalan hakkınız"+right);
                        }
                    }

                }
            }
        }


