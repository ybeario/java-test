package com.bear;


//�Ⱦ�̬��ʼ������ֻ��һ�Σ���Ȼ�������飡���ٹ��췽������  
//����һ���̳��Ը��������ʱ���ȰѸ���Ĺ������鼰���췽����ʼ��Ȼ���ʼ������Ĺ�������͹��췽��  

class Parent {  
  public static String p_StaticField = "����--��̬����";  
  public String p_Field = "����--����";  
    

  // ���캯��  
    
  public Parent() {  
      System.out.println("����--������");  
  }  
  {  
      System.out.println(p_Field);  
      System.out.println("����--��ʼ����");  
  }  

  // ��̬��ʼ����  
  static {  
      System.out.println(p_StaticField);  
      System.out.println("����--��̬��ʼ����");  
  }  
}  

public class StaticBlock extends Parent {  
  public static String s_StaticField = "����--��̬����";  
  public String s_Field = "����--����";  
  {  
      System.out.println(s_Field);  
      System.out.println("����--��ʼ����");  
  }  

  // ��̬��ʼ����  
  static {  
      System.out.println(s_StaticField);  
      System.out.println("����--��̬��ʼ����");  
  }  

  public StaticBlock() {  
      System.out.println("����--������");  
  }  

  public static void main(String[] args) {  
      System.out.println("-------------------");  
      new Parent();  
      System.out.println("-------------------");  
      new StaticBlock();  
  }  
}  
