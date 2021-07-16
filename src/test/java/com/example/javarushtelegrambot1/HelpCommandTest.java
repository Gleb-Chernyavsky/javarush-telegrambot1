package com.example.javarushtelegrambot1;

import com.example.javarushtelegrambot1.command.Command;
import com.example.javarushtelegrambot1.command.HelpCommand;
import org.junit.jupiter.api.DisplayName;

import static com.example.javarushtelegrambot1.command.CommandName.HELP;
import static com.example.javarushtelegrambot1.command.HelpCommand.HELP_MESSAGE;

@DisplayName("Unit-level testing for HelpCommand")
public class HelpCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }
}
