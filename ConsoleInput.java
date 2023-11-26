import java.util.Scanner;

public class ConsoleInput {

    private final Order order;
    Scanner scanner = new Scanner(System.in);

    public ConsoleInput(Order order) {
        this.order = order;
    }

    public void inputFromConsole(Order order) {
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Количество: ")));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
    }

    private String prompt(String massage) {
        System.out.println(massage);
        return scanner.nextLine();
    }

}
