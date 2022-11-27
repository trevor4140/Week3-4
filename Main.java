import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrAges = {3, 9, 23, 64, 2, 8, 28, 93};
        int firstMinusLast = arrAges[0] - arrAges[arrAges.length - 1];
        System.out.println(firstMinusLast);
        int[] newArrAges = {26};
        int[] combinedAges = new int[arrAges.length + newArrAges.length];
        for (int i = 0; i < arrAges.length; i++) {
            combinedAges[i] = arrAges[i];
        }
        for (int i = 0; i < newArrAges.length; i++) {
            combinedAges[arrAges.length + i] = newArrAges[i];
        }
        for (int i = 0; i < combinedAges.length; i++) {
            System.out.println(combinedAges[i]);
        }
        int zeroMinusLast = combinedAges[0] - combinedAges[combinedAges.length - 1];
        System.out.println(zeroMinusLast);

        // on to problem #2.
        String[] arrNames = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        String combinedNames = "";
        for (int i = 0; i < arrNames.length; i++) {
            combinedNames = combinedNames.concat(arrNames[i]);
        }
        System.out.println(combinedNames);
        int averageLength = 0;
        for (int i = 0; i < arrNames.length; i++) {
            averageLength += arrNames[i].length();
        }
        System.out.println(averageLength / arrNames.length);
        //Print out first name in array by doing System.out.println(arrName[0];
        //Print out last name in array by doing System.out.println(arrName[arrName.length - 1]);
        // On to question # 5
        int[] nameLength = new int[arrNames.length];
        int totalLength = 0;
        for (int i = 0; i < nameLength.length; i++) {
            nameLength[i] = arrNames[i].length();
        }
        for (int i = 0; i < nameLength.length; i++) {
            totalLength += nameLength[i];
        }
        System.out.println(totalLength);
        //Start of methods//
        System.out.println(nameMultiplier());
        System.out.println(nameCombiner());
        System.out.println(oneHundred());
        System.out.println(doubleAverage());
        if (doubleAverage() > whichDoubleIsBigger()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(willBuyDrink());
        System.out.println(goodDay());
    }

    private static String nameMultiplier() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter your word:");
        String word = scanner2.nextLine();
        System.out.print("Please enter the amount of times you want the word to appear:");
        int amountOfTimes = scanner2.nextInt();
        String wordMultiplier = word.repeat(amountOfTimes);
        return wordMultiplier;
    }

    private static String nameCombiner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first name:");
        String firstName = scanner.nextLine();
        System.out.print("Please enter last name:");
        String lastName = scanner.nextLine();
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    private static int oneHundred() {
        int[] questionNine = {1, 10, 20, 30, 40};
        int totalForNine = 0;
        for (int i = 0; i < questionNine.length; i++) {
            totalForNine += questionNine[i];
        }
        if (totalForNine >= 100) {
            System.out.print("True: the total is ");
        } else {
            System.out.print("False: the total is ");
        }
        return totalForNine;
    }

    private static double doubleAverage() {
        double[] doubleArray = {0.99, 1.99, 2.99, 3.99};
        double sumOfDouble = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            sumOfDouble += doubleArray[i];
        }
        double averageOfDouble = (sumOfDouble / 4);
        return averageOfDouble;
    }

    private static double whichDoubleIsBigger() {
        double[] doubleArrayTwo = {1.99, 2.99, 3.99, 4.99};
        double doubleSumTwo = 0;
        for (int i = 0; i < doubleArrayTwo.length; i++) {
            doubleSumTwo += doubleArrayTwo[i];
        }
        double averageOfDoubleTwo = (doubleSumTwo / 4);
        return doubleSumTwo;
    }

    private static boolean willBuyDrink() {
        Scanner hotOutside = new Scanner(System.in);
        System.out.println("Is is hot outside?");
        boolean isHotOutside = hotOutside.nextBoolean();
        System.out.println("How much money do you have?");
        double moneyInPocket = hotOutside.nextDouble();
        if (isHotOutside == true && moneyInPocket >= 10.50) {
            return true;
        } else
        {
            return false;
        }
    }
    private static String goodDay() {
        String goodDay = "I hope you had a great Thanksgiving!";
        return goodDay;
    }
}
