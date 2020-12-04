package com.hz;

    public abstract class Card {

        protected Printer printer;

        public Card(Printer printer) {
            this.printer = printer;
        }

        public void print() {
            this.printHeader();
            this.printMessage();
            this.printImage();
            this.printFooter();
        }

        abstract void printFooter();
        abstract void printImage();
        abstract void printMessage();
        abstract void printHeader();

    }

