# IO STREAMS IN JAVA
  there are few main topics in java io streams
        1 File  Class
        2 FileWriter Class
        3 FileReader Class
        4 BufferedWriter Class
        5 BufferedReader Class
        6 PrintWrite Class

File Class :
        we can create a file by usiing File class object
        example : 
                  File f = new File("yogi.txt");
                  // creating file object not a file
                  f.createNewFile(); // now it will create a new file.

  Importent file Methods

            write(int char); // taken int  output as char ASCII
            write(char[] ch); // char array will taken
            write(String s);  // directly taken string also
            flush(); // it will clean the all input writer are completely taken
            close(); // close the connection

FileWriter Class
         we can write a char's and digit formates into a file by using FileWriter Class.
```java
         example: 
              // first we will take input file are create new file.

              File f = File("yogi.java");
              // taken from input file 
              FileWriter fw = new FileWriter(f);
              // creating FileWriter constructor and passing the value.
              fw.write(121); // it is char int type
              fw.write("\n"); // we can must be use expilcitly programmer will given the next line agrument
              char ch[] = new char{'a','b','d'};
              fw.write(ch);
              fw.write("\n");
              fw.write("yogi joga");

              fw.flush();
              fw.close();
```

FileReader Class:
    
    some FileReader methods
               
               read(); // file read by unicode values. pass int type values
               read(char[] ch); // char inputs taken read to given ouput.


```java
        example:
            File f = new File("yogi.txt");
            char ch = new char((int)f.length()); // we must use this length method 
            // why becoz length is long formate we can explictly type casted into int type.
            FileReader fr = new FileReader(f);
            fr.read(ch);
            for(char ch1 : ch){
              System.out.prinln(ch1);
            }
            fr.close();


      2nd example:
           
           FileReader fr = new FileReader("yogi.txt");
            int i = fr.read();
            while(i != -1){
              System.out.prinln((char)i); // type cast int to char
              i = fr.read();
            }
```


# very imp topic is BUFFERED WRITER AND BUFFERED READER

      not recommanded to use the fileWriter and fileReader
      why because is fileWriter if can wirte somthing every time we can inseart the next line argument by explicitly.
      BufferedReader and BufferedWriter can't import or create a file or dir's.
      we can use only file class

  syntax:

        BufferedWriter bw = new BufferedWriter(new file("yogi.txt")); // it is valid syntax why becoz buffer writer can't call files in directly
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new File("yogi.txt")));  // this is also valid.


        BufferedWriter methods
                  write(int ch)
                  write(char [] ch)
                  write(String s)
                  flush();
                  close();
                  newLine(); // this is extra in fileWriter to compar

```java
        
```