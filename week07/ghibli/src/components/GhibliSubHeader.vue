<template>
  <h3>{{ subHeading }}</h3>
</template>

<script>
export default {
  name: "ghibli-sub-header",
  props: ["subHeading"]
};
</script>

<style scoped>
h3 {
  font: bold 15px;
  color: white;
  /* background-color: black; */
  /* padding: 5px; */
}
</style>
