package model.Enums;


public enum StandardFields {
	error("error"),
	command("command"), 
	actionCommand("actionCommand");
	String value;
	private StandardFields(String str) {
		this.value = str;
	}
	public String getValue(){return value;}
}
