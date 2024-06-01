public class Item {

  private String identifier;
  private String name;

  public Item(String identifier, String name) {
    this.identifier = identifier;
    this.name = name;
  }

  public String getIdentifier() {
    return identifier;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object comparison) {
    if (this == comparison) {
      return true;
    }
    if (comparison == null || getClass() != comparison.getClass()) {
      return false;
    }
    Item item = (Item) comparison;
    return identifier.equals(item.identifier);
  }

  @Override
  public int hashCode() {
    return identifier.hashCode();
  }

  @Override
  public String toString() {
    return identifier + ": " + name;
  }
}
