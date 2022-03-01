package com.neuedu;

import java.util.Scanner;

/**
 * 数据校验类
 */
public class TelNoteRegex {
    //    对菜单输入选项的验证
    public int menultemValidate(int min, int max) {
        //定义验证菜单项的正则表达式
        String regex = "[1-9]{1}";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入正确的数字，最小：" + min + "\t" + "最大为：" + max);
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                int inputNum = (int) Integer.parseInt(input);
                if (inputNum >= min && inputNum <= max) {
                    return inputNum;
                } else {
                    System.out.println("输入的菜单项不符，请重新输入！");
                }
            } else {
                System.out.println("输入数字错误，请检查！");
            }
        }
    }

    //    对用户输入姓名的验证
    public String nameValidate() {
        //定义验证姓名的正则表达式（字母长度在1-10）
        String regex = "[a-zA-Z]{1,10}";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入姓名,格式为长度在1-10之间的大写或者小写字母");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("您当前输入的姓名有误，重新输入！");
            }
        }
    }

    //    对用户输入年龄的验证
    public String ageValidate() {
        //定义验证年龄的正则表达式（数字在10-99）
        String regex = "[1-9]{1}[0-9]{1}";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入年龄,年龄在10-99之间");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("您当前输入的年龄有误，重新输入！");
            }
        }
    }

    //    对用户输入性别的验证
    public String sexValidate() {
        //定义验证性别的正则表达式（男性为m/M,女性为：f/F）
        String regex = "[m|M|f|F]{1}";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入性别,m/M为男性，f/F为女性");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("您当前输入的性别有误，重新输入！");
            }
        }
    }

    //    对用户输入电话号码的验证
    public String telNumValidate() {
        //定义验证电话号码的正则表达式（允许带有区号的座机号，允许手机号）
        String regex = "(\\d{3,4}-\\d{7,8})|([1]{1}\\d{10})";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入电话号码,带有区号的座机号或者手机号");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("您当前输入的电话号码有误，重新输入！");
            }
        }
    }

    //    对用户输入地址的验证
    public String addressValidate() {
        //定义验证地址的正则表达式（字母或者数字，长度1-50）
        String regex = "\\w{1,50}";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入地址,字母或者数字，长度1-50");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("您当前输入的地址有误，重新输入！");
            }
        }
    }
}
