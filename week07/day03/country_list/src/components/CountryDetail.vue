<template lang="html">
  <div v-if='country'>
    <h4>{{country.name}}</h4>
    <p>Capital: {{country.capital}}</p>
    <p>Population: {{country.population}}</p>
    <p>Langauages:</p>
    <p id="language" v-for="(language, index) in country.languages">{{language.name}}</p>
    <p>
      <img :src="country.flag">
    </p>
  </div>
</template>

<script>
export default {
  name: 'country-detail',
  props: ['country']
}
</script>

<style lang="css" scoped>
#language {
  text-indent: 50px;
}
img {
  height: 100px;
}
</style>
