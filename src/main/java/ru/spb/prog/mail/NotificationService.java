/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.spb.prog.mail;

import ru.spb.prog.service.UserService;

@Component
@PropertySource("classpath:telegram.properties")
public class NotificationService {
	private final UserService userService;
	private final JavaMailSender javamailSender;

	@Value("New applications")
	private String emailSubject;

	@Value("New applications")
	private String emailSubject;
}