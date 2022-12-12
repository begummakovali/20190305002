package diyet;

import java.util.Scanner;

public class Sistem {

        public static Scanner in = new Scanner(System.in);
        private static boolean menu;
        public static void main(String[] args) {

            System.out.println("**Diyetisyen Klinigimize Hosgeldiniz**");
            System.out.println("1. Giris");
            int a;
            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
            if(a == 1){
                Diyetisyen prt = new Diyetisyen();
                prt.giris();
            }
        }

        public static void menu() {
            //Scanner scan = new Scanner(System.in);
            boolean turkey = true;

            menu : while(turkey){
                System.out.println("====Ana Menu ====");
                System.out.println("1. hasta verileri");
                System.out.println("2. diyet listeleri");
                System.out.println("3. kayıt listesi");
                System.out.println("4. yatış sekli");
                System.out.println("5. ödeme verileri");
                System.out.println("6. çıkış");
                System.out.println("==================");
                System.out.println("seçim :");
                int seciniz = Integer.parseInt(in.nextLine());
                switch (seciniz){
                    case 1 :
                        Hasta();
                        break;
                    case 2 :
                        Diyet();
                        break;
                    case 3 :
                        Kayit();
                    case 4 :
                        Tedavi();
                        break;
                    case 5 :
                        Odeme();
                    case 6 :
                        System.exit(0);

                }

            }
        }
        private static void Kayit() {
            Scanner scan = new Scanner(System.in);
            Kayit RM = new Kayit();
            while(true){
                System.out.println("1. kayıt verileri ekle");
                System.out.println("2. kayıt verilerini goster");
                System.out.println("3. kayıtları duzenle");
                System.out.println("4. kayıt verilerini sil");
                System.out.println("5. Back");
                int input = scan.nextInt();
                switch(input){
                    case 1 :
                        RM.addRM();
                        break;
                    case 2 :
                        RM.display();
                        break;
                    case 3 :
                        RM.update();
                        break;
                    case 4 :
                        RM.delete();
                    case 5 :
                        menu();

                }
            }
        }

    private static void Diyet () {
            Scanner scan = new Scanner(System.in);
            Diyet di = new Diyet();
            try{
                while(true){
                    System.out.println("1. diyet ekle");
                    System.out.println("2. diyet listelerini goster");
                    System.out.println("3. diyet listelerini duzenle");
                    System.out.println("4. diyet listelerini sil");
                    System.out.println("5. Back");
                    int input = scan.nextInt();
                    switch(input){
                        case 1 :
                            di.addDiyet();
                            break;
                        case 2 :
                            di.display();
                            break;
                        case 3 :
                            di.updateDiyet();
                            break;
                        case 4 :
                            di.deleteDiyet();
                            break;
                        case 5 :
                            menu();
                    }
                }
            }
            catch(Exception e){
                System.out.println("Error");
            }
        }


        private static void Tedavi() {
            Scanner scan = new Scanner(System.in);
            System.out.println("hasta kimliğini gir");
            int id = scan.nextInt();
            while(true){
                System.out.println("1. ayakta hasta");
                System.out.println("2. yatan hasta");
                int z = scan.nextInt();
                if(z == 1){
                    Tedavi yontemi = Tedavi.yataraktedavi;
                    System.out.println("ayakta tedavi hastanin sağlığını teşhis etmek veya gözlemlemek için yapılır");
                    break;
                }else if(z == 2){
                    Tedavi yontemi = Tedavi.ayaktatedavi;
                    System.out.println("hastanın hastaneye yatırlmasını gerektiren hastaneye yatış");
                    break;
                }
            }

        }

        private static void Odeme() {
            Scanner scan = new Scanner(System.in);
            Odeme sekli = new Odeme();
            while(true){
                System.out.println("hasta id gir :");
                int id = scan.nextInt();
                System.out.println("secim :");
                System.out.println("1. ayakta hasta");
                System.out.println("2. yatan hasta");
                int bay = scan.nextInt();
                if(bay == 1){
                    System.out.println("==ayakta hasta==");
                    System.out.println("Ödeme : 3000TL");
                    menu();
                }else if (bay ==2){
                    System.out.println("==yatan hasta==");
                    System.out.println("ödeme gün sayisini girin :");
                    int gun = scan.nextInt();
                    int sonuclar = (gun * 200000);
                    System.out.println("ödeme miktarı  :"+sonuclar);
                    menu();
                }
            }
        }

        private static void Hasta() {
            Scanner scan = new Scanner(System.in);
            Hasta hasta = new Hasta();
            hasta.idHasta.add(12);
            hasta.isimHasta.add("Begum");
            hasta.cinsiyet.add("kadin");
            hasta.adres.add("pendik");
            hasta.telefon.add(7723);

            while(true){
                System.out.println("1. hasta verisi ekle");
                System.out.println("2. hasta verilerini goster");
                System.out.println("3. hasta verilerini duzenle");
                System.out.println("4. hasta verilerini sil");
                System.out.println("5. Back");
                int input = scan.nextInt();
                switch(input){
                    case 1 :
                        hasta.addHasta();
                        break;
                    case 2 :
                        hasta.displayHasta();
                        break;
                    case 3 :
                        hasta.updateHasta();
                        break;
                    case 4 :
                        hasta.deleteHasta();
                        break;
                    case 5 :
                        menu();
                }
            }
        }


    }


