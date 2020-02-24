<template lang="html">
  <div id='side-bar'>
    <nav-search />
    <nav-menu/>
  </div>
</template>

<script>
import NavSearch from "./NavSearch.vue";
import NavMenu from "./NavMenu.vue";

export default {
  name: 'nav-bar',
  data(){
    return {

    }
  },
  components: {
    'nav-search': NavSearch,
    'nav-menu': NavMenu
  }
}
</script>

<style lang="css" scoped>

  #side-bar{
    display:flex;
    flex-direction: column;
    background-color: #C9DAEA;
  }
</style>
