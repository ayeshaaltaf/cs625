class ifDemo {
 public static void main(string args[] ) {
  int a, b, c;

   a=2;
   b=3;
  
   if(a<b) system.out.println("a is less than b");
   if(a==b) system.out.println("you won't see this");
   
   system.out.println();
   c=a-b;
   
   system.out.println("c contains -1");
   if(c>=0) system.out.println("c is non negative");
   if(c<0) system.out.println("c is negative");

   system.out.println();
   
   c=b-a;
   system.out.println("c contains 1");
   if(c>=0) system.out.println("c is non negative");
   if(c<0) system.out.println("c is negative");
  }
 }