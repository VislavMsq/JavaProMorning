package lesson4;

import java.util.Arrays;

public class Test1 implements Inter{
    int a;

    public Test1(int a) {
        this.a = a;
    }
    private static int m(){
        return 0;
    }

    public static void main(String[] args) {
//        String[] s = {"5", "7", "99","0"};
//        Arrays.sort(s);
//        System.out.println(Arrays.toString(s));
        int r = m();
        System.out.println(r);

        char c = 'a';
        c++;
        System.out.println(c);

//        Test1[] test1s = {new Test1(2), new Test1(4), new Test1(0)};
//        Arrays.sort(test1s);
//        System.out.println(Arrays.toString(test1s));
    }

    @Override
    public void get() {
        System.out.println("Beer");
    }

    @Override
    public void fly() {

    }
}

interface Inter{
    void get();
    void fly();
}

