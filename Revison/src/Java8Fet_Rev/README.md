My Java Documentation

### Collections

1. [LinkedList my Docs](https://yogeshjoga.github.io/MyJavaDocs.github.io/)

# Java 8 Features

Language level features

1. Default Methods in an Interface.  --> completed
2. static methods in an interface. --> completed
3. Functional Interface.       --> completed
4. @FunctionalInterface annotation. --> completed
5. Predefined Functional Interface Methods
6. Lambda Experssions.  --> completed
7. Method and Constructor Reference (::) double colon. --> completed
8. forEach() Method and splItrator() method.   --> completed

Api-level features:

1. Stream Api (java.util.Stream) --> completed
2. Functional Api(java.util.function)
3. New Date and Time API.
4. Base 64 API
5. Annotations.

# PreDefined Functional Interfaces in Java 8v

Package: java.util.function

1. Predicate

   ```
   predicate  method name is tested return type is boolean, Input is Generics
      public boolean test(T t) 

   know about little knowledge in Generics 
   T – Type
   E – Element
   K – Key
   N – Number
   V – Value
   R - The type of the result of the function
   ```
2. Function
3. Consumer
4. Supplier

   Two arguments Predefined functional interface
5. BiPredicate
6. BiFunction
7. BiConsumer

   Primitive Functional interfaces
8. IntPredicate
9. IntFunction
10. IntConsumer

# The javadoc tool recognizes the following tags −


| Tag           | Description                                                                                                                                                  | Syntax                                               |
| ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------------------------------------------------- |
| @author       | Adds the author of a class.                                                                                                                                  | @author name-text                                    |
| {@code}       | Displays text in code font without interpreting the text as HTML markup or nested javadoc tags.                                                              | {@code text}                                         |
| {@docRoot}    | Represents the relative path to the generated document's root directory from any generated page.                                                             | {@docRoot}                                           |
| @deprecated   | Adds a comment indicating that this API should no longer be used.                                                                                            | @deprecated deprecatedtext                           |
| @exception    | Adds a**Throws** subheading to the generated documentation, with the classname and description text.                                                         | @exception class-name description                    |
| {@inheritDoc} | Inherits a comment from the**nearest** inheritable class or implementable interface.                                                                         | Inherits a comment from the immediate surperclass.   |
| {@link}       | Inserts an in-line link with the visible text label that points to the documentation for the specified package, class, or member name of a referenced class. | {@link package.class#member label}                   |
| {@linkplain}  | Identical to {@link}, except the link's label is displayed in plain text than code font.                                                                     | {@linkplain package.class#member label}              |
| @param        | Adds a parameter with the specified parameter-name followed by the specified description to the "Parameters" section.                                        | @param parameter-name description                    |
| @return       | Adds a "Returns" section with the description text.                                                                                                          | @return description                                  |
| @see          | Adds a "See Also" heading with a link or text entry that points to reference.                                                                                | @see reference                                       |
| @serial       | Used in the doc comment for a default serializable field.                                                                                                    | @serial field-description                            |
| @serialData   | Documents the data written by the writeObject( ) or writeExternal( ) methods.                                                                                | @serialData data-description                         |
| @serialField  | Documents an ObjectStreamField component.                                                                                                                    | @serialField field-name field-type field-description |
| @since        | Adds a "Since" heading with the specified since-text to the generated documentation.                                                                         | @since release                                       |
| @throws       | The @throws and @exception tags are synonyms.                                                                                                                | @throws class-name description                       |
| {@value}      | When {@value} is used in the doc comment of a static field, it displays the value of that constant.                                                          | {@value package.class#field}                         |
| @version      | Adds a "Version" subheading with the specified version-text to the generated docs when the -version option is used.                                          |                                                      |
