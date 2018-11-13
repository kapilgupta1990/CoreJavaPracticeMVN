import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.jws.soap.SOAPBinding;

class CustomCallAble implements Callable<Integer>{

	int i;
	public CustomCallAble(int i){
		this.i=i;
	}
	@Override
	public Integer call() throws Exception {
		System.out.println("Thread name "+Thread.currentThread().getName());
		return 10/i;
	}
	
}
public class FutureThrowsException {
	public static void main(String[] args) {
		
		ConcurrentHashMap chm;

		ExecutorService executor=Executors.newFixedThreadPool(4);
		List<Future> futureList=new ArrayList<>();
		futureList.add(executor.submit(new CustomCallAble(1)));
		futureList.add(executor.submit(new CustomCallAble(2)));
		futureList.add(executor.submit(new CustomCallAble(0)));
		futureList.add(executor.submit(new CustomCallAble(5)));
		executor.shutdown();
		for(Future<Integer> future: futureList){
			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Final");
	}
}
