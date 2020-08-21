/**
 * 
 */
package job.hirist.social;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import job.hirist.social.inputJson.Cycle;

/**
 * @author Jaskiran
 *
 */
public class ProdConsWithES {
	 public static void main(String args[]) {		
	        ExecutorService pes = Executors.newFixedThreadPool(5);
	        ExecutorService ces = Executors.newFixedThreadPool(5);
	        Consumer[] consumers = new Consumer[5];
	        for(int i =0;i<5;i++) {
	        	BlockingQueue<Cycle> sharedQueue = new LinkedBlockingQueue<Cycle>(200);//1000
	        	pes.execute(new Producer(sharedQueue, i));
	        	consumers[i] = new Consumer(sharedQueue, i);
	        	ces.execute(consumers[i]);
	        }
	        pes.shutdown();
	        ces.shutdown();
	        
	    }
}
