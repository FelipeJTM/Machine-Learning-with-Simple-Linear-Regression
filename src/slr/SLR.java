/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slr;

import java.util.Scanner;

/**
 *
 * @author ftm
 */
public class SLR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataSet Data = new dataSet();
        final double[][] dataset = Data.getDummyData();
        LinearRegresion SLP;
        double x = -1;

        System.out.println("Advertising Value: ");
        try {
            x = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Error: incorrect data type, Expected type number");
        }
        if (x >= 0) {
            SLP = new LinearRegresion(dataset, x);
            SLP.RE();
            SLP.PrintYH();
        }
    }

}
