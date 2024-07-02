//Introduction To javascript:

"use strict"; //Use to avoid error
console.log("Hello Smitanshu!");
var name = "Hey Smitanshu!";
console.log(name);
name = "Himanshu";

//##Variable:
var Name = "Himanshu!";
console.log(name);
var value = 10;
console.log("value :", value);
console.log("Multiplication :", value * 11);
console.log("Square root :", value ** 0.5);
console.log("Square :", value ** 2);
console.log("cube :", value ** 3);

//##let:
//let firstName = "Nikita"; ->
//let firstName = "Abc";      ->Give ambiguity

let firstName = "Nikita";
firstName = "abc";
console.log(firstName);

//##constant:
const pi = 3.14;
console.log("Constant value:", pi);
console.log("area of the circle (r=4):", pi * 4 * 4);

//##String indexing
let stringName = "Smitanshu";
console.log(stringName, "char at index 8:", stringName[8]);
console.log("Length of string :", stringName.length);

//##String manipulation :
let temp_string = "     abcdefghijklmnopqrstuvwxyz  ";
console.log(temp_string, "Length:", temp_string.length);

//It cant happen on that variable because string is immutable.
temp_string.trim();
console.log("String is immutable ", temp_string, temp_string.length);
//But we can store in the same variable name
temp_string = temp_string.trim();
console.log(temp_string, temp_string.length);

console.log("toUpperCase() :", temp_string.toUpperCase());
console.log("toLowerCase() :", temp_string.toLowerCase());

console.log("Slicing 3 to 20  :", temp_string.slice(3, 20));

//type of operator;

let age = 22;
console.log("typeof() age :", typeof age);

console.log("typeof() temp_string :", typeof temp_string);

//##Converting STRING  to INT  or vice versa.
age = age + " ";
console.log(typeof age);
console.log(
  "After converting number to string :",
  age,
  "and typeof(age) is : ",
  typeof age
);

//converting string to number:
let Temp_string = "abcderf";
Temp_string = +"";
console.log("Type of Temp_string:", typeof Temp_string);

//## string concatenation:

let string1 = "Smitanshu";
let string2 = "Ukey";
let FullName = string1 + "  " + string2;
console.log(FullName);

let string3 = "25";
let string4 = "100";
console.log(string3 + " " + string4);
console.log("Adition :", Number(string3) + Number(string4));

//To avoid multiple writing of the +
let aboutMe = `My name: ${string1}  last name: ${string2}  my age is ${22}`;
console.log(aboutMe);

let null_var = null;
console.log("Type of null :", typeof null);

/*
:VARIABLE:
->Variables can store some information.
->We can use that information
->We can change that variables
->Javascript is the case sensitive language.



:"use strict"
-> he avoid the mistakes for undeclared variables

##Rules for naming:
->You can not start with number()
->You can use only underscore (e.g 1value invalid)
->like c++.
->We can use '$ ' and '_'(underscore only ) between, end , or at front.
-> Cant use the space between variable name:
    -e.g(var first name --->Invalid)
    -e.g(var first_name---->valid )
    -This also called as the snake case writing 


    e.g(FirstName ):
    This called as the Camel case writing.




##Convention:
->start with small letter
->camelCase and snake case   


##Difference Between let and var :
->use always let due to block scope and function scope.
->Ambiguity of variable name can be possible
->Ambiguity of let name not possible
->Ambiguity:One variable name is more that once create
->After ES6 is let comes
->some problem comes in the var.


##Constant:
->cant change the value throughout the code.
->We can use that value throughout the program.

##String indexing
->Indexing starts from 0 .
->.length gives the n-1 value.

->string is immutable
    ->trim():Space removal
    ->toUpperCase() :convert into the uppercase
    ->toLowerCase() :Convert alphabet in lowercase
    ->slice:

## typeof: 
->Give types of datatype
->primitive datatype:
                    1.string
                    2.null
                    3.undefined
                    4.symbol
                    5.BigInt
                    6.Number
                    7.Boolean
                    8.string


##Conversion:
->String to Int : var_name + "";
->Int to string : + " ";
->String to integer : age=Number(age)

##String concatenation :
->string1 +  " " +string2 
->Number(string1)+number(string2)

##Template string:
->To avoid multiple + in sentence :


##undefined :
->when value not assigned  to var .

##Null:
->Nothing (e.g let var =null;)
->But typeof(null) is object.

##




 */
