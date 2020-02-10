// // NAMED FUNCTION
// function sayHello(greeting, name = 'World'){
//   return `${greeting} ${name}!`;
// };
//
// // console.log('sayHello message:', sayHello());
// console.log('sayHello message:', sayHello('Hello', 'Niall'));

// ANNONYMOUS FUNCTION
// var add = function(firstNumber, secondNumber){
//   return firstNumber + secondNumber;
// }
//
// console.log(add(1,2));

//

// Task: 20 minutes
// Declare a named function that takes an array of numbers, and returns the sum, or total, of all of the numbers in the array.
// Define an anonymous function expression that takes two arguments:
// an object, for example, { name: 'Wojtek', age: 30 }
// a string, for exmaple, 'name'
// Your function should return true if the given string is a key on the given object and false if the object does not have a key that matches the string. Store this function in an appropriately named variable to invoke it.

// function sumOfArray(numbersArray) {
//   var total = 0;
//   for (var number of numbersArray ) {
//     total += number;
//   }
//   return total;
// }
//
// numbers = [1,2,3,4,5]
// console.log(`The sum of all numbers is ${sumOfArray(numbers)}`);
//
//
//


//ARROW FUNCTION
var multiply = (firstNumber, secondNumber) => {
  return firstNumber * secondNumber;
}

console.log(multiply(2,3));
