/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package advstatmp1;

import java.util.ArrayList;

/**
 *
 * @author Mikee
 */
public class STSTATProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        HypergeometricProbability hp = new HypergeometricProbability();
        System.out.println("Hypergeometric Probability: " + hp.computeHypergeometricProbability(40, 5, 3, 1));//sample
        int x[] = {1,2,3,4,5}; 
        int a[] = {1,2,3,4,5};
        
        System.out.println("Multivariate Hypergeometric Probability: " + hp.computeMultivariateHypergeometricProbability(a, x, 10, 5));//sample
        */
        
        CalculatorView c = new CalculatorView();
        c.setVisible(true);
    }
}
