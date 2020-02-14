document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript has loaded');



  const handleButtonClick = function() {
    console.log('Button has been clicked');
    //grab result paragraph
    const resultParagraph = document.querySelector('#button-result');
    //change result paragraph text to say something
    resultParagraph.textContent = 'The button has beebn clicked!';
  }

  const button = document.querySelector('#button');
  button.addEventListener('click', handleButtonClick);





  const handleTextInput = function () {
    console.log(event);
    const inputResult = document.querySelector('#input-result');
    inputResult.textContent = `You have typed: ${event.target.value}`;
  }

  const textInput = document.querySelector('#input');
  textInput.addEventListener('input', handleTextInput);





  const dropDownSelected = function () {
    const resultParagraph = document.querySelector('#select-result');
    resultParagraph.textContent = `You selected: ${event.target.value}`
  }

  const dropDown = document.querySelector('#select');
  dropDown.addEventListener('change', dropDownSelected);





  const handleFormSubmit = function (event) {
    event.preventDefault();
    // debugger;
    console.log(event.target.first_name.value);
    const resultParagraph = document.querySelector('#form-result');
    resultParagraph.textContent = `Your name: ${event.target.first_name.value} ${event.target.last_name.value}`;
  }


  const form = document.querySelector('#form');
  form.addEventListener('submit', handleFormSubmit);

});
