<template>
  <div id="all-items">
    <div id='character-item' v-for="(person, index) in peopleData">
      <character-list-item :person='person' :movieData='movieData'/>
    </div>
  </div>
</template>

<script>
import CharacterListItem from "./CharacterListItem.vue"

export default {
  name: 'character-list',
  props: ['movieData', 'peopleData'],
  components: {
    'character-list-item': CharacterListItem
  }
}

</script>

<style lang="css" scoped>
  #character-item{
    margin-bottom: 20px;
    background-color: #FFF0F5;
    font-size: 13px;
  }

</style>
