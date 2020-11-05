/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locker;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Student
 */
public class TestLocker {
    public static void main(String[] args) {
        Date firstTime = new Date();
         Date pickupTime = new Date();
            long diff = pickupTime.getTime() - firstTime.getTime();//as given
            long seconds = TimeUnit.MILLISECONDS.toSeconds(diff);
            System.out.println(seconds);
//        while(true) {
//            Scanner scanner = new Scanner(System.in);
//            scanner.nextInt();
//            Date d2 = new Date();
//            long diff = d2.getTime() - d1.getTime();//as given
//            long seconds = TimeUnit.MILLISECONDS.toSeconds(diff);
//            System.out.println(seconds);
//        }
       
    }
}
