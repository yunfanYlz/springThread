package com.ylz.thread.monitor.impl;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.ylz.thread.monitor.AbstractThreadPoolMonitor;
import com.ylz.thread.monitor.bean.ThreadMonitorBean;



/**
 * 默认线程监控程序
 * 注入线程池对象  executor,
 * 完成定时打印线程池数据
 * 
 * @author  Administrator
 * @version  [版本号, 2015-8-23]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class DefaultThreadPoolMonitor extends AbstractThreadPoolMonitor<ThreadMonitorBean> implements InitializingBean,
    DisposableBean, Runnable
{    
	private static final Log log = LogFactory.getLog("threadAnalyzeLog");
    
    private Integer monitoringPeriod;
    
    private static boolean flag = true;
    
    /**
     * 通过使用quartz完成注册，定时打印日志
     * <功能详细描述>
     * @see [类、类#方法、类#成员]
     */
    public void action()
    {
        ThreadMonitorBean bean = execute();
        log.info(bean);
    }
    
    /**
     * 线程执行方法
     */
    @Override
    public ThreadMonitorBean execute()
    {
        ThreadMonitorBean bean = new ThreadMonitorBean();
        if (executor != null && !executor.getThreadPoolExecutor().isShutdown())
        {
            ThreadPoolExecutor poolExecutor = executor.getThreadPoolExecutor();
            bean.setActiveCount(poolExecutor.getActiveCount());
            bean.setCompletedTaskCount(poolExecutor.getCompletedTaskCount());
            bean.setCorePoolSize(poolExecutor.getCorePoolSize());
            bean.setIsTerminated(poolExecutor.isTerminated());
            bean.setKeepAliveTime(poolExecutor.getKeepAliveTime(TimeUnit.SECONDS));
            bean.setLargestPoolSize(poolExecutor.getLargestPoolSize());
            bean.setMaximumPoolSize(poolExecutor.getMaximumPoolSize());
            bean.setPoolSize(poolExecutor.getPoolSize());
            bean.setTaskCount(poolExecutor.getTaskCount());
            bean.setQueueSize(poolExecutor.getQueue().size());
        }
        return bean;
    }
    
    @SuppressWarnings("static-access")
	@Override
    public void destroy()
        throws Exception
    {
        this.flag = false;
        System.out.println("destroy init ");
    }
    
    @Override
    public void afterPropertiesSet()
        throws Exception
    {
        Thread thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void run()
    {
        try
        {
            while (flag)
            {
                log.info(execute().toString());
                Thread.sleep(monitoringPeriod * 1000);
            }
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
        
    }
    
    public Integer getMonitoringPeriod()
    {
        return monitoringPeriod;
    }
    
    public void setMonitoringPeriod(Integer monitoringPeriod)
    {
        this.monitoringPeriod = monitoringPeriod;
    }
    
}
