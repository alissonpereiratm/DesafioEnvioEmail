// package com.br.email.consummer;

// import com.br.email.dto.EmailDto;
// import com.br.email.entitie.Email;
// import com.br.email.emailService.EmailService;
// import org.springframework.amqp.rabbit.annotation.RabbitListener;
// import org.springframework.beans.BeanUtils;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.messaging.handler.annotation.Payload;
// import org.springframework.stereotype.Component;

// @Component
// public class EmailConsumer {

//     @Autowired
//     EmailService emailService;

//     @RabbitListener(queues = "${spring.rabbitmq.queue}")
//     public void listen(@Payload EmailDto emailDto) {
//         Email emailModel = new Email();
//         BeanUtils.copyProperties(emailDto, emailModel);
//         emailService.sendEmail(emailModel);
//         System.out.println("Email Status: " + emailModel.getStatusEmail().toString());
//     }
// }