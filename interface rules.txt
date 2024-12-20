interface Calculatorl(

int a=10;//constant //Rule 10

void add();//Abstract method //Rule 9

void sub();//Abstract method //Rule 9

}

interface Calculator2 implements Calculator1{
//errer rule no 7
 }
interface Calculator3 extends Calculator1{

int a =10;//can be accessed here also

void add();//Available from calculator1

void sub();//Available from calculatorl

void mull();//Rule no 8 

void div();
}
Interface Calculator4{

void add1();

void add2();
interface Calculator4{

void add1();

void add2();

}

class SampleCodel implements Calculator1(

//Rule no 1

@Override

public void add(){

System.out.println("Inside add method of Sample Code1");

}

@Override

public void sub(){

System.out.println("Inside sub method of Smaple Code 1");

}

}

class SampleCode2 implements Calculator1{

//rule 1
public void add(){

System.out.println("Inside add method of Sample Code2");

}

}
class SampleCode3 implements Calculator1, Calculator3{

//Rule no 6

@Override

public void add() {

System.out.println("Inside add method of Sample Code2"); 
}

@Override

public void sub(){

System.out.println("Inside sub method of Sample Code2"); }

@Override

public void mull(){

System.out.println("Inside mull method of Smap )

}
@Override

public void div(){

System.out.println("Inside div method of Sample Code3");

}
}

interface Calculators{

//Rule no 11: Tagged interface

}

class SampleCode4{

void display(){

System.out.println("Inside Display method");

class SampleCodes extends SampleCode4 implements Calculator1{

//Rule no 12

@Override

public void add(){
System.out.println("Inside add method of Sample Code2"); 
}
@Override

public void sub(){

System.out.println("Inside sub method of Sample Code5");

}

}

interface Calculator6(

void addition();

void subtraction();

//Rule no 14

default void multiplication(){

System.out.println("Inside multiplication method of Calculator6");

}

static void division(){

System.out.println("Inside division method of Calculator6");

}
}
abstract class SampleCode6 implements Calculator6(

//Rule no 15

@Override

public void addition(){

System.out.println("Inside addition method of SampleCode6");

}

class Test{

public static void main(String[] args)

{

Calculator1 c1= new Calculator1();//error Rule no 4

Calculator1 c2;//Accepted as reference can be created.

//Rule no 5

Calculator1 c3= new Calculator1(){

//Rule no 13

@Override

public void add() {

System.out.println("Inside add method of Calculator 1");

}

@Override
public static void main(String[] args)

{

Calculator1 c1= new Calculatori();//error Rule no 4

Calculator1 c2;//Accepted as reference can be created.

//Rule no 5

Calculatorl c3 = new Calculator1(){

//Rule no 13

@Override

public void add(){

System.out.println("Inside add method of Calculator 1");

}

@Override

public void sub(){

System.out.println("Inside sub method of Calculator 1");

}

};

}

}