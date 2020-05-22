package com.company;

public class Variables {

    public static void main(String[] args) {

        System.out.println("hello world");

        //Integer types variables - tam sayı değişkenleri

        byte number = 10; //1 byte: -128 to 127
        System.out.println("byte type number: " + number);

        short number2 = 200; // 2 byte: -32,768 to 32,767
        System.out.println("short type number: " + number2);

        int number3 = 100000; // 4 byte: -2,147,483,648 to 2,147,483,647
        System.out.println("int type number: " + number3);

        long number4 = 1000000000; //8 byte: -9,223,372,836,854,775,808 to -9,223,372,836,854,775,807
        System.out.println("long type number: " + number4);

        //floating types variables - ondalıklı sayı değişkenleri

        float number5 = 5.75f; //4 bytes 7 decimal digits
        System.out.println("floating type number:" + number5);

        double number6 = 19.99; //8 bytes 16 decimal digits
        System.out.println("double type number:" + number6);

        // character type variable - karakter tip değişkeni

        char grade = 'A';
        System.out.println("character type grade" + grade);

        // logical data types - mantıksal veri tipi

        boolean isCorrect = true;
        System.out.println("boolean type number :" + isCorrect);
        isCorrect= false;
        System.out.println("boolean type number :" + isCorrect);

        // strings - metinsel veri tipi

        System.out.println("************************");
        String firstName = "hatice";
        System.out.println("fistname:" + firstName);
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a" +
                " galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was " +
                "popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of " +
                "Lorem Ipsum";

        System.out.println(text.toUpperCase()); //uppercase tüm hartleri büyük harfe çevirir
        System.out.println(text.toLowerCase()); // lowercase tüm hafrleri küçük harfe çevirir
        System.out.println(text.contains("and")); // contains içerisinde verilen kelimenin var olup olmadığını söyler
        System.out.println(text.isEmpty()); //metinsel ifadenin içi boş mu değil mi onu sorgular
        System.out.println(text.length()); //karakter sayısını verir




    }
}
