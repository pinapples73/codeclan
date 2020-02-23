const Park = function (name, ticketPrice, dinoCollection) {
  this.name = name;
  this.ticketPrice = ticketPrice;
  this.dinoCollection = dinoCollection;
}

Park.prototype.checkName = function () {
  return this.name;
}

Park.prototype.checkTicketPrice = function (){
  return this.ticketPrice;
}

Park.prototype.checkDinoCollection = function (){
  return this.dinoCollection.length;
}

Park.prototype.addDinosaur = function (newDinosaur){
  this.dinoCollection.push(newDinosaur);
}

Park.prototype.removeDinosaur = function (oldDinosaur) {
  const index = this.dinoCollection.indexOf(oldDinosaur);
  this.dinoCollection.splice( index, 1 );
}

Park.prototype.mostPopDino = function(){
  let currentDinoPopularity = 0;
  let popDino;
  for (const dino of this.dinoCollection) {
    if (dino.guestsAttractedPerDay > currentDinoPopularity){
      popDino = dino.species;
      currentDinoPopularity = dino.guestsAttractedPerDay;
    }
  }
  return popDino;
}

Park.prototype.findBySpecies = function(speciesToCheck){
  let speciesList = [];
  for (const dino of this.dinoCollection) {
    if (dino.species === speciesToCheck) {
      speciesList.push(dino);
    }
  }
  return speciesList.length;
}

Park.prototype.totalVisitorsPerDay = function(){
  let total = 0;
  for (const dino of this.dinoCollection) {
    total += dino.guestsAttractedPerDay;
  }
  return total;
}

Park.prototype.totalVisitorsPerYear = function(){
  let total = 0;
  total = this.totalVisitorsPerDay() * 365;
  return total;
}

Park.prototype.yearlyRevenue = function(){
  let total = 0;
  total = this.totalVisitorsPerYear() * this.ticketPrice;
  return total;
}

Park.prototype.noOfDinosaursByDiet = function (){

}

module.exports = Park;
