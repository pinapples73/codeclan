const Cinema = function (films) {
  this.films = films;
};




// const multiplyByTwo = function (numbers){
//   const result = numbers.map((number) => {
//     return number * 2;
//   });
//   return result;
// };

Cinema.prototype.getFilmsByList = function () {
  const result = this.films.map((film) => {
    return film.title;
  });
  return result;
};

Cinema.prototype.getFilmsByTitle = function (title) {
  const result = this.films.find((film) => {
    if (film.title === title) {
      return film;
    }
  });
  return result;
};

Cinema.prototype.filterByGenre = function (genre) {
  const result = this.films.filter((film) => {
    if (film.genre === genre) {
      return film;
    };
  });
  return result;
};

Cinema.prototype.anyFilmsByYear = function (year) {
  let result = this.films.some((film) => {
    return film.year === year;
  });
  return result;
};

Cinema.prototype.allFilmsOverLength = function (runningTime) {
  let result = this.films.every((film) => {
    return film.length > runningTime;
  });
  return result;
};

Cinema.prototype.totalRunningTimes = function () {
  let result = this.films.reduce((total, film) => {
    return total += film.length;
  }, 0);
  return result;
}

// const sumElements = function(numbers){
//   let total = numbers.reduce((runningTotal, number) => {
//     return runningTotal + number;
//   }, 0);
//
//   return total;
// }

// const getEvans = function(numbers){
//   const evenNumbers = numbers.filter((number) => {
//     return number % 2 === 0;
//   });
//   return evenNumbers;
// }


module.exports = Cinema;
