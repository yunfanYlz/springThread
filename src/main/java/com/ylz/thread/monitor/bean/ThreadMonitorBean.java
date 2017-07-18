package com.ylz.thread.monitor.bean;

public class ThreadMonitorBean
{
    // 当前线程数 
    private Integer poolSize;
    
    // 核心线程数
    private Integer corePoolSize;
    
    // 最大线程数
    private Integer maximumPoolSize;
    
    // 返回主动执行任务的近似线程数
    private Integer activeCount;
    
    // 已完成的线程数 
    private Long completedTaskCount;
    
    // 返回曾计划执行的近似任务总数  
    private Long taskCount;
    
    // 线程状态 
    private Boolean isTerminated;
    
    // 线程池维护线程所允许的空闲时间 
    private Long keepAliveTime;
    
    //获得执行中池中最大线程数 
    private Integer largestPoolSize;
    
    // 队列长度
    private Integer queueSize;
    
    public Integer getPoolSize()
    {
        return poolSize;
    }
    
    public void setPoolSize(Integer poolSize)
    {
        this.poolSize = poolSize;
    }
    
    public Integer getCorePoolSize()
    {
        return corePoolSize;
    }
    
    public void setCorePoolSize(Integer corePoolSize)
    {
        this.corePoolSize = corePoolSize;
    }
    
    public Integer getMaximumPoolSize()
    {
        return maximumPoolSize;
    }
    
    public void setMaximumPoolSize(Integer maximumPoolSize)
    {
        this.maximumPoolSize = maximumPoolSize;
    }
    
    public Integer getActiveCount()
    {
        return activeCount;
    }
    
    public void setActiveCount(Integer activeCount)
    {
        this.activeCount = activeCount;
    }
    
    public Long getCompletedTaskCount()
    {
        return completedTaskCount;
    }
    
    public void setCompletedTaskCount(Long completedTaskCount)
    {
        this.completedTaskCount = completedTaskCount;
    }
    
    public Long getTaskCount()
    {
        return taskCount;
    }
    
    public void setTaskCount(Long taskCount)
    {
        this.taskCount = taskCount;
    }
    
    public Boolean getIsTerminated()
    {
        return isTerminated;
    }
    
    public void setIsTerminated(Boolean isTerminated)
    {
        this.isTerminated = isTerminated;
    }
    
    public Long getKeepAliveTime()
    {
        return keepAliveTime;
    }
    
    public void setKeepAliveTime(Long keepAliveTime)
    {
        this.keepAliveTime = keepAliveTime;
    }
    
    public Integer getLargestPoolSize()
    {
        return largestPoolSize;
    }
    
    public void setLargestPoolSize(Integer largestPoolSize)
    {
        this.largestPoolSize = largestPoolSize;
    }

    public Integer getQueueSize() {
		return queueSize;
	}

	public void setQueueSize(Integer queueSize) {
		this.queueSize = queueSize;
	}

	@Override
    public String toString()
    {
        return "ThreadMonitorBean [poolSize=" + poolSize + ", corePoolSize=" + corePoolSize + ", maximumPoolSize="
            + maximumPoolSize + ", activeCount=" + activeCount + ", completedTaskCount=" + completedTaskCount
            + ", taskCount=" + taskCount + ", isTerminated=" + isTerminated + ", keepAliveTime=" + keepAliveTime
            + ", largestPoolSize=" + largestPoolSize + ", queueSize=" + queueSize + "]";
    }
    
}
