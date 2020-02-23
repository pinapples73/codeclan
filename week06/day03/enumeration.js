const myNumbers = [1,2,3,4,5];
//
// // for (const number of myNumbers){
// //   console.log(`this is my number: ${number}`);
// // }
//
// // myNumbers.forEach((number, index) => {
// //   console.log(`This is my number ${number} at array position ${index}`);
// // })
//
// const multiplyByTwo = function (numbers){
//   const result = [];
//   numbers.forEach((number) => {
//     const multiplied = number * 2;
//     result.push(multiplied);
//   });
//   return result;
// };
//
// console.log(multiplyByTwo(myNumbers));

const multiplyByTwo = function (numbers){
  const result = numbers.map((number) => {
    return number * 2;
  });
  return result;
};

console.log('multiplied by two:', multiplyByTwo(myNumbers));


const getEvans = function(numbers){
  const evenNumbers = numbers.filter((number) => {
    return number % 2 === 0;
  });
  return evenNumbers;
}

console.log('Even numbers:', getEvans(myNumbers));

const sumElements = function(numbers){
  let total = numbers.reduce((runningTotal, number) => {
    return runningTotal + number;
  }, 0);

  return total;
}

console.log('Sum elements:', sumElements(myNumbers));

const ourForEach = function(array, callback) {
  for (const element of array) {
    callback(element);
  };
};

ourForEach(myNumbers, (number) => {
  console.log(` the number is ${number}`);
});
