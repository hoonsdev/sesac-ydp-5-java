package _05_class;

public class CustomClass {
  private String company;
  private int price;
  private int ram;

  public CustomClass(String company, int price) {
    this.company = company;
    this.price = price;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    if (price < 0) {
      this.price = 0;
    } else {
      this.price = price;
    }
  }

  public int getRam() {
    return ram;
  }

  public void setRam(int ram) {
    if (ram < 0) {
      this.ram = 0;
    } else {
      this.ram = ram;
    }
  }
}
