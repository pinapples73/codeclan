document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript loaded');

  //FUNCTION FOR HANDING SUBMIT
  const handleFormSubmit = function(event) {
    event.preventDefault();
    // console.log(event);

    let checkedValues = '';
    let subGenreElements = event.target.checkSubGenre;
    console.log(event.target.checkSubGenre);
    for(let i=0; i < subGenreElements.length; i++){
          if(subGenreElements[i].checked){
               checkedValues += (subGenreElements[i].value + '/');
          }
    }

    const resultList = document.querySelector('#list-movies');
    const newListItem = document.createElement('li');

    newListItem.textContent = `
    Title: ${event.target.inputTitle.value} --
    Director: ${event.target.inputDirector.value} --
    Released: ${event.target.inputReleased.value} --
    Genre: ${event.target.selectGenre.value} --
    Sub-genre: ${checkedValues} --
    Watched: ${event.target.inputWatched.value} --
    Rating: ${event.target.radioRating.value} stars`;

    resultList.appendChild(newListItem);

    document.getElementById("form-movie").reset();

  }


  // QUERYSELECTOR FOR FORM
  const form = document.querySelector('#form-movie')

  //EVEN HANDLER FOR FORM SUBMIT
  form.addEventListener('submit', handleFormSubmit)


});
