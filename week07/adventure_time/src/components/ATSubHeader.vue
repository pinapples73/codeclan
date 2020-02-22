<template>
  <h3>{{ subHeading }}</h3>
</template>

<script>
export default {
  name: "at-sub-header",
  props: ["subHeading"]
};
</script>

<style scoped>
h3 {
  font: bold 20px Futura;
  color: white;
  /* background-color: black; */
  /* padding: 5px; */
}
</style>
