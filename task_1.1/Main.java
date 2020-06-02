  
/* 
Напиши программу, которая в методе main объявляет такие переменные:
name типа String, age типа int и city типа String.
Примечание: "объявить переменную" - значит то же, что и "создать переменную".
Требования:
•
Объяви переменную name типа String.
•
Объяви переменную age типа int.
•
Объяви переменную city типа String.
•
Должны быть объявлены 3 переменные.
*/


# Task1
package com.company;

public class Main {

    public static void main(String[] args) {
	String name = "Ksenia";
	int age = 28;
	String city = "Moscow";
        System.out.println("My name "+name+" - "+age+" age");
        System.out.println("I live in "+city);

    }
}
