# Instructions  
### Description:
**ArrayLists** are a commonly used Data Structure in the Java Collection API, which uses indexes to track the position of elements placed inside of the **ArrayList**. ArrayLists provide more flexibility than a standard Array, since the size of the collection can be altered while a program is running, unlike an Array, which is fixed in length.

Common ArrayList methods:
* **add** : add an element to the end of the data structure
* **remove** : removes an element at a specified index or the first occurance of an object, starting from index 0, which matches a given value.
* **get** : returns the element at the given index
* **size** : returns a count of the number of elements in the collection

In this activity we will explore how to create and use ArrayLists in Java. Please follow the steps below:

### Steps:
1. Add the following code to `main()` method within the Main.java file:
```Java
    ArrayList<String> instruments = new ArrayList<String>();
```
Notice the angle brackets '<>' which contain the word 'String'. These are known as 'Generics'. Different classes, particularly those in the Collection API of Java, use 'Generics' to specify what Datatype can be used with an Object that has been created. In this case, we are specifying that our ArrayList 'instruments' can only contain String objects. If we try to place other Objects within this ArrayList, we would be met with a compilation error.

2. At this point, you may notice an error in your code. Unlike other classes, the ArrayList class is not automatically imported to use. To import this class, add the following to the top of your Main.java file, right above the class declaration:
```Java
import java.util.ArrayList;
```

3. Next, add the following to your `main()` method right below the creation of your instruments arrayList.
```Java
    // You can create a string with a name then add it to the arraylist.
    String drums = "Drums";
    instruments.add(drums);
    String violin = "Violin";
    instruments.add(violin);

    // You can also create the string while adding it to the arraylist as well
    instruments.add("Guitar");
    instruments.add(new String("Piano"));
```
Here, we've created an ArrayList of String objects. Notice that we can add elements to the ArrayList using reference variables ("Drums" and "Violin") as well as directly by creating new objects in the add method ("Guitar" and "Piano").

4. Lets print all of our objects using the method `get()`. Add the following code to the bottom of your `main()` method:
```Java
for (int i = 0; i < instruments.size(); i++) {
  System.out.println(instruments.get(i));
}
```
You should see the following Ouput:
```
Drums
Violin
Guitar
Piano
```
The method `size()` returns the number of elements 

5. Now, lets explore the `remove()` method. Add the following code to your `main()` method below the rest of your code:
```Java
instruments.remove("Violin");
```
This method will remove the word 'Violin' from the ArrayList, so see the effect of this method we can create another copy of the for-loop from above.

6. Add the following to your code and run the program:
```Java
System.out.println();
for (int i = 0; i < instruments.size(); i++) {
  System.out.println(instruments.get(i));
}
```
The println statement above this for-loop is used to differentiate between the first loop and second loop.
You should see the following Output:
```
Drums
Violin
Guitar
Piano

Drums
Guitar
Piano
```
We can see, the first loop prints all values, whereas the second loop is now missing the String 'Violin' after invoking the `remove()` method.

7. Finally, we'll call the `remove()` method once more, but this time, we'll use an index value instead. Add the following to your code then run your program:
```Java
instruments.remove(1);

System.out.println();
for (int i = 0; i < instruments.size(); i++) {
  System.out.println(instruments.get(i));
}
```
You should see the following Output:
```
Drums
Violin
Guitar
Piano

Drums
Guitar
Piano

Drums
Piano
```
When passing an integer as the argument to the `remove()` method, an element is removed based on its index. 'Guitar' was originally the 3rd element of the collection, meaning it was index 2; however, after removing 'Violin' from the collection, 'Guitar' became the second element, meaning its index was 1.

8. Your Turn! Now that you've seen how to create and use ArrayLists, create a new ArrayList of Integer values (note, you should use the wrapper class Integer, not the primitive type).
9. Add the following values to the newly created Arraylist:
    * 15, 22, 99, 75, 16, 2
10. Using a for-loop, print the values of this ArrayList to the console.
11. Finally, create a second for-loop which prints these values in reverse order.

### Test:
Use the test provided. The test takes all the extra print outs into account.

#### Sample output:
```
Drums
Violin
Guitar
Piano

Drums
Guitar
Piano

Drums
Piano
15
22
99
75
16
2
2
16
75
99
22
15
```