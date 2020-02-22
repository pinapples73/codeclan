<template>
  <div id='app'>
    <div id='message-bar'>
      <ghibli-sub-header v-if="!movieData.length" subHeading='fetching Ghibli movie goodness...'/>
      <ghibli-sub-header v-else-if="!peopleData.length" subHeading='inviting round some Ghibli characters...'/>
    </div>


    <div id='title'>
      <ghibli-header/>
    </div>

    <nav-bar id='navigation'/>

    <div id='content-display'>
      <div v-if="selectedMenu === 'movie'" id='movie-details'>
        <movie-list :movieData='movieData' :peopleData='peopleData'/>
      </div>

      <div v-else-if="selectedMenu ==='characters'" id='character-details'>
        <character-list :movieData='movieData' :peopleData='peopleData'/>
      </div>

      <div v-else id='welcome-details'>
        <h3>welcome screen</h3>
      </div>
    </div>

  </div>
</template>

<script>
import { eventBus } from "./main.js";
import GhibliHeader from "./components/GhibliHeader.vue";
import GhibliSubHeader from "./components/GhibliSubHeader.vue"
import NavBar from "./components/NavBar.vue";
import MovieList from "./components/MovieList.vue";
import CharacterList from "./components/CharacterList.vue";

export default {
  name: "app",
  components:{
    'ghibli-header': GhibliHeader,
    'nav-bar': NavBar,
    'ghibli-sub-header': GhibliSubHeader,
    'movie-list': MovieList,
    'character-list': CharacterList
  },
  data(){
    return {
      movieData: [],
      peopleData: [],
      selectedMenu: 'welcome'
    }
  },
  computed:{

  },
  methods:{
    getFilms: function() {
      fetch("https://ghibliapi.herokuapp.com/films/")
        .then(response => response.json())
        .then(mdata => this.movieData = mdata);
    },
    getPeople: function() {
      fetch("https://ghibliapi.herokuapp.com/people/")
        .then(response => response.json())
        .then(pdata => this.peopleData = pdata);
    }
  },
  mounted(){
    this.getFilms();
    this.getPeople();

    eventBus.$on("menu-selected", menu => (this.selectedMenu = menu));
  }
}
</script>

<style lang="css" scoped>
  #app {
    font-family: 'Roboto';
    display: grid;
    grid-template-columns: 130px auto;
    grid-template-rows: 220px auto auto;
  }
  #title{
    grid-column-start: 1;
    grid-column-end: 3;
    grid-row-start: 1;
    background-color: #0081C1;
  }

  #navigation {
    grid-column-start: 1;
    grid-column-end: 2;
    grid-row-start: 2;
    padding: 5px;

  }
  #content-display{
    grid-column-start: 2;
    grid-column-end: 3;
    grid-row-start: 2;
    grid-row-end: 4;
    padding-left: 30px;
    padding-right: 30px;
    padding-top:10px;
  }


  #message-bar{
    height:20px;
  }
  #content-display{
  }

</style>
