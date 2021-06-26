/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.spb.prog;

@Component
@PropertySource("classpath:telegram.properties")
public class DemoApplication {
	private final UserService userService;
	private final JavaMailSender javamailSender;

	@Value("New applications")
	private String emailSubject;

	@Value("New applications")
	private String emailSubject;
}