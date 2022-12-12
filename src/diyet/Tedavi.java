package diyet;


    public enum Tedavi {
        ayaktatedavi,
        yataraktedavi;

        void gecisTurleri() {
            switch(this){
                case ayaktatedavi :
                    System.out.println("Hastanın sağlığını teşhis etmek veya gözlemlemek için ayakta tedavi uygulandı");
                    break;
                case yataraktedavi :
                    System.out.println("Hasta için hastaneye yatış gerekti");
                    break;
            }
        }
    }

