/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slr;

/**
 *
 * @author ftm
 */
public class LinearRegresion {

    private double dataset[][];
    private double sumxi, sumyi, sumxyi, sumxsqi, x;

    public LinearRegresion(double[][] dataset, double x) {
        this.dataset = dataset;
        this.x = x;
        Generate();
    }

    //this is the summatory
    private void Generate() {
        for (int i = 0; i < dataset.length; i++) {
            ///sumatoria de sales
            sumyi += dataset[i][0];
            //sumatoria de advertising
            sumxi += dataset[i][1];
            //sumatoria de advertising^2
            sumxsqi += dataset[i][1] * dataset[i][1];
            //sumatoria de sales x advertising
            sumxyi += dataset[i][1] * dataset[i][0];
        }
    }

    private double B0() {
        return (sumxsqi * sumyi - sumxi * sumxyi) / (dataset.length * sumxsqi - (sumxi * sumxi));
    }

    private double B1() {
        return (dataset.length * sumxyi - sumxi * sumyi) / (dataset.length * sumxsqi - (sumxi * sumxi));
    }

    private double CalculateYH() {
        //B0 + B1 x newAdvertising
        return (B0() + B1() * x);
    }

    //regresion ecuation
    public void RE() {
        System.out.println("Y^ =" + B0() + "+" + B1() + "(" + x + ")");
    }

    public void PrintYH() {
        System.out.println("Y^ =" + CalculateYH());
    }

}
