package com.example.javarushtelegrambot1.command;

import com.example.javarushtelegrambot1.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StopCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String STOP_MESSAGE = "Деактивировал все ваши подписки \uD83D\uDE1F.";

    public StopCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(String chatId) {
        sendBotMessageService.sendMessage(chatId, STOP_MESSAGE);
    }
}
