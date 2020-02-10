// var name = 'Jill';
//
// var secretFunction = function(){
//   var pinCode = [0,0,0,0];
//   console.log('pinCode is:', pinCode);
//   console.log('name inside of function:', name);
// }
//
// secretFunction();
// // console.log('pinCode outside of function:', pinCode);
// // console.log('name outside of secretFunction:', name);
//
// var filterNamesByFirstLetter = function(names, letter){
//   var filterNames = [];
//   for(let name of names) {
//     if (name[0] === letter) {
//       filterNames.push(name);
//     }
//   }
//   console.log('name after forLoop:', name);
//   return filterNames;
// }
//
// var students = ['John', 'Jack', 'Joseph', 'Kevin']
// console.log(filterNamesByFirstLetter(students, 'J'));

// let isItFive = function(number){
//   let result;
//   if (number === 5) {
//     result = true;
//   } else {
//     result = false;
//   }
//   return result;
// }
// //
// // console.log(isItFive(4));
// // console.log(isItFive(5));
//
// let calculateEnergy = function(mass) {
//   const speedOfLight = 299792458;
//   return mass * speedOfLight ** 2;
// }
//
// let energyOfMe = calculateEnergy(68);
// console.log('emergy of me:', energyOfMe);
//
// const song = {
//   title: 'Raspberry Beret',
//   artist: 'Prince'
// }
//
// console.log('song before mutation:', song);
// song.title = 'When Doves Cry';
// console.log('song after mutation:', song);

const helloWorld = function(){
  result = 'Hellow World!';
};

helloWorld();
console.log(result);
