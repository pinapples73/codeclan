<template lang="html">
  <main>
    <h1>My Shopping List</h1>
    <ul>
      <shopping-list-item v-for="(product, index) in items" :key="index" :item="product"/>

    </ul>
  </main>

</template>

<script>
import ShoppingListItem from './components/ShoppingListItem.vue';

export default {
  name: 'app',
  data(){
    return{
      items: [
        {name: 'Soy Milk', isPurchased: false},
        {name: 'Tofu', isPurchased: true},
        {name: 'Aubergine', isPurchased: false}
      ]
    };
  },
  components: {
    'shopping-list-item': ShoppingListItem
  }
}
</script>

<style lang="css" scoped>
</style>
