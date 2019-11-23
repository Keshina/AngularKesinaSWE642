/**
 * 
 */
package org.kesina.angular.swe642;

/**
 * @author kesina
 * DataBean to hold data, mean and standard deviation values
 *The DataBean has two attributes to hold the mean and standard deviation.
 */
public class DataBean {
	
private double mean;
private double stdDev;
private String data;
/**
 * @return the mean
 */
public double getMean() {
	return mean;
}
/**
 * @param d the mean to set
 */
public void setMean(double d) {
	this.mean = d;
}
/**
 * @return the stdDev
 */
public double getStdDev() {
	return stdDev;
}
/**
 * @param mean
 * @param stdDev
 * @param data
 */
public DataBean() {
}
/**
 * @param stdDev the stdDev to set
 */
public void setStdDev(double stdDev) {
	this.stdDev = stdDev;
}
/**
 * @return the data
 */
public String getData() {
	return data;
}
/**
 * @param data the data to set
 */
public void setData(String data) {
	this.data = data;
}


}
