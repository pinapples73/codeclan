<template lang="html">
  <div v-if='beer'>
    <h1>
      {{beer.name}}<br>
    </h1>

    <div>
      <p>{{beer.tagline}}</p>
      <p>First brewed: {{beer.first_brewed}}</p>
      <p>Description: {{beer.description}}</p>
      <img :src="beer.image_url">
    </div >
      <button v-if="!this.isFavourite" v-on:click="handleClick" type="button" name="favouritesButton">Me Likey</button>
      <p v-if="this.isFavourite"> You love this beer </p>
    </div>
</template>

<script>
import{ eventBus } from '../main.js'

export default {
  name: "beer-details",
  props: ['beer', 'favBeersList'],

  computed:{
    isFavourite: function() {
      return this.favBeersList.includes(this.beer);

    }
  },
  methods: {
    handleClick() {
      eventBus.$emit('beer-favourite', this.beer);
    }
  }
}
</script>

<style lang="css" scoped>

img {
  height: 300px;
  width: auto;
}

button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
