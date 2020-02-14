document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript loaded');

  const handleFormSubmit = function(event){
    event.preventDefault();
    const resultList = document.querySelector('#reading-list');
    const newListItem = document.createElement('li');
    newListItem.textContent = `${event.target.title.value}, ${event.target.author.value}, ${event.target.category.value}`;
    resultList.appendChild(newListItem);
    document.getElementById("new-item-form").reset();
  }

  const handleFormDelete = function(event){
    event.preventDefault();
    const result = document.querySelector('#reading-list');
    result.innerHTML = ''
    // result.removeChild(result.childNodes[0])
  }

  const form = document.querySelector('#new-item-form')
  form.addEventListener('submit', handleFormSubmit)

  const delForm = document.querySelector('h1')
  delForm.addEventListener('click', handleFormDelete)

  const deleteAll = document.createElement("button")
  deleteAll.innerHTML = "Delete All"
  delForm.appendChild(deleteAll)
});


// document.addEventListener('DOMContentLoaded', () => {
//   const newListItem = document.createElement('li');
//   newListItem.textContent = "Purple"
//   newListItem.classList.add('purple')
//   const list = document.querySelector('ul');
//   list.appendChild(newListItem);
