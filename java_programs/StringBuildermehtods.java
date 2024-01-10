public class StringBuildermehtods {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello my java");
  
        //+append(data: char[]): StringBuilder
        // convert the character array to string and append to the builder
        // System.out.println(str.append(new char[]{'j','a','v','a'}));
  
        //+append(data: char[], offset: int, len: int):StringBuilder
        // append the substring of the array to the builder starting from offset and of length len
        // System.out.println(str.append(new char[]{'j','a','v','a'},1,2));
  
  
        //+append(v: aPrimitiveType): StringBuilder
        //append the primitive type ie integer, character, double ,float to the builder
        // System.out.println(str.append(1234.0));
  
         
        //+append(s: String): StringBuilder
        //append the string to the builder
        // System.out.println(str.append(" to java"));
  
        
        //+delete(startIndex: int, endIndex: int):StringBuilder
        // delete the characters from the index start to end
        // System.out.println(str.delete(0,2));
  
        
        //+deleteCharAt(index: int): StringBuilder
        //delete the particular character at index specify
        // System.out.println(str.deleteCharAt(5));
  
  
        //insert(index: int, data: char[], offset: int,len: int): StringBuilder
        //insert the substring of char to the builder starting from the offset of lenght len
        // System.out.println(str.insert(1,new char[]{'a','b','c'},1,2));
  
  
        //+insert(offset: int, data: char[]):StringBuilder
        //convert the array to the characters and insert to the builder at the index offset
        // System.out.println(str.insert(1,new char[]{'a','b','c'}));          
  
        
        //+insert(offset: int, b: aPrimitiveType):StringBuilder
        //convert the primitive type to the string and insert at position offset in the builder
        // System.out.println(str.insert(1,123)); 
  
  
        // +insert(offset: int, s: String): StringBuilder
        // insert the string at the position offset in builder
        // System.out.println(str.insert(1," hy "));
  
        
        //+replace(startIndex: int, endIndex: int, s:String): StringBuilder
        // replace the characters from index 1 to 3-1 by the string in the builder
        // System.out.println(str.replace(1,3,"name"));
  
  
        //+reverse(): StringBuilder
        // reverse the builder
        // System.out.println(str.reverse());  
  
        
        // System.out.println(str.capacity()); //return the storage capacity 
        // str.trimToSize();                   // trim the size of the Stringbuilder
        // System.out.println(str.capacity());
        
        
        // str.setLength(3);         // setting new length and the old builder is set with length 3
        // System.out.println(str);



        //toString() method to convert builder to string 
        // System.out.println(str.toString());

        //capacity() to return the capacity of the string builder
        // System.out.println(str.capacity());

        //charAt() method to return the char at index specified
        // System.out.println(str.charAt(2));

        //length() method to return the lenght of the builder 
        // System.out.println(str.length());


        //setLength() method to set the lenght
        // str.setLength(6);
        // System.out.println(str);

        //substring(startindex:int) to return the substring 
        // System.out.println(str.substring(1, 3));


        //trimToSize(size) to reduce the storage size for the string builder
        // str.trimToSize();
        // System.out.println(str);
       }
    
}
