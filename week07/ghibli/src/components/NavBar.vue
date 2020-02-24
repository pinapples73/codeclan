<template lang="html">
  <div id='side-bar'>
    <nav-search :selectedMenu='selectedMenu'/>
    <img id='nav-logo' src='https://images-na.ssl-images-amazon.com/images/I/71%2BCTDyxfAL._SX425_.jpg' />
    <nav-menu/>
  </div>
</template>

<script>
import NavSearch from "./NavSearch.vue";
import NavMenu from "./NavMenu.vue";

export default {
  name: 'nav-bar',
  props: ['selectedMenu'],
  components: {
    'nav-search': NavSearch,
    'nav-menu': NavMenu
  }
}
</script>

<style lang="css" scoped>

  #side-bar{
    background-color: #C9DAEA;
  }
  #nav-logo{
    height: auto;
    width: 120px;
  }
</style>
