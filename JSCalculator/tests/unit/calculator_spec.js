const Calculator = require('../../public/js/calculator.js')
const assert = require('assert')

describe('calculator', function () {
  beforeEach(function () {
    calculator = new Calculator()
  });

  // write unit tests here in the form of "it should do something..."
  it('it has a sample test', function(){
    assert.equal(true, true)
  })

  it('should add 1 to 4 to get 5', function (){
    calculator.previousTotal  = 1
    calculator.add(4)
    const result = calculator.runningTotal
    assert.deepStrictEqual(result, 5)
  })

  it('should subtract 4 from 7 to get 3', function (){
    calculator.previousTotal  = 7
    calculator.subtract(4)
    const result = calculator.runningTotal
    assert.deepStrictEqual(result, 3)
  })

  it('should multiply 3 by 5 to get 15', function (){
    calculator.previousTotal  = 3
    calculator.multiply(5)
    const result = calculator.runningTotal
    assert.deepStrictEqual(result, 15)
  })

  it('should divide 21 by 7 and get 3', function (){
    calculator.previousTotal  = 21
    calculator.divide(7)
    const result = calculator.runningTotal
    assert.deepStrictEqual(result, 3)
  })

  it('should concatenate multiple number button clicks', function (){
    calculator.runningTotal  = 21
    calculator.newTotal = false
    calculator.numberClick(7)
    const result = calculator.runningTotal
    assert.deepStrictEqual(result, 217)
  })

  it('should chain multiple operations together', function (){
    calculator.previousTotal  = 21
    calculator.previousOperator = '+'
    calculator.runningTotal = 7
    calculator.operatorClick('+')
    const result = calculator.runningTotal
    assert.deepStrictEqual(result, 28)
  })

  it('should clear the running total without affecting the calculation', function (){
    calculator.runningTotal = 7
    calculator.clearClick()
    const result = calculator.runningTotal
    assert.deepStrictEqual(result, 0)
    calculator.add(9)
    const result2 = calculator.runningTotal
    assert.deepStrictEqual(result2, 9)
  })

});
