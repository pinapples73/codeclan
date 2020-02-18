import Vue from 'vue';

document.addEventListener('DOMContentLoaded', () => {
  new Vue({
    el: '#app',
    data: {
      dogImgURL: null
    },
    mounted(){
      this.fetchDog()
    },
    methods: {
      fetchDog: function(){
        const request = fetch("https://dog.ceo/api/breeds/image/random")
        .then(response => response.json())
        .then(data => this.dogImgURL = data.message);
      }
    }
  })
})
