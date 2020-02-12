const PangramFinder = function (phrase) {
  this.alphabet = 'qwertyuiopasdfghjklzxcvbnm'.split('');
  this.phrase = phrase;
}

PangramFinder.prototype.isPangram = function () {
  const lowerCasePhrase = this.phrase.toLowerCase();

  const result = this.alphabet.every((letter) => {
    return lowerCasePhrase.includes(letter);
  });
  return result;
};

// Cinema.prototype.anyFilmsByYear = function (year) {
//   let result = this.films.some((film) => {
//     return film.year === year;
//   });
//   return result;
// };

module.exports = PangramFinder;
