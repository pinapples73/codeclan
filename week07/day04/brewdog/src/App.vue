<template lang="html">
  <div id="app">
    <h1>BrewDog</h1>
    <nav-bar></nav-bar>

    <div class="main-container">
      <beers-list id="beerlist" :beers='beers'></beers-list>
      <beer-details id="beerdetails" :favBeersList="favBeersList" :beer="selectedBeer"></beer-details>
      <fav-beers :favBeersList="favBeersList"></fav-beers>
    </div>
  </div>
</template>

<script>
import { eventBus } from './main.js'
import BeersList from './components/BeersList.vue';
import ListItem from './components/ListItem.vue';
import BeerDetails from './components/BeerDetails.vue';
import NavBar from './components/NavBar.vue';
import FavBeers from './components/FavBeers.vue';


export default {
  name: "app",
  data (){
    return {
      beers: [],
      selectedBeer: null,
      favBeersList: []
    };
  },
  mounted (){
    fetch('https://api.punkapi.com/v2/beers')
    .then(response => response.json())
    .then(recievedData => this.beers = recievedData)

    eventBus.$on('beer-selected', (beer) => {
      this.selectedBeer = beer;
    })

    eventBus.$on('beer-favourite', (favBeer) => {
      this.favBeersList.push(favBeer);
    })
  },
  components: {
    "beers-list": BeersList,
    "list-item": ListItem,
    "beer-details": BeerDetails,
    "nav-bar": NavBar,
    "fav-beers": FavBeers
  }

}
</script>

<style lang="css" scoped>

.main-container {
  display: flex;
  flex-direction: row;
  align-items: flex-start;
}
#beerlist {
  display: flex;
  flex-basis: 50%;
}

#beerdetails {
  display: flex;
  flex-basis: 50%;
  flex-direction: column;
}


</style>
