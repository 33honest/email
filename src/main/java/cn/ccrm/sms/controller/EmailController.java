package cn.ccrm.sms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import cn.ccrm.sms.utils.EmailUtils;

@RestController
public class EmailController {
	private static final Logger logger = LoggerFactory.getLogger(EmailController.class);

	@RequestMapping("sendEmail")
	public String sendEmail() throws JsonProcessingException {
		boolean isSend = EmailUtils.sendEmail("这是一封测试邮件", new String[] { "liunanjing@qeeka.com" }, null, "<h3><a href='http://www.baidu.com'>百度一下，你就知道</a></h3>", null);
		return "发送邮件:" + isSend;
	}
}
