package logic.command.actioncommand;
// интерфейс для гибкости системы использ для реализации патерна команд
public interface ActionCommand {

	public String execute();

	public void insertInRequest();

	public boolean parseValidate();
}
