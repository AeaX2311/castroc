package Tarea3;

public class Main {
    public static void main(String[] args) {
        int f0=0,f1=1,f2; System.out.println(f0+"\n"+f1);

        for(int x=0;x<15;x++){
            f2=f0+f1;
            System.out.println(f2);
            f0=f1;
            f1=f2;
        }
    }
}
