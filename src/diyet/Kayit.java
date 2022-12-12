package diyet;

import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {

        // Generics
        ArrayList<Integer> IdHasta = new ArrayList<>();
        ArrayList <Integer> IdKayit = new ArrayList<>();
        ArrayList <String> Tarih = new ArrayList<>();
        ArrayList <Integer> Tansiyon = new ArrayList<>();
        ArrayList <Integer> Nabiz = new ArrayList<>();

        //    int RM = 100;
        Scanner scan = new Scanner(System.in);

        public void addRM(){
            System.out.println(" Hasta Kayitlari");
            System.out.println("Id Hasta :");
            IdHasta.add(scan.nextInt());
            System.out.println("Hasta Kayit Kimligi :");
            IdKayit.add(scan.nextInt());
            System.out.println("Yatis Tarihi :");
            Tarih.add(scan.nextLine());
            System.out.println("Tansiyon(mmHg) :");
            Tansiyon.add(scan.nextInt());
            System.out.println("Kalp Atisi (BPM): ");
            Nabiz.add(scan.nextInt());
        }
        int x = 0;
        public void display(){
            if(IdHasta.size()>0){
                for(int i =0; i< IdHasta.size();i++){
                    System.out.println("========Data Rekam Medis==========");
                    System.out.println("Id Hasta :"+IdHasta.get(i).toString()+"\n"+
                            "Id Kayit :"+IdKayit.get(i)+"\n"+
                            "Baslama Tarihi :"+Tarih.get(i)+"\n"+
                            "Tansiyon(mmHg) :"+Tansiyon.get(i)+"\n"+
                            "Nabiz (BPM) :"+Nabiz.get(i).toString());
                    System.out.println("===============================");

                }
            }
            else{
                System.out.println("Hiçbir veri görüntülenmiyor !");
            }
        }
        public void delete(){
            System.out.println("Hasta kimliğini girin :");
            int idHasta = scan.nextInt();
            int r = IdHasta.indexOf(idHasta);
            if(r>=0){
               IdHasta.remove(r);
               IdKayit.remove(r);
                Tarih.remove(r);
               Tansiyon.remove(r);
                Nabiz.remove(r);
            }else{
                System.out.println("Veri Yok !");
            }
        }

        public void update(){
            System.out.println("Hasta Kimligini Girin :");
            int idHasta = scan.nextInt();
            int r = IdHasta.indexOf(idHasta);
            if(r>=0){
                System.out.println("===Yeni Veri===");
                System.out.println("Hasta Kimligini Girin :");
                Integer has = scan.nextInt();
                IdHasta.set(r,has);

                System.out.println("Kayit Kimligini Girin :");
                Integer med = scan.nextInt();
                scan.nextInt();
                IdKayit.set(r, med);

                System.out.println("Baslama Tarihi :");
                String tar = scan.nextLine();
                Tarih.set(r, tar);

                System.out.println("Tansiyon (mmHg) :");
                Integer tansiyon = scan.nextInt();
                Tansiyon.set(r, tansiyon);

                System.out.println("Nabiz (BPM) :");
                Integer nab = scan.nextInt();
                Nabiz.set(r, nab);    }

        }
    }

