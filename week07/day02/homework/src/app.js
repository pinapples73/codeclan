import Vue from 'vue';

document.addEventListener('DOMContentLoaded', () => {
  new Vue({
    el: "#app",
    data: {
      rateData: {},
      fromRate: 0,
      toRate: 0,
      amount: 0,
      toEuro: 0,
      toAnyCurrency: 0
    },
    mounted(){
      this.fetchRates();
    },
    computed: {
      addEuro: function() {
        if (this.rateData.rates !== undefined) {
          this.rateData.rates["EUR"] = 1.00;
          console.log(this.rateData.rates);
        }
      }
    },
    methods: {
      fetchRates: function(){
        const request = fetch("https://api.exchangeratesapi.io/latest")
        .then(response => response.json())
        .then(data => this.rateData = data)
      },
      convertCurrency: function(){
        this.toAnyCurrency = ((this.toRate / this.fromRate) * this.amount).toFixed(2);
      }

    }
  })
})
