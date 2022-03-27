package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
        SvetoveStrany strana = SvetoveStrany.SEVER;

        for(SvetoveStrany s : SvetoveStrany.values()){
            checkSever(s);
        }

        System.out.println("---------------");
        checkSever(SvetoveStrany.fromString("SEVER"));
        checkSever(strana);
        checkSever(SvetoveStrany.fromString("sever"));
        checkSever(strana);

        switch (strana){
            case SEVER:
                System.out.println("S");
                break;
            default:
                System.out.println("nie je S");
        }
    }

    public static void checkSever(SvetoveStrany s){
        if(s.isJeSever()){
            System.out.println("je to Sever");
        } else{
            System.out.println("nie je to Sever");
        }
    }

}
