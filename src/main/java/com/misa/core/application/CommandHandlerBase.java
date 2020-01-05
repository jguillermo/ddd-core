package com.misa.core.application;

public interface CommandHandlerBase<T extends CommandBase> {
	
	public void execute(T command);
	
}
