/**
 * 
 */
package job.hirist.social.outputJson;

/**
 * @author Neeraj90
 *
 */
public class OutputChainAssembly {
	//prices for sub parts from DB or Service
	double aChain,bChain,cChain,dChain;

	/**
	 * @return the aChain
	 */
	public double getaChain() {
		return aChain;
	}

	/**
	 * @param aChain the aChain to set
	 */
	public void setaChain(double aChain) {
		this.aChain = aChain;
	}

	/**
	 * @return the bChain
	 */
	public double getbChain() {
		return bChain;
	}

	/**
	 * @param bChain the bChain to set
	 */
	public void setbChain(double bChain) {
		this.bChain = bChain;
	}

	/**
	 * @return the cChain
	 */
	public double getcChain() {
		return cChain;
	}

	/**
	 * @param cChain the cChain to set
	 */
	public void setcChain(double cChain) {
		this.cChain = cChain;
	}

	/**
	 * @return the dChain
	 */
	public double getdChain() {
		return dChain;
	}

	/**
	 * @param dChain the dChain to set
	 */
	public void setdChain(double dChain) {
		this.dChain = dChain;
	}
	public double getAllChainPartsPrice() {
		return aChain+bChain+cChain+dChain;
	}
}
