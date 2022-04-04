package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); //возникает ошибка деления на 0 т.к. b = 0 в 10 строке

        calc.println.accept(c);
	// write your code here
    }
}
