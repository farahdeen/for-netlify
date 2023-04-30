public class cssPath {
    public static void main(String[] args) {
        System.out.println("use css");
    }
}

/*

-	For id:  Ul#catagories
-	For class:  div.header-inner
-	For cl1.cl2.cl3:  input.for-control.private-form.control-login
-	Id&class: input#username.for-control.private-form.control-login
-	Id&type: input[id=’username’][type=’email’]
-  contains: input[id*='user']
-  dyanimc id : input[id*=test_]
-  slecting list : ul#catagories>li:nth-of-type(2)
-  select all in list: ul#catagories>li:nth-of-type(n)
-  sibling: div.input-form.input-wrapper+div
-  > is eqaul to // ex: a#ShopLink._1yCAJ>._2BHWw>._13iYl




1)	For Id: htmltag#id or #id
Ex: ul#catagory

2)  For class: htmltag.classname or htmltag.c1.c2 and so on
ex: div.header-inner

3)  Parent: use this symbol >
Ex:parent>

4) contains method:
ex: input[id*='user']

5) for dynamic ids's like test_123,after underscore _number is dynamic.
use : input[id*=test_]

6) to select from list use nth-of-type
ul#catagories>li:nth-of-type(2)

7) to select all elements in the list use (n)
ul#catagories>li:nth-of-type(n)

8)sibling use +
div.input-form.input-wrapper+div
 */
