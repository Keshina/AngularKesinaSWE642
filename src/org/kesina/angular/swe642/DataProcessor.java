/**
 * 
 */
package org.kesina.angular.swe642;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author kesina
 * This class processes data and calculates mean and standard deviation
 * The mean and standard deviation functions used here are reused from web
 *
 */
public class DataProcessor {
		
	public static DataBean cal(String datum) { //include http request as param here
		
		DataBean d = new DataBean();
		String data = datum; //get the data, separate and send as array to std dev function
		String[] stringData = data.split(",");
		double[] dataList = new double[10];
		for(int i=0; i<stringData.length; i++) {
			dataList[i]= Double.parseDouble(stringData[i]);
		}
		d.setMean(mean(dataList));

		Double val = populationStandardDeviation(dataList);
		d.setStdDev(Math.round(val * 100.0) / 100.0);   //round off std-dev to 2 decimal value
		return d;
	}


	
	    
 /**
  * Standard deviation is a statistical measure of spread or variability.The
  * standard deviation is the root mean square (RMS) deviation of the values
  * from their arithmetic mean.
  *
  * <b>populationStandardDeviation</b> normalizes values by N, where N is the sample size. This the
  * <i>Population Standard Deviation</i>
  * @param values
  * @return
  */
 public static strictfp double populationStandardDeviation(double[] values) {
     double mean = mean(values);
     double n = values.length;
     double dv = 0;
     for (double d : values) {
         double dm = d - mean;
         dv += dm * dm;
     }
     return Math.sqrt(dv / n);
 }


 /**
  * Calculate the mean of an array of values
  *
  * @param values The values to calculate
  * @return The mean of the values
  */
 public static strictfp double mean(double[] values) {
     return sum(values) / values.length;
 }
 /**
  * Sum up all the values in an array
  *
  * @param values an array of values
  * @return The sum of all values in the Array
  */
 public static strictfp double sum(double[] values) {
     if (values == null || values.length == 0) {
         throw new IllegalArgumentException("The data array either is null or does not contain any data.");
     }
     else {
         double sum = 0;
         for (int i = 0; i < values.length; i++) {
             sum += values[i];
         }
         return sum;
     }
 }
}
