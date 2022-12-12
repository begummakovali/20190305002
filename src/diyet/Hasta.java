package diyet;

import java.util.ArrayList;
import java.util.Scanner;

public class Hasta implements Hasta1 {
//Arraylist
        ArrayList<Integer> idHasta = new ArrayList<>();
        ArrayList<String> isimHasta = new ArrayList<>();
        ArrayList<String> cinsiyet = new ArrayList<>();
        ArrayList<String>  adres= new ArrayList<>();
        ArrayList<Integer> telefon = new ArrayList<>();
        //   int data = 100;
        Scanner scan = new Scanner(System.in);

    public void addHasta(){
            System.out.println("==hasta verileri==");
            System.out.println("hasta id si :");
            idHasta.add(scan.nextInt());
            System.out.println("hasta isimleri :");
            isimHasta.add(scan.next());
            System.out.println("cinsiyet:");
            cinsiyet.add(scan.next());
            System.out.println("adres :");
            adres.add(scan.next());
            System.out.println("telefon numarasi :");
            telefon.add(scan.nextInt());
        }
        int x =0;
        public void displayHasta(){
            if(idHasta.size()>0){
                for(int i =0; i< idHasta.size();i++){
                    System.out.println("========hasta verileri==========");
                    System.out.println("hasta id :"+idHasta.get(i).toString()+"\n"+
                            "hasta ismi :"+isimHasta.get(i)+"\n"+
                            "cinsiyet :"+cinsiyet.get(i)+"\n"+
                            "adres :"+adres.get(i)+"\n"+
                            "telefon numarasi :"+telefon.get(i).toString());
                    System.out.println("***************************");

                }
            }
            else{
                System.out.println("data yok !");
            }

        }
        public void deleteHasta(){
            System.out.println("silmek istediginiz hasta kimligini girin: ");
            int id = scan.nextInt();
            int r = idHasta.indexOf(id);
            if(r>=0){
                idHasta.remove(r);
                isimHasta.remove(r);
                cinsiyet.remove(r);
                adres.remove(r);
                telefon.remove(r);
                System.out.println("Basariyla silindi !");
                System.out.println("*****************");
            }
            else{
                System.out.println("Veri Yok!");
            }
        }
        public void updateHasta(){
            System.out.println("Degistirmek Istediginiz Hasta Kimligini Giriniz :");
            int idHas = scan.nextInt();
            int r = idHasta.indexOf(idHas);
            if(r>=0){
                System.out.println("=====Yeni Veriler======");
                System.out.println("Id Hasta (yeni) :");
                Integer id = scan.nextInt();
                idHasta.set(r, id);

                System.out.println("Hasta Ismi (yeni) :");
                String is = scan.next();
                isimHasta.set(r, is);

                System.out.println("Cinsiyet (yeni) :");
                String cin = scan.next();
                cinsiyet.set(r, cin);

                System.out.println("Adres (yeni) :");
                String adre = scan.next();
               adres.set(r, adre);

                System.out.println("Telefon (yeni) :");
                Integer noTel = scan.nextInt();
                telefon.set(r, noTel);
            }
        }

        @Override
        public void addhasta() {
            System.out.println("==Hasta Verileri==");
            System.out.println("Id Hasta :");
            idHasta.add(scan.nextInt());
            System.out.println("Hasta Ismi :");
            isimHasta.add(scan.next());
            System.out.println("Cinsiyet :");
            cinsiyet.add(scan.next());
            System.out.println("Adres :");
            adres.add(scan.next());
            System.out.println("Telefon :");
            telefon.add(scan.nextInt());
        }
    }

