document.addEventListener('DOMContentLoaded', () => {
  // const redListItem = document.querySelector('li.red');
  // console.log(redListItem);
  // redListItem.textContent = "RED!!!";
  // redListItem.classList.add('bold');

  // const title = document.querySelector('h1');
  // title.textContent = 'JavaScript says Change the DOM!!!';
  //
  // const paragraph = document.querySelector('#welcome-paragraph');
  // console.log('console.log', paragraph);
  // console.log('console.dir below');
  // console.dir(paragraph);
  const newListItem = document.createElement('li');
  newListItem.textContent = 'Purple';
  // newListItem.classList.add('purple');

  //get the ul to add itemn to
  const list = document.querySelector('ul');
  //attach item to ul
  list.appendChild(newListItem);

});




// Use document.querySelector to access the paragraph with the ID 'welcome-paragraph' from the DOM.
// What is the difference in output when you use console.log and console.dir?
