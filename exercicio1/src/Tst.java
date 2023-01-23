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
    System.out.println(ini);
    System.out.println(fim);
    }
}
