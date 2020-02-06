package pe.lacafetalab.dddbase.application;

public interface CommandHandlerBase<T extends CommandBase> {
	
	public void execute(T command);
	
}
