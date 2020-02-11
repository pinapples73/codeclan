const Taxi = function(manufacturer, model, driver){
  this.manufacturer = manufacturer;
  this.model = model;
  this.driver = driver;
  this.passengers = [];
};

Taxi.prototype.countPassengers = function(){
 return this.passengers.length;
};

Taxi.prototype.addPassenger = function(passenger){
  this.passengers.push(passenger)
};

Taxi.prototype.removePassengerByName = function(passenger){
  const
  this.passengers.
//   var arr = ["orange","red","black","white"];
// var index = arr.indexOf("red");
// if (index >= 0) {
//   arr.splice( index, 1 );
}
}

module.exports = Taxi;


//
// Employing TDD, add the following methods to your taxi:
// numberOfPassengers

// addPassenger

// removePassengerByName
// removeAllPassengers
// A passenger should be represented as a String containing the passenger's name.
