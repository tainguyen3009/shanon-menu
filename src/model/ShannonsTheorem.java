package model;

/**
 * class that implements "model" for an MVC application that calculates Shannon's Theorem
 * @author kriger, yapt
 */
public class ShannonsTheorem {
    private double bandWidth;
    private double signalPower;
    private double noisePower;
    /**
     * multi-argument constructor
     * @param bandWidth the bandwidth in hertz
     * @param signalPower signal power in watts
     * @param noisePower noise power in watts
     */
    public ShannonsTheorem(double bandWidth, double signalPower, double noisePower) {
        this.bandWidth = bandWidth;
        this.signalPower = signalPower;
        this.noisePower = noisePower;
    }
    /**
     * no-arg constructor sets fields to zero
     */
    public ShannonsTheorem() {
	this(0.0, 0.0, 0.0);
    }
    /**
     * @return the bandWidth
     */
    public double getBandWidth() {
    	return bandWidth;
    }
    /**
     * @param bandWidth the bandWidth to set
     */
    public void setBandWidth(double bandWidth) {
        this.bandWidth = bandWidth;
    }
    /**
     * @return the signal power
     */
    public double getSignalPower() {
    	return signalPower;
    }
    /**
     * @param signalPower the signal power to set
     */
    public void setSignalPower(double signalPower) {
	this.signalPower = signalPower;
    }
    /**
     * @return the noise power
     */
    public double getNoisePower() {
	return noisePower;
    }
    /**
     * @param noisePower the noise power to set
     */
    public void setNoisePower(double noisePower) {
	this.noisePower = noisePower;
    }
	
    private double log2(double x) {
	return Math.log(x)/Math.log(2);
    }
	
    /**
     * @param bandWidth the bandwidth
     * @param signalPower the signal power
     * @param noisePower the noise power
     * @return maximum data rate
     */
    public double calculateResultField(double bandWidth, double signalPower, double noisePower) {
        return bandWidth * log2(1 + signalPower / noisePower);
    }
	
    /**
     * @return maximum data rate
     */
    public double calculateResultField() {
        return calculateResultField(bandWidth, signalPower, noisePower);
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    /**
     * @return string for output
     */
    @Override
    public String toString() {
	return "ShannonsTheory [bandWidth=" + bandWidth + ", signalPower=" + signalPower + ", noisePower=" + noisePower + "]";
    }
	
}
