<template>
  <div>
    <p id='character-title'>{{person.name}}</p>
    <section id='character-details'>
      <p>Gender: {{person.gender}}</p>
      <p>Age: {{person.age}}</p>
      <p>Eye Colour: {{person.eye_color}}</p>
      <p>Hair Colour: {{person.hair_color}}</p>
    </section>

  </div>
</template>

<script>
export default {
  name: 'character-list-item',
  props: ['person', 'movieData'],
  data (){
    return {
      nameArray: []
    }
  }
}
</script>

<style lang="css" scoped>

  #character-title{
    background-color: black;
    color: white;
    padding: 5px;
  }
  #character-details{
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
    justify-content: space-around;
    padding: 5px;
  }
</style>
