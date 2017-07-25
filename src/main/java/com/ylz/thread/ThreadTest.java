package com.ylz.thread;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ylz.thread.monitor.ThreadProcess;
import com.ylz.thread.monitor.bean.SingleThreadDTO;

public class ThreadTest {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					new String[] { "spring-config.xml" });
			context.start();
			
			ThreadProcess threadpool = (ThreadProcess) context.getBean("ThreadProcess");

			SingleThreadDTO dto = new SingleThreadDTO();
			dto.setText("test");
			threadpool.putInThreadPool(dto);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error-------------");
			e.printStackTrace();
			System.exit(0);
		}
	}
}
