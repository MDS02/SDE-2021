package com.hz;

public class XmasCard extends Card {

    public XmasCard(Printer printer) {
        super(printer);
    }

    void printFooter() {
        this.printer.printLine("/////////////////////////////////////////");
    }

    void printImage() {
        this.printer.printLine("     o   o");
        this.printer.printLine("      )-(");
        this.printer.printLine("     (O O)");
        this.printer.printLine("     \\=/");
    }

    void printMessage() {
        this.printer.printLine("Merry Kersemus");
    }

    void printHeader() {
        this.printer.printLine("/////////////////////////////////////////");
    }

}