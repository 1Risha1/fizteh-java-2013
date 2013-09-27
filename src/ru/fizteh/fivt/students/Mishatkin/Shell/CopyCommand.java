package ru.fizteh.fivt.students.mishatkin.shell;

/**
 * CopyCommand.java
 * Created by Vladimir Mishatkin on 9/25/13
 */
public class CopyCommand extends Command {
	CopyCommand(ShellReceiver receiver) {
		super(receiver);
		type = COMMAND_TYPE.CP;
	}

	@Override
	public void execute() throws Exception {
		receiver.copyCommand(args[0], args[1]);
	}
}
