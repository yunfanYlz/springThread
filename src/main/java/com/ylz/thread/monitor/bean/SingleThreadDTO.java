package com.ylz.thread.monitor.bean;

import java.io.Serializable;

public class SingleThreadDTO implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1209209181816065658L;
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "SingleThreadDTO [text=" + text + "]";
	}
	
}
