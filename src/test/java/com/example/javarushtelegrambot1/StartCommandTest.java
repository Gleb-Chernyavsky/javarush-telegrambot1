package com.example.javarushtelegrambot1;


import com.example.javarushtelegrambot1.command.Command;
import com.example.javarushtelegrambot1.command.StartCommand;
import org.junit.jupiter.api.DisplayName;

import static com.example.javarushtelegrambot1.command.CommandName.START;
import static com.example.javarushtelegrambot1.command.StartCommand.START_MESSAGE;

@DisplayName("Unit-level testing for StartCommand")
public class StartCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}
