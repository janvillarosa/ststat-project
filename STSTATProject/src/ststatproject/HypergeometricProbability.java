package ststatproject;

import java.math.BigInteger;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class HypergeometricProbability{

	//input x, n, N, k
	//or input x0,...,xk, a0,...,ak, n, N
	
	public BigInteger computeFactorial(int num){
	
		BigInteger factorial = BigInteger.valueOf(1);
		
		for(int i=1; i<=num;i++){
                    factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}
	
	public double computeCombination(int n, int r){
	
                BigInteger combination = computeFactorial(n);
                combination = combination.divide(computeFactorial(r).multiply(computeFactorial(n-r)));
		return combination.doubleValue();

	}
	
	public double computeHypergeometricProbability(int N, int n, int k, int x){
	
		return (computeCombination(k,x)*computeCombination(N-k,n-x))/computeCombination(N,n);
	}
		
	public double computeMultivariateHypergeometricProbability(int a[], int x[], int N, int n){
	
		double numerator = 1;
		
		for(int i=0; i < x.length;i++){
			numerator *= computeCombination(a[i],x[i]);
		}
		
		return numerator/computeCombination(N,n);
	}
        
        public double computeTotalProbability(double[] probabilities){
            
            double total = 0.0;
            for(int i = 0; i< probabilities.length; i++){
                total += probabilities[i];
            }
            
            return total;
        }

        public DefaultTableModel getTabularForm(double[] probabilities, int[] x){
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("x");
            
            for(int i = 0; i< x.length; i++){
                model.addColumn(""+x[i]);
            }
            
            ArrayList<String> p = new ArrayList(); 
            p.add("f(x)");
            for(int i = 0; i< probabilities.length; i++){
                p.add(""+probabilities[i]);
            }
            String[] row = p.toArray(new String[p.size()]);
            model.addRow(row);
            
            return model;
        }
}