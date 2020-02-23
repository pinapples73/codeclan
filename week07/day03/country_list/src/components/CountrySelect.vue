<template lang="html">
  <form>
    <label for="countrySelect">Select A Country</label>
    <select id="countrySelect" v-on:change="handleChange" v-model="country">
      <option  v-for="(country, index) in countries" :value="country" :key="index">{{country.name}}</option>
    </select>
  </form>
</template>

<script>
import{ eventBus } from '../main.js'

export default {
  name: 'country-select',
  data(){
    return{
      country: null
    }
  },
  props: ['countries'],
  methods: {
    handleChange(){
      eventBus.$emit('country-selected', this.country);
    }
  }
}
</script>

<style lang="css" scoped>
</style>
