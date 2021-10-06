package com.sberbank.firstmodule.options;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Menu {
    public int userChoice() {
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Выберете требуемое действие:");
        System.out.println("1) Список городов");
        System.out.println("2) Отсортированный по имени список городов");
        System.out.println("3) Отсортированный по федеральному округу и имени список городов");
        System.out.println("4) Показать город с наибольшим количеством жителей");
        System.out.println("5) Показать количество городов в разрезе регионов");
        System.out.println("6) Выход");

        selection = input.nextInt();
        return selection;
    }
}
