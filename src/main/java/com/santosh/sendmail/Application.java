package com.santosh.sendmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.santosh.sendmail.component.MailService;
import com.santosh.sendmail.dto.Mail;

@SpringBootApplication(scanBasePackages = { "com.santosh" })
public class Application {

	public static void main(String[] args) {

		Mail mail = new Mail();
		// set sender email address
		mail.setMailFrom("");
		// set receiver email address
		mail.setMailTo("");
		mail.setMailSubject("Spring Boot - sendmail");
		mail.setMailContent("This is the email generated from the sample Spring Boot application");

		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		MailService mailService = (MailService) ctx.getBean("mailService");
		mailService.sendEmail(mail);
	}

}
