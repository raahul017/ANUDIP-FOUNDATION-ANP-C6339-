// Write a program to read and write object to the file. the object need to store bookinfo.
package com.filehandling;

// ObjectFileReadWrite.java
import java.io.*;

public class ObjectFileReadWrite {

	public static void main(String argv[]) throws Exception
    {
		FileOutputStream fout = new FileOutputStream("Books_Data.txt");

		ObjectOutputStream out = new ObjectOutputStream(fout);

        BookInfo b = new BookInfo(1, "Java Programming", "John Doe");
        BookInfo b1 = new BookInfo(2, "Data Structures", "Jane Smith");
           
        out.writeObject(b);
        out.writeObject(b1);
        b.Show();
        b1.Show();
        
        System.out.println("Objects written to the file successfuly...");
        
        out.close();
        fout.close();
        
        
     }}

//ReadFile.com

package com.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile {
	public static void main(String argv[]) throws Exception
    {
		FileInputStream fin = new FileInputStream("Books_Data.txt");

		try (ObjectInputStream in = new ObjectInputStream(fin))
		{
			BookInfo b1 = (BookInfo) in.readObject();
			b1.Show();
			
			BookInfo b2 = (BookInfo) in.readObject();
			b2.Show();
		}
		
		catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
     }
}


