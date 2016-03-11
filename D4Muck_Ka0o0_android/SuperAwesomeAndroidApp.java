class Test {

public void thisIsANewMethod(){
     System.out.println("Hello World!");
}

public static void main (String[] args){
     System.out.println("Hello World!");
     int i = 0;
     i++;
     System.out.println(i);
     System.out.println(++i);
     System.out.println(i++);
     Test t = new Test();
     t.thisIsANewMethod();    
}

}
