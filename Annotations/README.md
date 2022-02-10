# JAVA Annotations START WITH @
 why Annotations
 why not comments
 what is differnt between comments and Annotations

          Comments                                  Annotations
  --------------------------------------------------------------------------
  comments life is just upgo        Annotations life upto Runtime it including 
  source code                         in  .class file also
  - it's only for developer         - it's not only developer use it can used to 
     comments to read the code          finding some errors and its used to like 
     easily.                                a formula.
  - it used upto lexcal anlasys     - we can create our own Annotations like a small 
                                    formulas its use simple some predefind methods
                                    and classes.

## ther are two type of the Annotations in java lib
            
            In java lib 
        java.lang.annotation.Annotation
                    ||
                    ||
    ---------------------------------------------
        |                                  |
        |                                  |
    Starndard                           Custom 
        |
        |
     ---------------------------------------------------------
            |                                   |
            |                                   |
            |                                   |
    Gernral purpose                         Meta Annotations
    (java.lang.package)                    (java.lang.annotation.package)
     
     @Override                              @Inherited
     @Deprecated                           @Doceumented
     @SafeVarArg                            @Target
     @SupperssWarning                       @Retention
     @FucntionllInteraface                  @Repeatable


##  About Gernral Purpose Annotations
    ```java
        @Override
            It is the formal Annotation most of use daily programming
            ex:
                we can Inherted parent to child class, intraface, enum what ever it may be 
                if we can override the METHODS we can use this Annotation
                 Advantage of this annotatiion is if we will Override a method if any spelling mistake is there
                 it will taken as child class method, but we need to override the method not showing any error 
                 but we are not going to Output as misbehavior so, if we use this annotation we achive some more
                 advantages into programming level and developer level.
                 // it my own nots.... 


        @Deprecated
            It is used to Deprecated methods or class 
            if we can implement the a method that was not to use any where now only
            but we need to use futher.
            but now not use of that method, we can go for this @annotation @Deprecated
            it provided to not allow to that mehod to invoke or override again.


        @SuppersWarning
            It is used for avoid the warrnings from listed data types 
            like listed array we can achive some warrning
            we can use this annotation 
            simple, we can avoid the warrnings


        @FunctionallInterface
            It is used to in Intreface's
            if we need a Intraface as a only one abstract method  we can put it 
            as a annotation @FunctionallInterface
            its not allow the above more than one method.






    
    ```

## About Meta Annotations
    
    ```java
            @Inherited
            @Documented
            @Target
            @Retention
            
    ```


