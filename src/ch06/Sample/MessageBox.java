package ch06.Sample;

import ch06.Sample.framework.Product;

public class MessageBox implements Product {
    private char decochar; //메시지를 장식하는 장식 문자

    public MessageBox(char decochar) { 
        this.decochar = decochar;
    }

    @Override
    public void use(String s) { //출력
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() { //자기 자신 복제
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
