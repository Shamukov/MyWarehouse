package logic.command.actioncommand;

public interface ActionCommand {

	public String execute();

	public void insertInRequest();

	public boolean parseValidate();
}
