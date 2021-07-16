package com.example.javarushtelegrambot1;


import com.example.javarushtelegrambot1.command.Command;
import com.example.javarushtelegrambot1.command.StopCommand;
import org.junit.jupiter.api.DisplayName;

import static com.example.javarushtelegrambot1.command.CommandName.STOP;
import static com.example.javarushtelegrambot1.command.StopCommand.STOP_MESSAGE;

@DisplayName("Unit-level testing for StopCommand")
public class StopCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}
