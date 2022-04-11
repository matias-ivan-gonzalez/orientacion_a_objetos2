package ar.edu.unlp.info.oo2.Jira;
import java.time.*;

public class InProgress extends State {

	public InProgress(ToDoItem anItem) {
		super(anItem);
	}

	@Override
	protected void start() {
		throw new RuntimeException("This Item was already started");
	}

	@Override
	protected void togglePause() {
		this.item.changeState(new InProgress(item));
	}

	@Override
	protected void finish() {
		this.item.setEndingDate(LocalDateTime.now());
		this.item.changeState(new Finished(item));	
	}

	@Override
	protected void workedTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void addComment(String aComment) {
		this.item.comment(aComment);
	}

	@Override
	protected Duration getDuration() {
		return item.workedTime(LocalDateTime.now());
	}

}