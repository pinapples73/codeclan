

const Pet = function(name, species){
  this.name = name;
  this.species = species;

};

Pet.prototype.eat = function(food){
  this.food = food;
  console.log(`${this.name} ate ${this.food}`);
}



module.exports = Pet;
