<template>
  <div id='app'>
    <div id='message-bar'>
      <at-sub-header v-if="!movieData.length" subHeading='fetching Ghibli movie goodness...'/>
      <at-sub-header v-else-if="!peopleData.length" subHeading='inviting round some Ghibli characters...'/>
    </div>


    <div id='title'>
      <at-header/>
    </div>

    <div id='main-display'>
      <nav-bar id='navigation'/>
      <main-content id='main-display' />
    </div>

  </div>
</template>

<script>
import { eventBus } from "./main.js";
import ATHeader from "./components/ATHeader.vue";
import ATSubHeader from "./components/ATSubHeader.vue"
import NavBar from "./components/NavBar.vue";
import MainContent  from "./components/MainContent.vue";

export default {
  name: "app",
  components:{
    'at-header': ATHeader,
    'nav-bar': NavBar,
    'at-sub-header': ATSubHeader,
    'main-content': MainContent
  },
  data(){
    return {
      movieData: [],
      peopleData: [],
      testURL: 'https://comicvine.gamespot.com/api/issues/?api_key=8953777d6f45220b5a3a0ba39b78fd87df4d2e5d&filter=name:hellboy&format=json',
    }
  },
  computed:{

  },
  methods:{
    getFilms: function() {
      fetch(this.testURL, {mode: 'no-cors'})
        .then(response => response.json())
        .then(mdata => this.movieData = mdata);
    },
    //
    // getFilms: function() {
    //   fetch("https://comicvine.gamespot.com/api/issues/?api_key=8953777d6f45220b5a3a0ba39b78fd87df4d2e5d&filter=name:hellboy&format=json")
    //     .then(response => response.json())
    //     .then(mdata => this.movieData = mdata);
    // },
    getPeople: function() {
      fetch("https://ghibliapi.herokuapp.com/people/")
        .then(response => response.json())
        .then(pdata => this.peopleData = pdata);
    }
  },
  mounted(){
    this.getFilms();
    this.getPeople();
  }
}
</script>

<style lang="css" scoped>
  #app {
    display: flex;
    flex-direction: column;
    height: 100%;
    background-color: #0081C1;
  }
  #navigation {
    width: 120px;
  }
  #main-display{
    display: flex;
    flex-direction: row;
    background-color: white;
    width: 100%;
  }
  #title{
    display: flex;
    justify-content: center;
  }
  #message-bar{
    height:20px;
  }

</style>
