import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int test, price, azalt;
        while (right > 0) {

            System.out.println("Kullanıcı adınızı giriniz:");
            username = input.nextLine();
            System.out.println("Şifrenizi giriniz:");
            password = input.nextLine();
            if (username.equals("Betul") && password.equals("123")) {
                System.out.println("Şirin banka giriş yaptınız.");
                do {
                    System.out.println("1-para yatırma\n" + "2-para çekme\n" + "3-para sorgulama\n" + "4-çıkış yap");
                    System.out.println("Seçiminizi yapınız:");
                    test = input.nextInt();
                    switch (test) {

                        case 1:
                            System.out.println("Yatıracağınız para miktarı:");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz:" + balance);
                            break;
                        case 2:
                            System.out.println("Çekeceğiniz para miktarı:");
                            azalt = input.nextInt();
                            balance-= azalt;
                            System.out.println("Yeni bakiyeniz:" + balance);
                            break;
                        case 3:
                            System.out.println("Bakiyeniz:" + balance);
                            break;
                        case 4:
                            System.out.println("Sistemden çıkış yapıldı.");
                            break;
                        default:
                            System.out.println("Hatalı giriş yaptınız!");
                            break;
                    }
                } while (test!=4);
                System.out.println("Görüşmek üzere.");
                }else{

                    right--;
                    System.out.println("Kullanıcı adı veya şifreniz yanlış");

                    if (right == 0) {
                        System.out.println("Hesabınız bloke olmuştur.Bankanızla iletişime geçin.");
                    } else {
                        System.out.println("Deneme hakkınız: " + right);
                    }
                }
            }

            input.close();
        }
    }


