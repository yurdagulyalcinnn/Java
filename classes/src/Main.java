
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();  //ikinci customerManager abc de olabilir :)
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        CustomerManager abc = new CustomerManager();
        abc.Update();
        abc.Remove();
        abc.Add();

    }
}

