package com.company;


import java.util.Locale;

public class Proverka {


    public int pr1 = 0, pr2 = 0, pa1 = 0, pa2 = 0, peremennayaN = 0;
    public boolean pr1b = false, pr2b = false, pa1b = false, pa2b = false;

    public int prov(String tempProv) {


        //int codoshibkiper = 0;
        String str1 = "", str2 = "";

        int  opi = 0;
        int colichestvoPer = 0;// значения, что бы не нароком не получить ошибку null

        tempProv = tempProv.replaceAll("[ ]", "");//удаляем все пробелы

        char[] chars = tempProv.toCharArray();//с массивом символов возможно костыль

        for (int i = 0; i < chars.length; i = i + 1) {
            switch (chars[i]) {
                case '+' -> {
                    opi = i;
                    peremennayaN = 1;
                    colichestvoPer++;
                }
                case '-' -> {
                    opi = i;
                    peremennayaN = 2;
                    colichestvoPer++;
                }
                case '*' -> {
                    opi = i;
                    peremennayaN = 3;
                    colichestvoPer++;
                }
                case '/' -> {
                    opi = i;
                    peremennayaN = 4;
                    colichestvoPer++;
                }
            }
        }//ищем операторы и их положение

        if (colichestvoPer==0) {return 8;}

        if (colichestvoPer == 1) {
            str1 = tempProv.substring(0, opi);
            str2 = tempProv.substring(opi + 1);
        }  //если оператор один, делим им строку на операнды

        if (colichestvoPer > 1) {
            //codoshibkiper = 1;
            //System.out.println("ошибка" + codoshibkiper);
            return 1;
        }// если операторов больше одного, выходим с ошибкой 1

        if ((str1 == "" & str2 == "") & colichestvoPer == 1) {
            //codoshibkiper = 2;
            //System.out.println("ошибка" + codoshibkiper);
            return 2;
        }// если есть оператор но нет операндов ошибка 2

        if ((str1 == "" | str2 == "") & colichestvoPer == 1) {
            //codoshibkiper = 3;
            //System.out.println("ошибка" + codoshibkiper);
            return 3;
        }// если один оператор и один операнд ошибка 3

        str1 = str1.toLowerCase(Locale.ROOT);//делаем кулькулятор не чувствительным к регистру
        str2 = str2.toLowerCase(Locale.ROOT);

        if (str1.matches("(i)||(ii)||(iii)||(iv)||(v)||(vi)||(vii)||(viii)||(ix)||(x)")) {
            pr1 = switch (str1) {
                case "i" -> 1;
                case "ii" -> 2;
                case "iii" -> 3;
                case "iv" -> 4;
                case "v" -> 5;
                case "vi" -> 6;
                case "vii" -> 7;
                case "viii" -> 8;
                case "ix" -> 9;
                case "x" -> 10;
                default -> pr1;
            };
            pr1b = true;
        }//ищем в строках римские цифры
        if (str2.matches("(i)||(ii)||(iii)||(iv)||(v)||(vi)||(vii)||(viii)||(ix)||(x)")) {
            pr2 = switch (str2) {
                case "i" -> 1;
                case "ii" -> 2;
                case "iii" -> 3;
                case "iv" -> 4;
                case "v" -> 5;
                case "vi" -> 6;
                case "vii" -> 7;
                case "viii" -> 8;
                case "ix" -> 9;
                case "x" -> 10;
                default -> pr2;
            };
            pr2b = true;
        }

        if (peremennayaN == 2 & pr1 - pr2 < 0) {
            //codoshibkiper = 6;
            //System.out.println("ошибка" + codoshibkiper);
            return 6;
        }// проверяем разность римских чисел, про ноль в римских числах ничего нет в тех задании, надо уточнять выходим с ошибкой 6

        if (str1.matches("-?\\d+(\\.\\d+)?")) {
            pa1 = Integer.parseInt(str1);
            pa1b = true;
        }//проверяем строки на наличие чисел
        if (str2.matches("-?\\d+(\\.\\d+)?")) {
            pa2 = Integer.parseInt(str2);
            pa2b = true;
        }

        if ((pr1b | pr2b) & (pa1b | pa2b)) {
            //codoshibkiper = 4;
            //System.out.println("ошибка" + codoshibkiper);
            return 4;
        }// проверяем системы исчисления

        if (pa1 > 10 | pa2 > 10) {
            //codoshibkiper = 5;
            //System.out.println("ошибка" + codoshibkiper + "-" + pa1 + pa2);
            return 5;
        }// проверяем число на величину

        if ((!pr1b | !pr2b) & (!pa1b | !pa2b)) {
            //codoshibkiper = 7;
            //System.out.println("ошибка" + codoshibkiper);
            return 7;
        }// если не находим двух подходящих переменных ошибка 7


        return 0;
    }
}

