public class Tst {
    int ini=0,fim=25;
    void print() {
    System.out.println(ini+fim);
    }
    {
    ini=fim%7;
    fim=ini*3;
    System.out.println(ini);
    System.out.println(fim);
    }
    Tst(int a, int b) {
    ini+=a;
    fim+=b;
    System.out.println(ini);
    System.out.println(fim);
    }
    {
    ini/=2;
    fim+=10;
    System.out.println(ini);
    System.out.println(fim);
    } 
}
