// Владилен Д Ш
// springs@yandex.ru
// 8 983 299 92 99
//
package com.company;


public class Main {

    public static void main(String[] args) {


        int reshenie=0;

        Vvod vvod1 = new Vvod();                //Создаем экземпляры классов
        Proverka proverka1 = new Proverka();
        Reshenie reshenie1 = new Reshenie();    //этот класс для расширения приложения
        Vivod vivod1 = new Vivod();             //этот класс для расширения приложения
        conv conv1 = new conv();

        String tempTxt = vvod1.getText1(); // считываем строку используя метод класса ввод1

        if(tempTxt.isEmpty()){ System.out.println("String is empty. Пустая строка.");return;} //проверка на пустую строку

        switch (proverka1.prov(tempTxt)) {
            case 1 -> System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            case 2 -> System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            case 3 -> System.out.println("throws Exception //т.к. строка не является математической операцией");
            case 4 -> System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
            case 5 -> System.out.println("throws Exception //т.к. превышем предел значения переменой");
            case 6 -> System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
            case 7 -> System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда(римских или арабских) и один оператор (+, -, /, *)");
            case 8 -> System.out.println("throws Exception //т.к. строка не является математической операцией");
        } //наши исключения

        if (proverka1.pa1b&proverka1.pa2b) {

            switch (proverka1.peremennayaN) {
                case 1 -> {
                    reshenie = proverka1.pa1 + proverka1.pa2;
                    System.out.print(reshenie);
                }//+
                case 2 -> {
                    reshenie = proverka1.pa1 - proverka1.pa2;
                    System.out.print( reshenie);
                }//-
                case 3 -> {
                    reshenie = proverka1.pa1 * proverka1.pa2;
                    System.out.print(reshenie);
                }//*
                case 4 -> {
                    reshenie = proverka1.pa1 / proverka1.pa2;
                    System.out.print(reshenie);
                }//  /
            }
        }

        if (proverka1.pr1b&proverka1.pr2b) {

            switch (proverka1.peremennayaN) {
                case 1 -> {
                    reshenie = proverka1.pr1 + proverka1.pr2;
                    System.out.print(conv1.arabtorim(reshenie));
                }//+
                case 2 -> {
                    reshenie = proverka1.pr1 - proverka1.pr2;
                    System.out.print(conv1.arabtorim(reshenie));
                }//-
                case 3 -> {
                    reshenie = proverka1.pr1 * proverka1.pr2;
                    System.out.print(conv1.arabtorim(reshenie));
                }//*
                case 4 -> {
                    reshenie = proverka1.pr1 / proverka1.pr2;
                    System.out.print(conv1.arabtorim(reshenie));
                }//  /
            }
        }
    }


}
