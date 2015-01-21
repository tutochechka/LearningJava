package com.javarush.test.level15.lesson12.home06;

/* Порядок загрузки переменных
Разобраться, что в какой последовательности инициализируется.
Исправить порядок инициализации данных так, чтобы результат был следующим:
2 static void init()
1 Static block
3 public static void main
4 non-static block
5 static void printAllFields
7 0
6 null
8 Solution constructor
9 static void printAllFields
11 6
10 First name
*/

public class Solution {
    static {
        init();
    }
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";


    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);

    }
}
