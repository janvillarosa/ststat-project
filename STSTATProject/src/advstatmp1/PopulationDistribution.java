/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package advstatmp1;

import java.util.ArrayList;

/**
 *
 * @author janvillarosa
 */
public class PopulationDistribution {
    
        private ArrayList<Integer> population;
        
        public void generateUniformPopulation(int lower, int upper, int N){
            
            int number=(int)Math.random()%upper+lower;
            
            for(int i=0; i<N; i++){
                population.add(number);
            }
            
        }
        
        public void generateRandomPopulation(int lower, int upper, int N){
            
            for(int i=0; i<N; i++){
                population.add((int)Math.random()%upper+lower);
            }
            
        }
        
        public void generateNormalPopulation(int lower, int upper, int N){
            
            for(int i=0; i<N; i++){
                population.add((int)Math.random()%upper+lower);
            }
        }
    
}
