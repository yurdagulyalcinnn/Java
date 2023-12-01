
public class Main {
    public static void main(String[] args) {
     Product yeniUrun = new Product();
     yeniUrun.setName("laptop");
     //yeniUrun.id=1;
     yeniUrun.setId(1);
     yeniUrun.setDescription("asus laptop");
     yeniUrun.setPrice(5000);
     yeniUrun.setStokAmount(2);
     System.out.println(yeniUrun.getName());


     ProductManager productManager = new ProductManager();
     productManager.Add(yeniUrun);
    }
}