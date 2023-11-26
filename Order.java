import java.util.Scanner;

public class Order {

    //Scanner scanner = new Scanner(System.in);
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Order() {

    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

//    public void inputFromConsole() {
//        clientName = prompt("Имя клиента: ");
//        product = prompt("Продукт: ");
//        qnt = Integer.parseInt(prompt("Количество: "));
//        price = Integer.parseInt(prompt("Цена: "));
//    }
//
//    private String prompt(String massage) {
//        System.out.println(massage);
//        return scanner.nextLine();
//    }

}
