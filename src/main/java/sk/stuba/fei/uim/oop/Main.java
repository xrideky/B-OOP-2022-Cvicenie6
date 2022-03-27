package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
        SvetoveStrany strana = SvetoveStrany.SEVER;

        for(SvetoveStrany s : SvetoveStrany.values()){
            checkSever(s);
        }

        System.out.println("---------------");
        System.out.println(SvetoveStrany.valueOf("SEVER"));
        checkSever(strana);
        System.out.println(SvetoveStrany.valueOf("sever"));
    }

    public static void checkSever(SvetoveStrany s){
        if(s.equals(SvetoveStrany.SEVER)){
            System.out.println("je to Sever");
        } else{
            System.out.println("nie je to Sever");
        }
    }
}
