package com.bear;


//先静态初始化并且只有一次！！然后构造代码块！！再构造方法！！  
//声明一个继承自父类的子类时，先把父类的构造代码块及构造方法初始化然后初始化子类的构造代码块和构造方法  

class Parent {  
  public static String p_StaticField = "父类--静态变量";  
  public String p_Field = "父类--变量";  
    

  // 构造函数  
    
  public Parent() {  
      System.out.println("父类--构造器");  
  }  
  {  
      System.out.println(p_Field);  
      System.out.println("父类--初始化块");  
  }  

  // 静态初始化块  
  static {  
      System.out.println(p_StaticField);  
      System.out.println("父类--静态初始化块");  
  }  
}  

public class StaticBlock extends Parent {  
  public static String s_StaticField = "子类--静态变量";  
  public String s_Field = "子类--变量";  
  {  
      System.out.println(s_Field);  
      System.out.println("子类--初始化块");  
  }  

  // 静态初始化块  
  static {  
      System.out.println(s_StaticField);  
      System.out.println("子类--静态初始化块");  
  }  

  public StaticBlock() {  
      System.out.println("子类--构造器");  
  }  

  public static void main(String[] args) {  
      System.out.println("-------------------");  
      new Parent();  
      System.out.println("-------------------");  
      new StaticBlock();  
  }  
}  
