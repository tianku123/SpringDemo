package rh.study.spring.bean;

/**
 * Created by admin on 2018/9/27.
 */
public class HelloWorld {

  public HelloWorld() {
    System.out.println("HelloWorld's constructor...");
  }

  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public void hello() {
    System.out.println("Hello:" + name);
  }

}
