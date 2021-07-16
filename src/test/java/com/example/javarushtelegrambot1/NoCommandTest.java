package com.example.javarushtelegrambot1;

import com.example.javarushtelegrambot1.command.Command;
import com.example.javarushtelegrambot1.command.NoCommand;
import org.junit.jupiter.api.DisplayName;

import static com.example.javarushtelegrambot1.command.CommandName.NO;
import static com.example.javarushtelegrambot1.command.NoCommand.NO_MESSAGE;

@DisplayName("Unit-level testing for NoCommand")
public class NoCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
}
