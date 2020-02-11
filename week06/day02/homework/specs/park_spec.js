const assert = require('assert');
const Park = require('../models/park.js');
const Dinosaur = require('../models/dinosaur.js');

describe('Park', function() {
  // let park;
  // let dinosaur1;
  // let dinosaur2;
  // let dinosaur3;
  // let dinosaurCollection;

  beforeEach(function () {
    dinosaur1 = new Dinosaur('t-rex', 'carnivore', 50);
    dinosaur2 = new Dinosaur('triceratops', 'herbivore', 77);
    dinosaur3 = new Dinosaur('pterodactyl', 'omnivore', 35);
    dinosaur4 = new Dinosaur('triceratops', 'herbivore', 45);
    dinosaur5 = new Dinosaur('allasaurus', 'carnivore', 75);

    dinosaurCollection = [dinosaur1, dinosaur2, dinosaur3];

    park = new Park('Isla Nublar', 250, dinosaurCollection);
  });

  it('should have a name', function(){
    const actual = park.checkName();
    const expected = 'Isla Nublar';
    assert.strictEqual(actual, expected);
  });

  it('should have a ticket price', function(){
    const actual = park.checkTicketPrice();
    const expected = 250;
    assert.strictEqual(actual, expected);
  });

  it('should have a collection of dinosaurs', function() {
    const actual = park.checkDinoCollection();
    const expected = 3;
    assert.strictEqual(actual, expected);
  });

  it('should be able to add a dinosaur to its collection', function(){
    park.addDinosaur(dinosaur4);
    const actual = park.checkDinoCollection()
    const expected = 4;
    assert.strictEqual(actual, expected);
  });

  it('should be able to remove a dinosaur from its collection', function(){
    park.removeDinosaur(dinosaur3);
    const actual = park.checkDinoCollection();
    const expected = 2;
    assert.strictEqual(actual, expected);
  });

  it('should be able to find the dinosaur that attracts the most visitors', function(){
    const actual = park.mostPopDino();
    const expected = 'triceratops';
    assert.strictEqual(actual, expected);
  });

  it('should be able to find all dinosaurs of a particular species', function(){
    park.addDinosaur(dinosaur4);
    const actual = park.findBySpecies('triceratops');
    const expected = 2;
    assert.strictEqual(actual, expected);
  });

  it('should be able to calculate the total number of visitors per day', function(){
    const actual = park.totalVisitorsPerDay();
    const expected = 162;
    assert.strictEqual(actual, expected);
  });

  it('should be able to calculate the total number of visitors per year', function(){
    const actual = park.totalVisitorsPerYear();
    const expected = 59130;
    assert.strictEqual(actual, expected);
  });

  it('should be able to calculate total revenue for one year', function(){
    const actual = park.yearlyRevenue();
    const expected = 14782500;
    assert.strictEqual(actual, expected);
  });

});
