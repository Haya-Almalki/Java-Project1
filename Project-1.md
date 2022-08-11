# Todo List

---

#### Create an todo list application where users can add and delete and update they todos :

- You must handle all the cases of error :
- If the user enter a an choice not in the list , you program should not crash.
- If the user enter a incorrect datatype choice , you program should not crash. 
- Your program should keep executing until the user enter -1

##### Sample execution :

```
==== Todo List ====
Enter Your choice or choose -1 to exit 
1- To add to the todo list 
2- To delete from the todo list 
3- To update from the todo list 
4- To print all the todos 

1
Enter your todo name :
work
Your todo saved .. choose another choice
-------

1
Enter your todo name :
playing
Your todo saved .. choose another choice

-------

3
Enter the todo index that you want to replace :
0
Enter the todo name :
programming
Your todo saved .. choose another choice

-------

4
[programming,playing]
choose another choice

-------

-1
program terminated , based on user input

Process finished with exit code 0
 ```
