import Vue from 'vue';

document.addEventListener('DOMContentLoaded', () => {
  new Vue({
    el: "#app",
    data:{
      countriesData: [],
      selectedCountry: "",
      singleCountry: ""
    },
    mounted() {
      this.fetchCountries()
    },
    computed:{
      totalPopulation: function(){
        return this.calculateTotalPopulation()
      },
      mapByCountryName: function(){
        return this.countriesData.map((country) => {
          return country.name;
        });
      }
    },
    methods: {
      fetchCountries: function(){
        const request = fetch("https://restcountries.eu/rest/v2/all")
        .then(response => response.json())
        .then(data => this.countriesData = data)
      },
      calculateTotalPopulation: function(){
        return this.countriesData.reduce((total, country) => {
          return total + country.population;
        }, 0)
      },
      singleCountryDetails: function(){
        return this.countriesData.filter((country) => {
          if (country.name === this.selectedCountry) {
            this.singleCountry = country
          };
        })
      }
    }
  })

})


// return this.journeys.map((journey) => {
//     return journey.endLocation;
//   });

// return this.journeys.filter((journey) => {
//     if (journey.distance > minDistance) {
//       return journey;
//     };
//   });
