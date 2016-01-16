package common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

public class StopWatchTest {
	
	private static Logger Logger = LoggerFactory.getLogger(StopWatchTest.class);

	public static void main(String[] args) throws InterruptedException {
		StopWatch stopWatch = new StopWatch("Stop Watch");

		stopWatch.start("initializing");
		Thread.sleep(1000);
		stopWatch.stop();

		Logger.debug("took " + stopWatch.getLastTaskTimeMillis() + " ms");

		stopWatch.start("processing");
		Thread.sleep(2000);
		stopWatch.stop();
		Logger.debug("took " + stopWatch.getLastTaskTimeMillis() + " ms");
		  
		stopWatch.start("finalizing");
		Thread.sleep(3000);
		stopWatch.stop();
		Logger.debug("took " + stopWatch.getLastTaskTimeMillis() + " ms");
		  
		Logger.debug(stopWatch.toString());

		LogUtil.info("MONITOR", stopWatch.prettyPrint());
	}
}
