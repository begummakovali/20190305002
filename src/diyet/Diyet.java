package diyet;

import java.util.ArrayList;
import java.util.Scanner;

public class Diyet {
//ArrayList

    ArrayList<Integer> idDiyet = new ArrayList<>();
    ArrayList<String> isim = new ArrayList<>();
    ArrayList<String> turler = new ArrayList<>();
    ArrayList<Integer> fiyat = new ArrayList<>();

    //    int data = 100;
    Scanner scan = new Scanner(System.in);

    public void addDiyet() {
        System.out.println("===diyet listeleri==");
        System.out.println("diyet günü seçimi:");
        idDiyet.add(scan.nextInt());
        System.out.println("diyet isimleri :");
        isim.add(scan.next());
        System.out.println("diyet türü :");
        turler.add(scan.next());
        System.out.println("diyet fiyatları (TL):");
        fiyat.add(scan.nextInt());
    }

    public void display(){
        if(idDiyet.size()>0){
            for(int i = 0;i<idDiyet.size();i++){
                System.out.println("===Diyet Listeleri ====");
                System.out.println("Diyet numarası :"+idDiyet.get(i).toString()+"\n"+
                        "Diyet ismi :"+isim.get(i)+"\n"+
                        "Diyet turu :"+turler.get(i)+"\n"+
                        "Diyet fiyatlari :"+fiyat.get(i).toString());
                System.out.println("=========");
            }
        }
        else{
            System.out.println("veri yok!");
        }
    }

    public void updateDiyet(){
        System.out.println("güncellenmiş diyet kodunu giriniz :");
        int id = scan.nextInt();
        int r = idDiyet.indexOf(id);
        if(r>=0){
            System.out.println("====en son diyet listesini===");
            System.out.println("diyet id leri :");
            int di = scan.nextInt();
            idDiyet.set(r,di);

            System.out.println("diyet adı :");
            String is = scan.next();
            isim.set(r, is);

            System.out.println("diyet turu :");
            String tur = scan.next();
            turler.set(r, tur);

            System.out.println("diyet fiyatları:");
            Integer fi = scan.nextInt();
            fiyat.set(r, fi);
            System.out.println("=========");

        }
    }

    public void deleteDiyet(){
        System.out.println("silmek istediginiz diyet id sini giriniz  :");
        int id = scan.nextInt();
        int r = idDiyet.indexOf(id);
        if(r>=0){
            idDiyet.remove(r);
            isim.remove(r);
            turler.remove(r);
            fiyat.remove(r);
            System.out.println("Basariyla silindi !");
            System.out.println("===============");
        }
        else{
            System.out.println("veri yok !");
        }
    }

}