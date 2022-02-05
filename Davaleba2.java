package firstPackage;

import java.util.ArrayList;

public class Davaleba2 {
    public static void main(String[] args) {
        //1.დაბეჭდდეთ კენტი რიცხვები 0-დან 30-ის ჩათვლით

        for (int i=1; i<= 30; i +=2){
            System.out.println(i);
}

        //2. დაბეჭდეთ რენდომ რიცხვები 0-დან 100-მდე, სავალდებულო ერ არის,რომ მთელი რიცხვები იყოს

        for(int i=0; i < 5 ; i++){
            System.out.println("Random Number "+ (i+1) + " - " + (int)(Math.random()*100));
        }


        //3. შექმენით double ტიპის მასივი და დაითვალეთ მასივის საშუალო არითმეტიკული (საშუალო არითმეტიკული =
        // ელემენტების ჯამი/ელემენტების რაოდენობასთან)
        int [] arr  = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Sum = " + sum / arr.length);




        //4. დაწერეთ ინტეჯერების მასივი და იპოვეთ ამ მასივში მინიმალური ელემენტი, არ გამოიყენოთ სორტირება;
        // მეორე ArrayList გააკეთეთ ეს ამოცანა;

        int [] arr_1  = new int [] {25, 11, 7, 75, 56};
        int min = arr_1[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr_1[i] <min)
                min = arr_1[i];
        }
        System.out.println(" მინიმალური ელემენტია: " + min);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(25);
        numbers.add(11);
        numbers.add(7);
        numbers.add(75);
        numbers.add(56);
        int minimum = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (minimum > numbers.get(i))
                minimum = numbers.get(i);
        }
        System.out.println(" მინიმალური ელემენტია = " + minimum);
    }
}
