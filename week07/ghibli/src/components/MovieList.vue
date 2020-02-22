<template>
  <div id="all-items">
    <div id='movie-item' v-for="(movie, index) in movieData">
      <movie-list-item :movie='movie' :peopleData='peopleData'/>
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
