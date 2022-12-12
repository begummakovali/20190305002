package diyet;

import java.util.Scanner;

    public abstract class Veri {
        String username, password;

        public void giris(){
            Scanner scan = new Scanner(System.in);
            System.out.println("kullanici adinizi giriniz :");
            username =  scan.next();
            System.out.println("kullanici sifresini giriniz :");
            password = scan.next();
            if(!username.isEmpty() && !password.isEmpty()){
                String[] args = null;
                Sistem.menu();
            }
        }
    }

