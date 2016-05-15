/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.*;

/**
 *
 * @author rcjavier
 */
public class Num2Words {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = (int) (Long.parseLong(br.readLine()));

        cout(toWords999(num));
        br = null;
    }

    private static void cout(Object primitive) {
        // println shorthand
        System.out.println(primitive);
    }

    private static String toWords999(int num) {
        String retVal;

        // get below 100 part
        int tmp = num % 100;

        if (tmp < 11) {
            retVal = between1and10(tmp);
        } else if (tmp < 20) {
            retVal = between10and20(tmp);
        } else {
            retVal = between20and99(tmp);
        }

        // get the hundreds
        num /= 100;
        if (num > 0) {
            retVal = between1and10(num) + " hundred" + retVal;
        }

        return retVal;
    }

    private static String between20and99(int num) {

        String retVal = "";

        //get ones
        int tmp = num % 10;

        //get tens
        num = num - tmp;
        retVal = between20and100(num) + between1and10(tmp);
        return retVal;
    }

    private static String between1and10(int num) {
        String retVal = "";
        switch (num) {
            case 1:
                retVal = " one";
                break;
            case 2:
                retVal = " two";
                break;
            case 3:
                retVal = " three";
                break;
            case 4:
                retVal = " four";
                break;
            case 5:
                retVal = " five";
                break;
            case 6:
                retVal = " six";
                break;
            case 7:
                retVal = " seven";
                break;
            case 8:
                retVal = " eight";
                break;
            case 9:
                retVal = " nine";
                break;
            case 10:
                retVal = " ten";
        }

        return retVal;
    }

    private static String between20and100(int num) {

        String retVal = "";
        switch (num) {
            case 20:
                retVal = " twenty";
                break;
            case 30:
                retVal = " thirty";
                break;
            case 40:
                retVal = " forty";
                break;
            case 50:
                retVal = " fifty";
                break;
            case 60:
                retVal = " sixty";
                break;
            case 70:
                retVal = " seventy";
                break;
            case 80:
                retVal = " eighty";
                break;
            case 90:
                retVal = " ninety";
        }

        return retVal;
    }

    private static String between10and20(int num) {
        String retVal = "";
        switch (num) {
            case 11:
                retVal = " eleven";
                break;
            case 12:
                retVal = " twelve";
                break;
            case 13:
                retVal = " thirteen";
                break;
            case 14:
                retVal = " fourteen";
                break;
            case 15:
                retVal = " fifteen";
                break;
            case 16:
                retVal = " sixteen";
                break;
            case 17:
                retVal = " seventeen";
                break;
            case 18:
                retVal = " eighteen";
                break;
            case 19:
                retVal = " nineteen";
        }

        return retVal;
    }

}
