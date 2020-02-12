const IsogramFinder = function (word) {
  this.word = word.toLowerCase();
  this.word = this.word.split('');
}

IsogramFinder.prototype.isIsogram = function () {
  const result = this.word.every((letter, index, wordArray) => {
    return wordArray.indexOf(letter) === index;
  });
  return result;
};


module.exports = IsogramFinder;
