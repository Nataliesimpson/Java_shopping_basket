import static org.junit.Assert.*;
import org.junit.*;
import shopping_management.*;

public class BasketTest {

    Basket basket;
    Item item;

    @Before 
    public void before() {
      basket = new Basket();
      item = new Item("bread", 1.00);
    }

    @Test
    public void basketStartsEmpty(){
      assertEquals(0, basket.itemsCount());
    }

    @Test
    public void canAddItem(){
      basket.addItem(item);
      assertEquals(1, basket.items.size());
    }

  }