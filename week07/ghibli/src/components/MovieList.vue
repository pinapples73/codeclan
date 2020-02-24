<template>
  <div id="all-items">
    <div id='movie-item' v-for="(movie, index) in newMovieData">
      <movie-list-item :movie='movie' :peopleData='newPeopleData'/>
    </div>
  </div>
</template>

<script>
import MovieListItem from "./MovieListItem.vue"

export default {
  name: 'movie-list',
  props: ['movieData', 'peopleData'],
  components: {
    'movie-list-item': MovieListItem
  },
  data(){
    return{
      newMovieData: this.movieData,
      newPeopleData: this.peopleData
    }
  }
}

</script>

<style lang="css" scoped>
  #movie-item{
    margin-bottom: 20px;
    background-color: #FFF0F5;
    font-size: 13px;
  }

</style>
