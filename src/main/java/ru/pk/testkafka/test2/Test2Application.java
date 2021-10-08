package ru.pk.testkafka.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.kafka.annotation.EnableKafka;
import ru.pk.testkafka.test2.producer.TestProducer1;

import java.text.SimpleDateFormat;
import java.util.Date;

@EnableKafka
@SpringBootApplication
public class Test2Application implements CommandLineRunner {

    @Autowired
    private TestProducer1 testProducer1;
    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(Test2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testProducer1.send("Test1: " + (new SimpleDateFormat("dd.MM.yyyy mm:ss:SSS").format(new Date())));
    }

}
