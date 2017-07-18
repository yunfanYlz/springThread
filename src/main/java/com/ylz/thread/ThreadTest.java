package com.ylz.thread;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.ylz.thread.monitor.ExportProcessThread;

public class ThreadTest {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					new String[] { "spring-config.xml" });
			context.start();
			
			ThreadPoolTaskExecutor threadExecutor = (ThreadPoolTaskExecutor) context.getBean("threadPoolTaskExecutor");
			
			ExportProcessThread thread = new ExportProcessThread();
			threadExecutor.execute(thread);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error-------------");
			e.printStackTrace();
			System.exit(0);
		}
	}
}
