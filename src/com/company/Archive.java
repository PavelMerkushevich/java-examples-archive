package com.company;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Archive {
    public static void showDemoMessage() {
        JOptionPane.showMessageDialog(null, "First program on Java!");
        User user = new User("PavelPro", "Pavel", "Merkushevich");
        System.out.println(user.name + "\n" + user.username + "\n" + user.lastname);
        String title = "Сообщение";
        String text = "Продолжаем изучать Java";
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showDemoInput() {
        String username = JOptionPane.showInputDialog("Введите логин: ");
        String name = JOptionPane.showInputDialog("Введите имя: ");
        String lastname = JOptionPane.showInputDialog("Введите фамилию: ");
        User user = new User(username, name, lastname);
        JOptionPane.showMessageDialog(null, user.getUserInfo());
    }

    public static void shift() {
        int num;
        char A = 'А', B = 'ы';
        char X, Y;
        num = ((int) B << 16) + ((int) A);
        System.out.println("Исходные буквы: '" + A + "' и '" + B + "'.");
        System.out.println("Кодовое число: " + num);
        Y = (char) (num >>> 16);
        X = (char) (num ^ ((int) Y << 16));
        System.out.println("Обратное преобразование:");
        System.out.println("Буквы '" + X + "' и '" + Y + "'.");
    }

    public static void InputAndMessage() {
        String title = JOptionPane.showInputDialog(null, "Имя для окна", "Название", JOptionPane.WARNING_MESSAGE);
        String text = JOptionPane.showInputDialog(null, "Текст сообщения", "Содержание", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void ScanAndShowDate() {
        Scanner scan = new Scanner(System.in);
        String day, month;
        System.out.print("Какой сегодня день? ");
        day = scan.nextLine();
        System.out.print("Какой месяц? ");
        month = scan.nextLine();
        String text = "Сегодня " + day + ", месяц - " + month;
        System.out.println(text);
    }
}
