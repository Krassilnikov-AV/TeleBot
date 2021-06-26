/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.spb.prog.bot;

import ru.spb.prog.model.User;

public class BotContext {
	private final ChatBot bot;
	private final User user;
	private final String input;

	public static BotContext of(ChatBot bot, User user, String text) {
		return new BotContext(bot, user, text);
	}

	private BotContext(ChatBot bot, User user, String text) {
		this.bot = bot;
		this.user = user;
		this.input = text;
	}

	public ChatBot getBot() {
		return bot;
	}

	public User getUser() {
		return user;
	}

	public String getInput() {
		return input;
	}
}