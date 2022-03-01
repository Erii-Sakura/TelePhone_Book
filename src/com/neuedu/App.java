package com.neuedu;

/**
 * 项目入口类
 */
public class App {
    /**
     * 启动项目
     */
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    /**
     * 控制主菜单
     */
    public void start() {
        Menu menu = new Menu();
        TelNoteRegex regex = new TelNoteRegex();
        Operate operate = new Operate();
        while (true) {
            menu.mainMenu();
            int item = regex.menultemValidate(1, 6);
            switch (item) {
                case 1:
                    operate.addLogic();
                    break;
                case 2:
                    operate.searchLogic();
                    break;
                case 3:
                    operate.modifyLogic();
                    break;
                case 4:
                    operate.deleteLogic();
                    break;
                case 5:
                    operate.orderLogic();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
