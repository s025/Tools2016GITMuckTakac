class Test {

public boolean thisIsANewMethod(){
     boolean value = false;
     System.out.println("Hello World!");
     value = true;
     return value;
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
