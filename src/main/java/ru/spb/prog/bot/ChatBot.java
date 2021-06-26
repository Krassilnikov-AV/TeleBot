/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.spb.prog.bot;
@PropertySource("classpath:telegram.properies")
public class ChatBot extends TelegramLongPollingBot {

	private static final String BROADCAST ="broadcast";
	private static final String LIST_USER ="user";

	@Value("${bot.name}")
	private String botName;


}