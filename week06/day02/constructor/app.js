const Pet = require('./pet.js');
const Person = require('./person.js');

const skye = new Pet('Skye', 'Dog');
const gordon = new Person('Gordon', skye);

gordon.feedPet('Cheddar');
