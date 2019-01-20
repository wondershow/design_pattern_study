# Notes
Instead of directly creating objects in "main" code (a.k.a client code), 
Factory pattern delegates the object creation to a Factory (called by main).
The advantage of using a Factory pattern is as follows:
1. The client code (in our case, PatternDemo.java) does not depend on any 
   concrete implementation class at compile time. That being said,  
   a Factory pattern removes compile dependency of implementation class to
   run time.
2. The implementation detail code may changed, but it does not affect the 
   client code, if the implementation code is in the client code's 
   runtime dependency. (The client code does not need to be re-deployed) 