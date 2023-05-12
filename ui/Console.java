package ui;

import java.time.LocalDate;
import java.util.Scanner;

import presenter.Presenter;

public class Console implements View {

    private Scanner scanner;
    private Presenter presenter;
    private boolean work = true;
    private Menu menu;

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    public Console() {
        scanner = new Scanner(System.in);
        menu = new Menu(this);
    }

    @Override
    public void start() {
        while (work) {
            System.out.println(menu.printMenu());
            int number = Integer.parseInt(scanner.nextLine());
            menu.execute(number);

        }
    }

    @Override
    public void addRecords() {
        System.out.println("Введите дату в формате yyyy-mm-dd");
        String date = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(date);
        System.out.println("Введите запись");
        String note = scanner.nextLine();
        System.out.println("Введите время");
        String time = scanner.nextLine();
        presenter.addNode(date2, note, time);
        

    }

    @Override
    public void printNote() {
        presenter.getRecords();

    }

    @Override
    public void exit() {
        System.out.println("Работа завершена");
        scanner.close();
        work = false;

    }

    @Override
    public void save() {
        presenter.saveFile();

    }

    @Override
    public void read() {
        presenter.readFile();
    }

}
