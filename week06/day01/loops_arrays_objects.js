// var sports = ['football', 'tennis', 'rugby'];
// //
// // console.log('number of elements:', sports.length);
// // // console.log('first sport:', sports[0]);
// // // console.log('second sports:', sports[1]);
// //
// sports.push('curling');
// sports.push('snooker');
// sports.push('darts');
// // // console.log('sports array:', sports);
// //
// sports.pop();
// // console.log('sports:', sports);
// //
// // var removedSport = sports.pop();
// // console.log('Removed sport:', removedSport);
//
// sports.unshift('basketball');
// // console.log('sports array:', sports);
//
// var removedSport = sports.shift();
// // console.log('removed sport:', removedSport);
//
// var removedSport = sports.splice(3, 1);
// console.log('removed sport:', removedSport);
//
// console.log('sports array:', sports);

// for (var sport of sports) {
//   var upperCaseSport = sport.toUpperCase();
//   console.log(upperCaseSport);
// }
//
// for (let i = 0; i < sports.length; i++){
//   // var sport = sports[i];
//   // var upperCaseSport = sport.toUpperCase();
//   //   console.log(upperCaseSport);
// }

// for (initialiseCounter; condition; mutateCounter) {
//   //do something
// }


var movie = {
  title: 'Parasite',
  year: 2019,
  language: 'Korean'
};
//
// console.log('movie object:', movie);
// console.log('movie title:', movie.title);
movie.cast = ['Song Kang-ho', 'Lee Sun-kyun'];

movie.language = 'English';

movie['language'] = 'French'; //required if you have special characters in key
movie['subtitle-language'] = 'English'; // like here
// console.log('movie object:', movie);

var propertyToAccess = 'subtitle-language';
movie[propertyToAccess] = 'German';
// console.log('subtitle language:', movie[propertyToAccess]);
// console.log('subtitle language:', movie.propertyToAccess);

delete movie.year;
// console.log('movie without year', movie);

movie.ratings = {
   critic: 94,
   audience: 95
}

// // console.log('movie obj:', movie);
// console.log('audience ratings:', movie.ratings.audience);
//
// for (var key in movie) {
//   console.log(`The ${key} is ${movie[key]}`);
// }

var keys = Object.keys(movie);
console.log('keys:', keys);
