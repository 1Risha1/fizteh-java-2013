package ru.fizteh.fivt.students.mishatkin.shell;

/**
 * ChangeDirectoryCommand.java
 * Created by Vladimir Mishatkin on 9/24/13
 */
public class ChangeDirectoryCommand extends Command {

	ChangeDirectoryCommand(ShellReceiver receiver) {
		super(receiver);
		type = COMMAND_TYPE.CD;
	}

	@Override
	public void execute() throws Exception{
		receiver.changeDirectoryCommand(args[0]);
	}
}
