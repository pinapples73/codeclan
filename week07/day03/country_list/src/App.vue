<template lang="html">
  <div>
    <h3>Country List</h3>
    <div class="main-container">
      <country-detail :country='selectedCountry'></country-detail>
      <countries-list :countries='countries'></countries-list>

    </div>
  </div>

</template>

<script>
import CountriesList from './components/CountriesList.vue';
import { eventBus } from './main.js';
import CountryDetail from './components/CountryDetail.vue';

export default {
  name: "app",
  data(){
    return {
      countries: [],
      selectedCountry: null
    }
  },
  mounted() {
    fetch('https://restcountries.eu/rest/v2/all')
    .then(response => response.json())
    .then(recievedData => this.countries = recievedData)

    eventBus.$on('country-selected', (country) => {
      this.selectedCountry = country;
    })
  },
  components: {
    "countries-list": CountriesList,
    "country-detail": CountryDetail
  }
}
</script>

<style lang="css" scoped>
</style>
