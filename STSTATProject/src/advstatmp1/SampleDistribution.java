package advstatmp1;

import java.math.BigInteger;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class SampleDistribution{

	//input x, n, N, k
	//or input x0,...,xk, a0,...,ak, n, N
        private ArrayList<Integer> population;
        
	
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
        
        public double computeTotalProbability(double[] probabilities){
            
            double total = 0.0;
            for(int i = 0; i< probabilities.length; i++){
                total += probabilities[i];
            }
            
            return total;
        }
        
        public ArrayList generateRandomSample(int size){
            ArrayList<Integer> samples = new ArrayList();
            
            for(int i=0; i<size; i++){
                samples.add(population.get((int)Math.random()%population.size()));
            }
            
            return samples;
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
        
        public double computeStandardDeviation(float popSD, float n){
            
            double sd;
            sd = popSD/Math.sqrt(n);
            
            return sd;
        }
        
        public double computeZScore(float xbar, float mu,float popSD, float n){
            
            double zScore;
            zScore = (xbar-mu)/computeStandardDeviation(popSD,n);
            
            return zScore;
        }
        
        
}