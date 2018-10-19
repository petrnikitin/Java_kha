class Reception {


    static void greet() {
        System.out.println("Hello from greet!");
        manage();
    }

    static void manage() {
        // sout + Tab
        System.out.println("Manage smth");
    }

    static void clean() {
        System.out.println("Что-нибудь убрали");

    }

    // psvm + Tab
    // code -> Reformat code Ctrl+Alt+L
    // ctrl+shift+Enter перейти на новую строчку после объявления класса
    public static void main(String[] args) {
        System.out.println("Департамент Reception");
        greet();
        clean();
    }

}

