package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서
        list.sort(new Comparator<String>() { //Comparator: Functional Interface, compare메서드 하나만 존재
            @Override
            public int compare(String a, String b){ //객체 생성
                return a.compareTo(b); //a가 클때만 b와 위치를 바꿈
            }
        });
        System.out.println(list);

        //람다 표현식을 이용해 Functional Interface구현 (메소드가 하나라서 가능함)
        list.sort((a, b)-> a.compareTo(b));

        // 사전순으로 큰 순서 
        list.sort(new Comparator<String>() {
            public int compare(String a, String b){
                return b.compareTo(a); //b가 클때만 a와 위치를 바꿈
            }
        });
        System.out.println(list);
    }
}
