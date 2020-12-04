package com.hz;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Console();

        Card postCard = new PostCard(printer);
        Card xMasCard = new XmasCard(printer);
        Card highSchoolGraduationCard = new HighSchoolGraduationCard(printer);
        postCard.print();
        xMasCard.print();
        highSchoolGraduationCard.print();
    }
}