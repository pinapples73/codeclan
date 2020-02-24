<template lang="html">
  <div id='navigation-menu'>
    <button id="menu-item" v-on:click="handleMovie">Movies</button>
    <button id="menu-item" v-on:click="handleCharacters">Characters</button>
  </div>
</template>

<script>
import GhibliSubHeader from "./GhibliSubHeader.vue"

import { eventBus } from "../main";

export default {
  name: 'nav-menu',
  components:{
    'ghibli-sub-header': GhibliSubHeader
  },
  computed:{

  },
  methods: {
    handleMovie: function() {
      const selectedMenu = 'movie';
      eventBus.$emit("menu-selected", selectedMenu);
    },
    handleCharacters: function() {
      const selectedMenu = 'characters';
      eventBus.$emit("menu-selected", selectedMenu);
    }
  }
}
</script>

<style lang="css" scoped>
  #navigation-menu{

    background-color: #C9DAEA;
  }
  #menu-item{
    padding-left: 10px;
    color:black;
    background-color: #C9DAEA;
    border: none;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    width: 120px;
  }
  #menu-item:hover{
    padding-left: 10px;
    color: white;
    background-color: black;
    cursor: pointer;
  }

</style>
