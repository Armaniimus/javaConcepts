import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class forloop {
    public static void main(String args[]) {
//        forLoop();
//        RegularWhileLoop();
//        RandomWhileLoop();
//        GetPriemGetalv1();
        randomNumbersInArray();
    }

    public static void forLoop () {
        System.out.println("for loop");
        int i;
        int nr = 9;

        for (i=1; i <= 10; i++ ){
            System.out.println("    " + i + "x" + nr + " = " + i*nr);
        }
    }

    public static void RandomWhileLoop () {
        int i = 0;
        int nr = 9;
        int y = 0;

        System.out.println("");
        System.out.println("RandomWhileLoop");

        while(i<3) {

            int randomNumber = ThreadLocalRandom.current().nextInt(0, 999999 + 1);

            if((randomNumber%2)==0) {
                i++;
                System.out.println("    " + randomNumber);
            } else {
                y++;
                System.out.println("    " + y + " times not even");
            }
        }
    }

    public static void RegularWhileLoop() {
        int i = 1;
        int nr = 9;

        System.out.println("");
        System.out.println("RegularWhileLoop");
        while(i<=10) {
            System.out.println("   "+ i + "x" + nr + " = " + nr*i);
            i++;
        }
    }

    public static void GetPriemGetalv1() {

        int priemGetalNr = 2;
        int huidigGetal = 3;
        int aantalPriemgetallen = 10000000;

        System.out.println("GetPriemGetal");
        System.out.println("    2 is het 1ste priemgetal");

        while(priemGetalNr <= aantalPriemgetallen) {
            int devider = 3;

//          devide the number in 2 if even then skip the number
            if ((huidigGetal%2) == 0) {
                huidigGetal++;
            }

//          Get the root of the current number
            long maxDevider = Math.round(Math.sqrt(huidigGetal)+0.5);
//            int maxDevider = (huidigGetal+1)/2;

            boolean NotCheckedAllNr = true;

            while (NotCheckedAllNr) {

                if (devider >= maxDevider) {
                    //break the loop
                    NotCheckedAllNr = false;

                    priemGetalNr++;
                    System.out.println("    " + huidigGetal + " is het " + (priemGetalNr-1) + "ste priemgetal");

                } else {
                    if ((huidigGetal%devider) == 0) {
                        NotCheckedAllNr = false;
                    } else {
                        devider++;
                    }
                }
            }

            huidigGetal++;
        }
    }


    public static void randomNumbersInArray() {
        ArrayList beaconsArray = new ArrayList();
        System.out.println("initial size of al: " + beaconsArray.size());

        int whileCount = 0;

        while(whileCount < 10) {

            int randomNumber = ThreadLocalRandom.current().nextInt(0, 99999999 + 1);

            if(randomNumber < 1000) {
                beaconsArray.add(randomNumber);
                whileCount++;
            }
        }

        int forCount = beaconsArray.size();
        int smallestItem = (int) beaconsArray.get(0);
        int indexNr = 0;
        int countSameRes = 0;
        int amountOfRuntimes = 0;

        while(countSameRes < 4) {
            for (int i = 0; i < forCount; i++) {

                if ((int) beaconsArray.get(i) < smallestItem) {
                    smallestItem = (int) beaconsArray.get(i);
                    indexNr = i;
                    countSameRes = 0;
                }

                System.out.println(i + "->" + beaconsArray.get(i));
            }
            countSameRes++;
            amountOfRuntimes++;
        }
        System.out.println("amountOfRuntimes = " + amountOfRuntimes);
        System.out.println("smallest item = " + smallestItem);
        System.out.println("smallest item indexNr = " + indexNr);
        System.out.println("end size of the arrayList = " + beaconsArray.size());
    }
}