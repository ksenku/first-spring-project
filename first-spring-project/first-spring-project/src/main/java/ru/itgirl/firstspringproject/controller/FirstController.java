package ru.itgirl.firstspringproject.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/dayOfWeek")
    public String dayOfWeek1(@RequestParam(value = "name", defaultValue = "что за день?") String name) {
        return String.format("Сегодня %s!", name);
    }

    @GetMapping(value = "/dayOfWeek", params = {"name"})
    public String dayOfWeek(@RequestParam (value = "name") String name, String nameOfDay) {
        if (name.equals("MONDAY")) {
            nameOfDay = "понедельник";
        } else if (name.equals("TUESDAY")) {
            nameOfDay = "вторник";
        } else if (name.equals("WEDNESDAY")) {
            nameOfDay = "среда";
        } else if (name.equals("THURSDAY")) {
            nameOfDay = "четверг";
        } else if (name.equals("FRIDAY")) {
            nameOfDay = "пятница";
        } else if (name.equals("SATURDAY")) {
            nameOfDay = "суббота";
        } else if (name.equals("SUNDAY")) {
            nameOfDay = "воскресенье";
        }
        return String.format("Сегодня %s!", nameOfDay);
    }
}