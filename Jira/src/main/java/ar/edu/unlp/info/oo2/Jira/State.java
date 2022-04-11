package ar.edu.unlp.info.oo2.Jira;
import java.time.Duration;

public abstract class State {
	
	protected ToDoItem item;
	
	public State(ToDoItem anItem) {
		item = anItem;
	}
	
	protected abstract void start();
	protected abstract void togglePause();
	protected abstract void finish();
	protected abstract void workedTime();
	protected abstract void addComment(String aComment);
	protected abstract Duration getDuration();
	
}