package second;

interface Positive{
    int pos(int x);
}
interface Prints{
    void print();
}
public class LamdaTest1 {
    public static void main(String[] args) {
        Positive po;
        Prints pr;

        po = (int n) -> {return n+1;};
        po = (n) -> {return n+1;};
        po = n -> {return n+1;};
        po = (int n) -> n+1;
    }
}
