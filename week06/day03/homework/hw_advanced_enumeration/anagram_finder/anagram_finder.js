const AnagramFinder = function (word) {
  this.originalWord = word.toLowerCase();
  this.word = word.toLowerCase();
  this.word = this.word.split('');
  this.word = this.word.sort();
  this.word = this.word.join('');
  this.word = this.word.toLowerCase();
}


AnagramFinder.prototype.findAnagrams = function (otherWords) {
  const returnArray = [];
  const result = otherWords.filter((wordTwo) => {
    if (wordTwo !== this.originalWord) {
      let splitWord;
      splitWord = wordTwo.toLowerCase();
      splitWord = splitWord.split('');
      splitWord = splitWord.sort();
      splitWord = splitWord.join('');

      if (this.word === splitWord) {
        returnArray.push(wordTwo);
      };
    };
  });
  return returnArray;
};


module.exports = AnagramFinder;
