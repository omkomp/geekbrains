package ru.geekbrains.level1.homework3;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");      }

   public static void checkSumSign() {
      int a=5;
      int b=15;
      int c;
       c = a + b;
       if (c>=0){
       System.out.println("Сумма положительная и равна " + c);}
       else {System.out.println("Сумма отрицательная и равна " + c); }   }

    public static void printColor(){
    int a=101;
    if (a<=0){System.out.println("красный"); }
    else if (a>0 && a<=100){System.out.println("жетлый"); }
    else {System.out.println("зеленый");}
    }

    public static void compareNumbers(){
        int a=5;
        int b=10;
        if (a>=b){System.out.println("a>=b");}
        else {System.out.println("a<b");}
    }
}
