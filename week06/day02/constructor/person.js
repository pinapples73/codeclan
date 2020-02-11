const Person = function(name, pet) {
  this.name = name;
  this.pet = pet;
};

Person.prototype.greet = function() {
  console.log(`Hi! My name is ${this.name}`);
}

Person.prototype.feedPet = function(food){
  this.food = food;
  console.log(`${this.name} fed ${this.pet.name} ${this.food}`);
  this.pet.eat(food);
}

module.exports = Person;
