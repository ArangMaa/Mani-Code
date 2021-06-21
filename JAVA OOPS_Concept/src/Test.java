
public class Test {
	
	
	
 //Test t;// If I am not going to assign any object it will show the output as null and null is not zero


	public static void main(String[] args) {
		
		 Test t= new Test();//Here I have crested the object of the class firdt left 
		 //hand side will get executed and right hand side
		 //will be executed so object of the class will be created and it will point to the reference variable t  
		 //but output will be the location of the t
		
System.out.println(t);

new Test();// This will be eligible for Garbage collation it does not have reference variable assign to it.
//When ever compiler check any object are created but not point to any reference variable it will get into garbage collation

//t=num;// eligble for garbase collation java will delete and free the memory from heap              



// bellow are premitive data type becuase this data types are pre defined

 int  i =1234;//  will consider max 10 digit 
Float f =1.4457851358422564513265F;
Long l =132L;// long can store n number of values
double d=5.24569874125; //double can store n number of values
boolean b= true;// boolean can give only true or false
char c='h';// char can store only one character
String s=" complete statement"; // we can write complete statements




///Non premitive data types are those data types which are defeind by us.

Test T; //non premitive data type here test is the data type of t 
//
/* int k=10;
//int j=25;
System.out.println(k+j);*/

System.out.println(39!=37);//Assignment operators
System.out.println((123==123)&&(10==10));//conditional operators
//-----------------------------------------------------------------------------------------------------------



//methods in java
 








	}

}
