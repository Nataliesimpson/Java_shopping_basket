package shopping_management;
import java.util.ArrayList;

public class Basket {

  private ArrayList<Item> items;

  public Basket(){
    this.items = new ArrayList<Item>();
  }

  public int itemsCount(){
    return items.size();
  }

  public Item addItem(Item item) {
    items.add(item);
    return item;
  }

}