public class Program {

    public static void main(String[] args) {

        Order order = new Order();
        ConsoleInput consoleInput = new ConsoleInput(order);
        consoleInput.inputFromConsole(order);
        SaverToJson saverToJson = new SaverToJson(order);
        saverToJson.saveToJson(order);

    }
}
