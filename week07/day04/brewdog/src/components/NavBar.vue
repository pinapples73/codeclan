<template lang="html">
  <nav>
      <span v-on:click="handleAllClick" >View All</span><span> | </span> <span v-on:click:="handleFavClick" >View Favs</span>
  </nav>

</template>

<script>
import{ eventBus } from '../main.js'

export default {
  name: "nav-bar",
  methods: {
    handleAllClick(){
      
    },
    handleFavClick(){

    }
  }
}
</script>

<style lang="css" scoped>
</style>
