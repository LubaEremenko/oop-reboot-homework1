package com.company;

public class TestDriver {
    public static void run(){
        testApple();
        testBag();
        testBoard();
        testBook();
        testPencil();
    }

    private static void testApple(){
        Apple a = new Apple("Granny Smith");
        System.out.println("Apple variety is " + a.getVariety());

        Apple ap = new Apple("Spain");
        System.out.println("Apple produced in " + ap.getManufacturer());
    }

    private static void testBag(){
        Bag b = new Bag("leather");
        System.out.println("This bag made of " + b.getMadeOf());

    }
    private static void testBoard(){
        Board bd = new Board("black");
        System.out.println("Board has "  + bd.getColour() + " colour");

    }

    private static void testBook(){
        Book bk = new Book("Armageddon");
        System.out.println("Title of the book is " + bk.getName());

        Book bka = new Book("Tim Lahaye");
        System.out.println("The book was written by " + bka.getAuthor());

    }
    private static void testPencil(){
        Pencil p = new Pencil("blue");
        System.out.println("Only " + p.getColour() + " pencils are on sale");


    }

}
