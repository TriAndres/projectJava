package org.example.task;

import org.example.console.ReadConsole;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
6. Вывести фамилию разработчика, дату и время получения задания, а также
дату и время сдачи задания.
 */
public class Task6 extends Task{
    @Override
    public void task() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Введите ваше имя:");
        String name = ReadConsole.detStringLine();
        System.out.println(name + ", получили задание: " + localDateTime.format(dateTimeFormatter));

        System.out.println("Сколько дней нужно для выполнения задач: ");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd 10:00");
        LocalDateTime localDateTime1 = localDateTime.plusDays(ReadConsole.getLong());
        System.out.println(name + ", сдать задание: " + localDateTime1.format(dateTimeFormatter1));
    }
}