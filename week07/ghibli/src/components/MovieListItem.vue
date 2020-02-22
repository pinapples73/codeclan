<template>
  <div>
    <p id='movie-title'>{{movie.title}}</p>
    <section id='movie-details'>
      <p>Director: {{movie.director}}</p>
      <p>Producer: {{movie.producer}}</p>
      <p>Release Date: {{movie.release_date}}</p>
      <p>Rotten Tomatoes Score: {{movie.rt_score}}</p>
      <p>Description: {{movie.description}}</p>
    </section>
    <section id='people-in-movie' v-if="nameArray.length" >
      <p>Characters:- </p>
      <div v-for="(name, index) in this.nameArray">
        <p v-if="index < (nameArray.length)-1" > {{name}} /</p>
        <p v-if="index === (nameArray.length)-1" > {{name}} </p>

      </div>

    </section>

  </div>
</template>

<script>
export default {
  name: 'movie-list-item',
  props: ['movie', 'peopleData'],
  data (){
    return {
      nameArray: []
    }
  },
  mounted(){
    this.filterPeopleByMovie();
  },
  methods: {
    filterPeopleByMovie: function () {
      this.peopleData.map((person) => {
        for(const film of person.films) {
          if(film.includes(this.movie.id))
            this.nameArray.push(person.name)
        }

      })

    }
  }
}
</script>

<style lang="css" scoped>

  #movie-title{
    background-color: black;
    color: white;
    padding: 5px;
  }
  #movie-details{
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
    justify-content: space-around;
    padding: 5px;
  }
  #people-in-movie{
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
    justify-content: flex-start;
    background-color: #0081C1;
    color: white;
    padding-left: 5px;
    padding-right: 5px;
  }
</style>
