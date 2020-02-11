const assert = require('assert');
const Taxi = require('../taxi.js')

describe('Taxi', function(){
  beforeEach(function(){
    taxi = new Taxi('Skoda', 'Rapid', 'Jane');
  });

  it('should have a manufacturer', function(){
    //ARRANGE - see beforeEach() function
    //ACT
    const actual = taxi.manufacturer;
    const expected = 'Skoda';
    //ASSERT
    assert.strictEqual(actual, expected);
  });

  it('should have a model', function(){
    //ARRANGE - see beforeEach() function
    //ACT
    const actual = taxi.model;
    const expected = 'Rapid';
    //ASSERT
    assert.strictEqual(actual, expected);
  });

  it('should have a driver', function(){
    //ARRANGE - see beforeEach() function
    //ACT
    const actual = taxi.driver;
    //ASSERT()
    assert.strictEqual(actual, 'Jane');
  });

  describe('passengers', function(){
    it('should start with no passengers', function(){
      const actual = taxi.passengers;
      assert.deepStrictEqual(actual,[]);
    });

    it('should be able to check the number of passengers', function(){
      const actual = taxi.countPassengers();
      assert.strictEqual(actual, 0);
    });

    it('should be able to take passengers', function(){
      taxi.addPassenger('Bob');
      const actual = taxi.countPassengers();
      assert.deepStrictEqual(actual, 1);
    });

    it('should be able to drop passengers off', function(){
      taxi.addPassenger('Bob');
      taxi.addPassenger('Bobette');
      taxi.removePassengerByName('Bob');
      const actual = taxi.countPassengers();
      assert.strictEqual(actual, 0);
    });

    it('should be able to remove all passengers', function(){
      taxi.addPassenger('Bob');
      taxi.addPassenger('Bobette');
      taxi.removeAllPassengers();
      const actual = taxi.countPassengers();
    })
  });
});
