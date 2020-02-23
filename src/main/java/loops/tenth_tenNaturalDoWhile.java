package loops;

public class tenth_tenNaturalDoWhile {
    public static void main(String[] args) {
        tenth_tenNaturalDoWhile o = new tenth_tenNaturalDoWhile();
        o.tenNatural();

    }
    public void tenNatural (){
        int a=0;
        System.out.print("|");
        do{
            a++;
            System.out.printf("%3d|",a);
}while (a<10);
    }
}

