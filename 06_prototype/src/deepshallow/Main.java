package deepshallow;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    Cat navi = new Cat();
    navi.setName("navi");
    navi.setAge(new Age(2000, 3));

    Cat yo = navi.copy();
    yo.setName("yo");
    yo.getAge().setYear(2010);
    yo.getAge().setValue(7);

    System.out.println(navi.getName());
    System.out.println(navi.getAge().getYear() + "," + navi.getAge().getValue());

    System.out.println(yo.getName());
    System.out.println(yo.getAge().getYear() + "," + yo.getAge().getValue());
  }
}
