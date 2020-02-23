<template lang="html">
  <form id='search' >
    <input  v-on:change="handleSearch" type="text" v-model="search" placeholder="Filter.."/>
  </form>
</template>

<script>
export default {
  name: 'nav-search',
  props: ['selectedMenu'],
  data(){
    return{
      search: ''
    }
  },
  methods:{
    handleSearch: function(){
      if(this.search) {
        if(this.selectedMenu==='characters') {
          this.searchPeople();
        } else {
          this.searchMovies();
        }
      }
    },
    searchPeople: function(){
      console.log("we are in charcters");
    },
    searchMovies: function(){
      console.log("we are not in characters");
    }
  }
}
</script>

<style lang="css" scoped>
#search{
  background-color: #191516;
  color: #C9DAEA;
  padding: 5px;
  position: relative;
}
input {
  padding: 4px 12px;
  width: 85px;
  color: rgba(0,0,0,.70);
  border: 1px solid rgba(0,0,0,.12);
  transition: .15s all ease-in-out;
  background: white;
  &:focus {
    outline: none;
    transform: scale(1.05);
    & + label  {
      font-size: 10px;
      transform: translateY(-24px) translateX(-12px);
    }
  }
}


</style>
