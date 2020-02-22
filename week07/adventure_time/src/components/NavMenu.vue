<template lang="html">
  <div id='navigation-menu'>
    <at-sub-header subHeading="Main Menu"/>
    <p><nav-menu-item menuItemText="Movies"/></p>
    <p><nav-menu-item menuItemText="Characters"/></p>
  </div>


</template>

<script>
import NavMenuItem from "./NavMenuItem.vue";
import ATSubHeader from "./ATSubHeader.vue"

export default {
  name: 'nav-list',
  components:{
    'nav-menu-item': NavMenuItem,
    'at-sub-header': ATSubHeader
  }
}
</script>

<style lang="css" scoped>
  #navigation-menu{
    display: flex;
    flex-direction: column;
    padding-left: 5px;
    background-color: #C9DAEA;
  }
  p{
    padding-left: 10px;
  }
</style>
