package pl.artur.module.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import pl.artur.module.db.entity.Item;

public abstract class SenderServiceAbstract implements SenderService{
	
	public abstract void run(Item item);

	@Override
	public void sendItem(final Item item) {
		ExecutorService executor = Executors.newFixedThreadPool(1);
		executor.execute(() -> run(item));
		
	}
	
	

}
