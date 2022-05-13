//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("output.txt");
        PrintWriter pw = new PrintWriter(file);
        Scanner scan = new Scanner(System.in);
        System.out.print("Конвертер информационных величин\n Введите кол-во ГБ/введите or для конвертации байтов \"or\" \n ");
        String number = scan.nextLine();
        if (number.equals("or")) {
            System.out.print("Конвертация байтов в Гб\n Введите кол-во байтов -  ");
            number = scan.nextLine();
            System.out.println(number + " байт(ов) = " + (double)Float.parseFloat(number) / 1073741824 + " Гб");
            pw.println(number + " байт(ов) = " + (double)Float.parseFloat(number) / 1073741824 + " Гб");
        } else {
            System.out.println(number + " Гб = " + (double)Float.parseFloat(number)* 1073741824 + " байт(ов)");
            pw.println(number + " Гб = " + (double)Float.parseFloat(number) * 1073741824 + " байт(ов)");
        }

        pw.close();
    }
}
