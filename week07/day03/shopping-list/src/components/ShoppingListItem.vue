<template lang="html">
  <li :class="purchasedClass"> {{ item.name }}</li>
</template>

<script>
export default {
  name: 'shopping-list-item',
  props: ['item'],
  computed: {
    purchasedClass: function() {
      if(this.item.isPurchased){
        return "purchased";
      } else {
        return "not-purchased";
      }
    }
  }
}

</script>

<style lang="css" scoped>
.not-purchased {
  background-color: lightgoldenrodyellow;
}

.purchased {
  text-decoration: line-line-through;
  background-color: red;
}
</style>
